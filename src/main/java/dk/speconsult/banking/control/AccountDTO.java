package dk.speconsult.banking.control;

/**
 * Created by zapp on 27/03/16.
 */
public class AccountDTO {

    String accountNo;
    long balance;

    public AccountDTO(String accountNo, long balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public long getBalance() {
        return balance;
    }
}
