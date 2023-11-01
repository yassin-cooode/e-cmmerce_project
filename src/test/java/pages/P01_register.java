package pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P01_register {
 public static WebElement gender() {
     return Hooks.driver.findElement(By.id("gender-male"));
 }
    public static WebElement firstName() {
        return Hooks.driver.findElement(By.name("FirstName"));
    }
    public static WebElement lastName() {
        return Hooks.driver.findElement(By.name("LastName"));
    }
    public static WebElement dateDay() {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public static WebElement dateMonth() {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public static WebElement dateYear() {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public static WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public static WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public static WebElement passwordConfirm() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public static WebElement registerBtn() {
        return Hooks.driver.findElement(By.id("register-button"));
    }
}
