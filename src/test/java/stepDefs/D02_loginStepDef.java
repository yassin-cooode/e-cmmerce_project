package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P02_login;

public class D02_loginStepDef {

    @Given("user go to login page")
    public void user_go_to_login_page() {
        P03_homePage.loginLink().click();
    }

    @When("^user enter his valid email (.*) and password (.*)$")
    public void user_enter_his_valid_email_and_password(String email, String pass) {
        P02_login.emailField().sendKeys(email);
        P02_login.passwordField().sendKeys(pass);
    }

    @When("^user enter his invalid email (.*) and password (.*)$")
    public void user_enter_his_invalid_email_and_password(String email, String pass) {
        P02_login.emailField().sendKeys(email);
        P02_login.passwordField().sendKeys(pass);
    }

    @And("click login button")
    public void click_login_button() {
        P02_login.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {

        Hooks.softAssert.assertTrue(P03_homePage.myAccLink().isDisplayed());
        Hooks.softAssert.assertEquals(P03_homePage.homeUrl(), "https://demo.nopcommerce.com/");
        Hooks.softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        Hooks.softAssert.assertTrue(P02_login.errorMsg().isDisplayed());
        String actualColor = P02_login.errorMsg().getCssValue("color");
        String expectedColor = "rgba(228, 67, 75, 1)";
        Hooks.softAssert.assertEquals(actualColor, expectedColor);
        Hooks.softAssert.assertAll();

    }
}
