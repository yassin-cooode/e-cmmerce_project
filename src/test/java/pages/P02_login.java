package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P02_login {
    public static WebElement emailField() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public static WebElement passwordField() {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public static WebElement loginBtn() {
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public static WebElement errorMsg() {
        return Hooks.driver.findElement(By.className("message-error"));
    }
}
