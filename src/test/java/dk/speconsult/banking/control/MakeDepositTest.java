package dk.speconsult.banking.control;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.Posting;
import dk.speconsult.banking.domain.SSN;
import dk.speconsult.banking.domain.repositories.AccountRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MakeDepositTest {

    /**
     *
     * This class will contain a large number of tests, measuring everything from interests to negative test scenarios.
     *
     */

    private MakeDeposit makeDeposit;
    private String depositDescription;

    @Before
    public void setUp() throws Exception {
        makeDeposit = new MakeDeposit();
        makeDeposit.accountRepository = new AccountRepository() {
            public void saveAccount(Account account) {
                Posting posting = account.getPostings().get(0);
                depositDescription = posting.getDescription();
            }

            public Account fetchAccount(AccountNumber acountNumber) {
                return new Account(acountNumber);
            }

            public List<Account> fetchAccountsForUser(SSN ssn) {
                return null;
            }
        };
    }

    @Test
    public void whenNull_thenException() {
        // some test....
    }

    @Test
    public void whenAnotherTest_thenSomeResult() {
        MakeDepositRequest request = new MakeDepositRequest("1234", 200l, "desc");
        makeDeposit.execute(request);
        assertEquals("desc", depositDescription);
    }
}