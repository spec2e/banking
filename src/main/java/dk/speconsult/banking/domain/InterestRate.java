package dk.speconsult.banking.domain;

/**
 * Created by zapp on 27/03/16.
 */
public class InterestRate {

    private int lowerAmount;
    private int higherAmount;
    private int interest;

    public InterestRate(int lowerAmount, int higherAmount, int interest) {
        this.lowerAmount = lowerAmount;
        this.higherAmount = higherAmount;
        this.interest = interest;
    }

    public int getLowerAmount() {
        return lowerAmount;
    }

    public int getHigherAmount() {
        return higherAmount;
    }

    public int getInterest() {
        return interest;
    }
}
