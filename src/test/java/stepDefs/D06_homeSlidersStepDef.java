package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.P03_homePage;

import java.time.Duration;

public class D06_homeSlidersStepDef {

    @Given("Click on the first slider in the home page")
    public void Click_on_the_first_slider_in_the_home_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.attributeContains(P03_homePage.secondSlide(), "display", "none"));
        P03_homePage.firstSlide().click();
    }

    @Given("Click on the second slider in the home page")
    public void Click_on_the_second_slider_in_the_home_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.attributeContains(P03_homePage.firstSlide(), "display", "none"));
        P03_homePage.secondSlide().click();
    }

    @Then("The url should change to new url containing the first slider")
    public void The_url_should_change_to_new_url_containing_the_first_slider() {
        String expectUrl = "https://demo.nopcommerce.com/galaxy-s22-ultra";
        String actualUrl = Hooks.driver.getCurrentUrl();
        Hooks.softAssert.assertEquals(actualUrl, expectUrl , "F06_homeSliders -> First slider");
        Hooks.softAssert.assertAll();
    }

    @Then("The url should change to new url containing the second slider")
    public void The_url_should_change_to_new_url_containing_the_second_slider() {
        String expectUrl = "https://demo.nopcommerce.com/iphone-14-pro";
        String actualUrl = Hooks.driver.getCurrentUrl();
        Hooks.softAssert.assertEquals(actualUrl, expectUrl, "F06_homeSliders -> Second slider");
        Hooks.softAssert.assertAll();
    }
}
