package dk.speconsult.banking.control;

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
