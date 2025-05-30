package lk.jiat.ee.bank.ejb;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionManagement;
import jakarta.ejb.TransactionManagementType;
import jakarta.inject.Inject;
import jakarta.transaction.*;
import lk.jiat.ee.bank.ejb.remote.AccountService;
import lk.jiat.ee.bank.ejb.remote.TransferService;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class TransferServiceBean implements TransferService {

    @EJB
    private AccountService accountService;

    @Inject
    private UserTransaction userTransaction;

    @Override
//    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void transferAmount(String sourceAccountNo, String destinationAccountNo, double amount) {

        try {
            userTransaction.begin();

            accountService.debitFromAccount(sourceAccountNo, amount);
            accountService.creditToAccount(destinationAccountNo, amount);

            userTransaction.commit();
        } catch (NotSupportedException | SystemException e){

        } catch (HeuristicRollbackException | HeuristicMixedException | RollbackException e) {

            try{
                userTransaction.rollback();
            } catch (SystemException ex) {
                throw new RuntimeException(ex);
            }

            throw new RuntimeException(e);
        }

    }

}
