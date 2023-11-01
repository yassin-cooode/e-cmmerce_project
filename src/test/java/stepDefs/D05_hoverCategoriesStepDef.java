package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.P03_homePage;
import pages.P04_categories;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    Random random = new Random();
    int anyindex = random.nextInt(7);

    @Given("Hover above any category in home page and select it or one of its sub categories")
    public void Hover_above_any_category_in_home_page_and_select_it_or_one_of_its_sub_categories() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(P03_homePage.mainCategory().get(anyindex)).perform();

    }

    @Then("The page title that has the same name of the selected category will be shown")
    public void The_page_title_that_has_the_same_name_of_the_selected_category_will_be_shown() {

        WebElement maincategory = P03_homePage.mainCategory().get(anyindex);
        List<WebElement> subCategory = maincategory.findElements(By.cssSelector("ul li"));

        if (subCategory.isEmpty()) {
            //If no sub category select the category itself
            String expectTitle = maincategory.findElement(By.cssSelector("a")).getText().toLowerCase().trim();
            maincategory.click();
            Hooks.softAssert.assertEquals(P04_categories.pageTitle().getText().toLowerCase().trim(), expectTitle);

        } else if (!subCategory.isEmpty()) {
            //If there are sub categories Select any sub category
            WebElement sub = subCategory.get(random.nextInt(3));
            String expectTitle = sub.findElement(By.tagName("a")).getText().toLowerCase().trim();
            sub.click();
            Hooks.softAssert.assertEquals(P04_categories.pageTitle().getText().toLowerCase().trim(), expectTitle);
        }

        Hooks.softAssert.assertAll();
    }
}
