package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.java.String_Calculator;

/*
	Replace the class with your own step definition
   	classes.
 */
public class ExampleSteps {

	@Given("the string containing the numbers")
	public void thatTheTestIsSetup() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("the numbers are summed together")
	public void anActionIsPerformed() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("the program gives the sum as output")
	public void thisConditionIsTrue() {
		String_Calculator mine = new String_Calculator();
		int expected = 3;
		int actual = String_Calculator.calculate("//;\n1;2");
		assertEquals(expected, actual);
		// Write code here that turns the phrase above into concrete actions
	}
}
