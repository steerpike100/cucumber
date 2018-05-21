package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class Boardsteps {

    private List<List<String>> board;

    @Given("^a board like this:$")
    public void aBoardLikeThis(DataTable table) throws Throwable {
        this.board = table.raw();
        throw new PendingException();
    }

    @When("^player x plays in row (\\d+), column (\\d+)$")
    public void playerXPlaysInRowColumn(int arg1, int arg2) throws Throwable {
        System.out.println(board.toString());
        throw new PendingException();
    }

    @Then("^the board should look like this:$")
    public void theBoardShouldLookLikeThis(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

}
