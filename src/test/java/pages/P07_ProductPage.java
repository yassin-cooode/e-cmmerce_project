package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P07_ProductPage {
    public static WebElement productSKU() {
        return Hooks.driver.findElement(By.xpath("//span[text()=\"SKU:\"]/following-sibling::span"));
    }
}
