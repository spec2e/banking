package dk.speconsult.banking.interfaces;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.SSN;

import java.util.List;

/**
 * Created by zapp on 27/03/16.
 */
public interface AccountDatabase {

    void saveAccount(Account account);

    Account fetchAccount(AccountNumber acountNumber);

    List<Account> fetchAccountsForUser(SSN ssn);


}
