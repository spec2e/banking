package dk.speconsult.banking.dk.speconsult.banking.gateway;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.SSN;
import dk.speconsult.banking.interfaces.AccountDatabase;

import java.util.List;

/**
 * Created by zapp on 27/03/16.
 */
public class AccountDatabaseGatewayImpl implements AccountDatabase {


    public List<Account> fetchAccountsForUser(SSN ssn) {
        return null;
    }

    public Account fetchAccount(AccountNumber acountNumber) {
        return null;
    }

    public void saveAccount(Account account) {

    }
}
