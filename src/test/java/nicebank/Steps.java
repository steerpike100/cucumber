//package nicebank;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Steps {
//
//    @Given("^I have deposited \\$(\\d+) in my account$")
//    public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
//        new Account(amount);
//    }
//
//    @When("^I request \\$(\\d+)$")
//    public void iRequest$(int arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^\\$(\\d+) should be dispensed$")
//    public void $ShouldBeDispensed(int arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Given("^I have \\$(\\d+) in my account$")
//    public void iHave$InMyAccount(int amount) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        new Account(amount);
//    }
//
//    @Given("^I have \"([^\"]*)\" in my account$")
//    public void iHaveInMyAccount(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//
//    class Account {
//        public Account(int openingBalance) {
//        }
//    }
//}
//
//
