package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.P03_homePage;
import pages.P05_wishlist;

import java.time.Duration;

public class D08_WishlistStepDef {
    @Given("User scroll down to below products")
    public void User_scroll_down_to_below_products() {
        JavascriptExecutor JavascriptExecutor = (org.openqa.selenium.JavascriptExecutor) Hooks.driver;
        JavascriptExecutor.executeScript("scrollBy(0 , 1000)");
    }

    @When("User add HTC One M8 product to wishlist")
    public void User_add_HTC_One_M8_product_to_wishlist() {
        P03_homePage.htcWishlist().click();
    }

    @And("Waiting for the green message to disappear and click on wishlist link")
    public void Waiting_for_the_green_message_to_disappear_and_click_wishlist_link() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.invisibilityOf(P03_homePage.wishlistMsg()));
        P03_homePage.wishListLink().click();
    }

    @Then("A message with green background will appear indicating that product is added")
    public void A_message_with_green_background_will_appear_indicating_that_product_is_added() {
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = P03_homePage.wishlistMsg().getCssValue("background-color");
        Hooks.softAssert.assertTrue(P03_homePage.wishlistMsg().isDisplayed());
        Hooks.softAssert.assertEquals(actualColor, expectedColor);
        Hooks.softAssert.assertAll();
    }

    @Then("The added product will be shown in wishlist page and the quantity not zero")
    public void The_added_product_will_be_shown_in_wishlist_page_and_the_quantity_not_zero() {
        int qty = Integer.parseInt(P05_wishlist.prodQty().getAttribute("value"));
        boolean isQtyNonZero = qty > 0;
        Hooks.softAssert.assertTrue(isQtyNonZero);
        Hooks.softAssert.assertAll();
    }
}
