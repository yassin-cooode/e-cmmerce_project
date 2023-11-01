package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P05_wishlist {
    public static WebElement prodQty() {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
