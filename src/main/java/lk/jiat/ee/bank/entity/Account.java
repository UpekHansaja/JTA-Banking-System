package lk.jiat.ee.bank.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
@NamedQueries({
        @NamedQuery(name = "Account.findByAccountNo", query = "SELECT a from Account a WHERE a.accountNo=:accountNo")
})
@Cacheable(value = true)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String accountNo;

    private double balance;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
