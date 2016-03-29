package dk.speconsult.banking.domain;

public class SSN {
    private static final int MAX_LENGTH = 10;
    private String ssn;

    public SSN(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
}
