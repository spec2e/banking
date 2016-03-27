package dk.speconsult.banking.domain;

/**
 * Created by zapp on 27/03/16.
 */
public class Currency {

    String currency;
    int exchangeRate;

    public Currency(String currency, int exchangeRate) {
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrency() {
        return currency;
    }

    public int getExchangeRate() {
        return exchangeRate;
    }
}
