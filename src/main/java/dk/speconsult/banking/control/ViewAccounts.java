package dk.speconsult.banking.control;

import dk.speconsult.banking.domain.Account;
import dk.speconsult.banking.domain.SSN;
import dk.speconsult.banking.domain.repositories.AccountRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class ViewAccounts {

    @Inject
    AccountRepository accountRepository;

    public List<AccountDTO> execute(ViewAccountsRequest request) {
        SSN ssn = new SSN(request.getSsn());
        List<Account> accounts = accountRepository.fetchAccountsForUser(ssn);
        return convertToDTO(accounts);
    }

    private List<AccountDTO> convertToDTO(List<Account> accounts) {
        return accounts.stream()
                .map((account) ->
                        new AccountDTO(
                                account.getAccountNumber().getAccountNumber(),
                                account.calculateBalance()
                        ))
                .collect(Collectors.toList());
    }
}
