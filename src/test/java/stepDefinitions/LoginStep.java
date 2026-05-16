package stepDefinitions;

import io.cucumber.java.en.And;
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

    @When("The user types {string} as username")
    public void secondThing(String username) {
        this.loginPage.inputUsername(username);
    }

    @And("The user types {string} as password")
    public void thirdThing(String password) {
        this.loginPage.inputPassword(password);
    }

    @Then("The user clicks login button")
    public void thirdThing() {
        this.loginPage.clickLoginButton();
    }

}
