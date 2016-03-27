package dk.speconsult.banking.control;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.SSN;
import dk.speconsult.banking.interfaces.AccountDatabase;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by zapp on 27/03/16.
 */
public class ViewAccounts {

    @Inject
    AccountDatabase accountDatabase;

    public List<Account> execute(ViewAccountsRequest request) {
        SSN ssn = new SSN(request.getSsn());
        List<Account> accounts = accountDatabase.fetchAccountsForUser(ssn);
        return accounts;
    }
}
