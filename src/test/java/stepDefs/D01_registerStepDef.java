package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P01_register;
import pages.P02_register;

import java.util.Random;

public class D01_registerStepDef {

    @Given("user go to register page")
    public void user_go_to_register_page() {
        P03_homePage.registerLink().click();
    }

    @When("user select gender type")
    public void user_select_gender_type() {
        P01_register.gender().click();
    }

    @And("^user enter first name (.*) and last name (.*)$")
    public void user_enter_first_name_and_last_name(String fName, String lName) {
        P01_register.firstName().sendKeys(fName);
        P01_register.lastName().sendKeys(lName);
    }

    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select select = new Select(P01_register.dateDay());
        select.selectByVisibleText("15");
        Select select1 = new Select(P01_register.dateMonth());
        select1.selectByVisibleText("August");
        Select select2 = new Select(P01_register.dateYear());
        select2.selectByVisibleText("1994");
    }

    @And("^user enter email (.*) field$")
    public void user_enter_email_field(String email) {
        P01_register.email().sendKeys(email);
    }

    @And("^user fills Password fields (.*) (.*)$")
    public void user_fills_Password_fields(String pass, String passConfirm) {
        P01_register.password().sendKeys(pass);
        P01_register.passwordConfirm().sendKeys(passConfirm);
    }

    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        P01_register.registerBtn().click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        Hooks.softAssert.assertTrue(P02_register.successMsg().isDisplayed());
        Hooks.softAssert.assertEquals("rgba(76, 177, 124, 1)", P02_register.color());
        Hooks.softAssert.assertAll();
    }
}
