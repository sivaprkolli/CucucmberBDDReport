package nclh.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User on landing page")
    public void user_on_landing_page() {
        System.out.println("User on landing page");
    }

    @When("User enter valid credentials")
    public void user_enter_valid_credentials() {
        System.out.println("User enter valid credentials");
    }
    @Then("User navigated to products page")
    public void user_navigated_to_products_page() {
        System.out.println("User navigated to products page");
    }

}
