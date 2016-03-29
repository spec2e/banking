package dk.speconsult.banking.control;

public class MakeDepositRequest {

    private String accountNumber;
    private long amount;
    private String description;

    public MakeDepositRequest(String accountNumber, long amount, String description) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.description = description;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
