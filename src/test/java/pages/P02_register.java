package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P02_register {
    public static WebElement successMsg() {
        return Hooks.driver.findElement(By.className("result"));
    }
    public static String color() {
        return Hooks.driver.findElement(By.className("result")).getCssValue("color");
    }
}
