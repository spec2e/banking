package dk.speconsult.banking.domain.repositories;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.SSN;

import java.util.List;


public interface AccountRepository {

    void saveAccount(Account account);

    Account fetchAccount(AccountNumber acountNumber);

    List<Account> fetchAccountsForUser(SSN ssn);


}
