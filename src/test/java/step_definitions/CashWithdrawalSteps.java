package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Account;

import static org.junit.Assert.assertEquals;

public class CashWithdrawalSteps {

    Account account;

    //CASH WITHDRAWAL
    @Given("^I have \\$(\\d+) in my account$")
    public void iHaveInMyAccount(int amount) throws Throwable {
        account = new Account(amount);
    }

    @When("^I choose to withdraw the fixed amount of \\$(\\d+)$")
    public void iChooseToWithdrawTheFixedAmountOf(int withdrawal) throws Throwable {
        account.withdraw(withdrawal);
    }

    @Then("^I should receive \\$(\\d+) cash$")
    public void iShouldReceiveCash(int receive) throws Throwable {
       account.received(receive);
    }

//    @Then("^I should receive ([^\"]*)$")
//    public void iShouldReceive(String outcome) throws Throwable {
//        int balance = account.withdraw();
//        assertEquals(outcome, "receive $" + balance + "");
//    }

    @Then("^the balance of my account should be \\$(\\d+)$")
    public void theBalanceOfMyAccountShouldBe(int balance) throws Throwable {
        assertEquals(balance, account.remaining());
    }


    @Given("^I have authenticated with the correct PIN$")
    public void iHaveAuthenticatedWithTheCorrectPIN() throws Throwable {
        authenticateWithPIN();
    }

    public void authenticateWithPIN(){

    }
}
