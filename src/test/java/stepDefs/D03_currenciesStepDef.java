package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.P03_homePage;

public class D03_currenciesStepDef {
    @Given("User selects Euro currency from the dropdown list on the top left of home page")
    public void User_selects_Euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page() {
        Select select = new Select(P03_homePage.currency());
        select.selectByVisibleText("Euro");
    }

    @Then("Every product price in home page should be by Euro currency")
    public void Every_product_price_in_home_page_should_be_by_Euro_currency() {
        for (int i = 0; i < P03_homePage.homeProducts().size(); i++) {
            boolean isPriceEuro = P03_homePage.homeProducts().get(i).getText().contains("€");
            Hooks.softAssert.assertTrue(isPriceEuro);
        }
        Hooks.softAssert.assertAll();
    }
}
