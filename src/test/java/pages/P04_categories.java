package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P04_categories {
    public static WebElement pageTitle() {
        return Hooks.driver.findElement(By.tagName("h1"));
    }
}
