package dk.speconsult.banking.control;

/**
 * Created by zapp on 27/03/16.
 */
public class ViewAccountsRequest {
    String ssn;

    public ViewAccountsRequest(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
}
