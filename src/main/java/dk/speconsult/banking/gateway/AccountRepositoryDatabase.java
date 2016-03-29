package dk.speconsult.banking.gateway;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.SSN;
import dk.speconsult.banking.domain.repositories.AccountRepository;

import java.util.List;

public class AccountRepositoryDatabase implements AccountRepository {


    public List<Account> fetchAccountsForUser(SSN ssn) {
        return null;
    }

    public Account fetchAccount(AccountNumber acountNumber) {
        return null;
    }

    public void saveAccount(Account account) {

    }
}
