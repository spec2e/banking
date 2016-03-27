package dk.speconsult.banking.domain;

import java.util.List;

/**
 * Created by zapp on 27/03/16.
 */
public class AccountTerms {

    private List<InterestRate> rates;

    public void addInterestRate(InterestRate interestRate) {
        rates.add(interestRate);
    }

    public List<InterestRate> getRates() {
        return rates;
    }
}
