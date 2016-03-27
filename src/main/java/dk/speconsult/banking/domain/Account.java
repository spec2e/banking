package dk.speconsult.banking.domain;

import java.util.List;

/**
 * Created by zapp on 27/03/16.
 */
public class Account {

    AccountNumber accountNumber;

    Customer customer;

    AccountTerms accountTerms;

    List<Posting> postings;


    public void depositAmount(Amount amount, String description) {
        // build a Deposit object...
        // add it to the deposits
        // increments then interests
    }

    public long calculateInterest() {
        return -1;
    }


}
