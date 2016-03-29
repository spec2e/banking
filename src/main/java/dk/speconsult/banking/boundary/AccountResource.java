package dk.speconsult.banking.boundary;

import dk.speconsult.banking.control.*;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("accounts")
public class AccountResource {

    @Inject
    MakeDeposit makeDeposit;

    @Inject
    ViewAccounts viewAccounts;

    @GET
    @Path("{ssn}")
    @Consumes("application/json")
    @Produces("application/json")
    public List<AccountDTO> fetchAccountsForUser(@PathParam("ssn") String ssn) {
        ViewAccountsRequest request = new ViewAccountsRequest(ssn);
        return viewAccounts.execute(request);
    }

    @POST
    @Path("account/{id}")
    @Consumes("application/json")
    public void makeDeposit(@PathParam("id") String accountNumber, long amount, String description) {
        MakeDepositRequest request = new MakeDepositRequest(accountNumber, amount, description);
        makeDeposit.execute(request);
    }
}
