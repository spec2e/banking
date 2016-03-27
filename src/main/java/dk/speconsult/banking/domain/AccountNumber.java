package dk.speconsult.banking.domain;

/**
 * Created by zapp on 27/03/16.
 */
public class AccountNumber {

    private static final int MAX_LENGTH = 10;
    private String accountNumber;

    public AccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
