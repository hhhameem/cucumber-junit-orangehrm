package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import setup.Setup;

public class LoginStepDefinitions extends Setup {
    LoginPage loginPage;
    @Given("User visits the website")
    public void user_visits_the_website() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("User inputs invalid {string} and {string}")
    public void user_inputs_invalid_and(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.doLogin(username, password);
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
       loginPage = new LoginPage(driver);
       Assert.assertTrue(loginPage.alertText.isDisplayed());
       driver.close();
    }

}
