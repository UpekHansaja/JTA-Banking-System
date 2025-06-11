package lk.jiat.ee.bank.ejb;

import jakarta.annotation.Resource;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.transaction.TransactionSynchronizationRegistry;

@Stateless
public class BeanA {

    @EJB
    private BeanB beanB;

    @Resource
    private TransactionSynchronizationRegistry tsr;

    public void doAction() {

        System.out.println("BeanA.doAction() called");

        tsr.setRollbackOnly();

        System.out.printf(String.valueOf(tsr.getTransactionKey()));
        beanB.doAction();

    }

}
