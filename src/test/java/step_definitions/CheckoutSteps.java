//package step_definitions;
//
//import cucumber.api.java.en.*;
//import cucumber.api.PendingException;
//import implementation.Checkout;
//
//import java.util.Objects;
//
//import static org.junit.Assert.*;
//
//public class CheckoutSteps {
//
//    Checkout checkout;
//    String fruitName;
//    int applePrice = 0;
//    int bananaPrice = 0;
//
//    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
//    public void thePriceOfAIsC(String name, int price) throws Throwable {
//        fruitName = name;
//        if(Objects.equals(fruitName, "banana")) {
//            bananaPrice = price;
//        }else if (Objects.equals(fruitName, "apple")) {
//            applePrice = price;
//        }
//    }
//
//    @When("^I checkout (\\d+) \"([^\"]*)\"$")
//    public void iCheckout(int itemCount, String itemName) throws Throwable {
//        checkout = new Checkout();
//        checkout.add(itemCount, applePrice);
//        checkout.add(itemCount, bananaPrice);
//    }
//
//    @Then("^the total price should be (\\d+)c$")
//    public void theTotalPricShouldBeC(int total) throws Throwable {
//        assertEquals(total, checkout.total());
//    }
//
//}
