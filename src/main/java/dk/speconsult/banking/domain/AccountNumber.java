package dk.speconsult.banking.domain;

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
