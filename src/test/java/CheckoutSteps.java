import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        int bananaPrice = price;
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void i_checkout(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();}

    @Then("^the total price should be (\\d+)c$")
    public void the_total_price_should_be_c(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions    throw new PendingException();
    }
}
