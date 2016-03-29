package dk.speconsult.banking.control;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.AccountNumber;
import dk.speconsult.banking.domain.Amount;
import dk.speconsult.banking.domain.repositories.AccountRepository;

import javax.inject.Inject;

public class MakeDeposit {

    @Inject
    AccountRepository accountRepository;

    public void execute(MakeDepositRequest request) {
        AccountNumber accountNumber = new AccountNumber(request.getAccountNumber());
        Account account = accountRepository.fetchAccount(accountNumber);
        Amount amount = new Amount(request.getAmount());
        account.depositAmount(amount, request.getDescription());
        accountRepository.saveAccount(account);
    }
}
