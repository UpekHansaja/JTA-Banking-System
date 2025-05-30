package lk.jiat.ee.bank.ejb.remote;

import lk.jiat.ee.bank.entity.Account;

import java.math.BigDecimal;

public interface AccountService {

    void creditToAccount(String accountNo, double amount);

    void debitFromAccount(String accountNo, double amount);

}
