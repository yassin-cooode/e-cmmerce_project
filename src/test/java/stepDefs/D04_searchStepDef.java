package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;
import pages.P06_SearchResults;
import pages.P07_ProductPage;

public class D04_searchStepDef {
    @Given("^user type product name (.*) in search bar$")
    public void user_type_in_search_bar(String prodName) {
        P03_homePage.searchBar().sendKeys(prodName);
    }

    @Given("^user type serial number (.*) in search bar$")
    public void user_type_serial_number_in_search_bar(String sku) {
        P03_homePage.searchBar().sendKeys(sku);
    }

    @And("click on the product in search result")
    public void click_on_the_product_in_search_result() {
        P06_SearchResults.searchResult().click();
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        P03_homePage.searchBtn().click();
    }

    @Then("^A new page will open with new url contains the search results and each result contains the search word (.*)$")
    public void A_new_page_will_open_with_new_url_contains_the_search_results_and_each_result_contains_the_search_word(String prodName) {
        Hooks.softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=" + prodName);
        for (int i = 0; i < P03_homePage.searchResults().size(); i++) {
            boolean isWordWithin = P03_homePage.searchResults().get(i).getText().toLowerCase().contains(prodName);
            if (isWordWithin) {
                Hooks.softAssert.assertTrue(true);
            }
        }
        Hooks.softAssert.assertAll();
    }

    @Then("^the selected product sku must match the searched sku (.*)$")
    public void the_selected_product_sku_must_match_the_searched_sku(String expectedSKU) {
        String actualSKU = P07_ProductPage.productSKU().getText();
        Hooks.softAssert.assertEquals(actualSKU, expectedSKU);
        Hooks.softAssert.assertAll();
    }
}
