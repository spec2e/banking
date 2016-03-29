package dk.speconsult.banking.domain;

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
