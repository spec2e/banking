package dk.speconsult.banking.control;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.Amount;
import dk.speconsult.banking.interfaces.AccountDatabase;

import javax.inject.Inject;

/**
 * Created by zapp on 27/03/16.
 */
public class MakeDeposit {

    @Inject
    AccountDatabase accountDatabase;

    public void execute(MakeDepositRequest request) {
        AccountNumber accountNumber = new AccountNumber(request.getAccountNumber());
        Account account = accountDatabase.fetchAccount(accountNumber);
        Amount amount = new Amount(request.getAmount());
        account.depositAmount(amount, request.getDescription());
        accountDatabase.saveAccount(account);
    }
}
