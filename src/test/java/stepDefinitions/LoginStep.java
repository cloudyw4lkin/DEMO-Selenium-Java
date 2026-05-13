package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep extends BaseStep {

    private final LoginPage loginPage = new LoginPage(super.driver);

    @Given("The user navigates to {string}")
    public void navigateToWebsite(String websiteUrl) {
        this.loginPage.navigate(websiteUrl);
    }

    @When("second thing")
    public void secondThing() {

    }

    @Then("third thing")
    public void thirdThing() {

    }

}
