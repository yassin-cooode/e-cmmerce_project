package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P06_SearchResults {
    public static WebElement searchResult() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"] a"));
    }
}
