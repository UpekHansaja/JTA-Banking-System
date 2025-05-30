package lk.jiat.ee.bank.ejb.remote;

import jakarta.ejb.Local;

@Local
public interface LogInService {

    boolean login(String email, String password);

}
