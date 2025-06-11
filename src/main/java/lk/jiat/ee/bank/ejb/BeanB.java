package lk.jiat.ee.bank.ejb;

import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.transaction.TransactionSynchronizationRegistry;

@Stateless
public class BeanB {

    @Resource
    private TransactionSynchronizationRegistry tsr;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void doAction() {

        System.out.println("BeanB.doAction() called");
        System.out.printf(String.valueOf(tsr.getTransactionKey()));

    }

}
