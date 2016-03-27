package dk.speconsult.banking.domain;

import java.util.Date;

/**
 * Created by zapp on 27/03/16.
 */
public class Posting {
    private Amount amount;
    private String description;
    private Date depositDate;

    public Posting(Amount amount, String description, Date depositDate) {
        this.amount = amount;
        this.description = description;
        this.depositDate = depositDate;
    }

    public Amount getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getDepositDate() {
        return depositDate;
    }
}
