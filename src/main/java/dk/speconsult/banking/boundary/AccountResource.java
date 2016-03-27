package dk.speconsult.banking.boundary;

import dk.speconsult.banking.control.ViewAccounts;
import dk.speconsult.banking.control.ViewAccountsRequest;
import dk.speconsult.banking.domain.Account;

import javax.inject.Inject;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by zapp on 27/03/16.
 */
@Path("accounts")
public class AccountResource {

    @Inject
    ViewAccounts viewAccounts;

    public List<Account> fetchAccountsForUser(String ssn) {
        ViewAccountsRequest request = new ViewAccountsRequest(ssn);
        return viewAccounts.execute(request);
    }
}
