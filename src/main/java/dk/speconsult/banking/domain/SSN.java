package dk.speconsult.banking.domain;

/**
 * Created by zapp on 27/03/16.
 */
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
