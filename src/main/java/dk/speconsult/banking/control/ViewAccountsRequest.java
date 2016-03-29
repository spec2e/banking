package dk.speconsult.banking.control;

public class ViewAccountsRequest {
    String ssn;

    public ViewAccountsRequest(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
}
