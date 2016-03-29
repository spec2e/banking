package dk.speconsult.banking.domain;

public class Amount {
    private long amount;
    private Currency currency;

    public Amount(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }


}
