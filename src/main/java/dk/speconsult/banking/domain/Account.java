package dk.speconsult.banking.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    AccountNumber accountNumber;

    Customer customer;

    AccountTerms accountTerms;

    List<Posting> postings = new ArrayList<Posting>();

    public Account(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositAmount(Amount amount, String description) {
        // build a Deposit object...
        // add it to the deposits
        // increments then interests
        Posting posting = new Posting(amount, description, new Date());
        postings.add(posting);
    }

    public long calculateInterest() {
        return -1;
    }

    public long calculateBalance() {
        return -1;
    }

    public List<Posting> getPostings() {
        return postings;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountTerms getAccountTerms() {
        return accountTerms;
    }
}
