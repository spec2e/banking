package dk.speconsult.banking.domain;

/**
 * Created by zapp on 27/03/16.
 */
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
