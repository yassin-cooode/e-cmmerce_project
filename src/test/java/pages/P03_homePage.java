package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class P03_homePage {
    public static WebElement registerLink() {
        return Hooks.driver.findElement(By.linkText("Register"));
    }

    public static WebElement loginLink() {
        return Hooks.driver.findElement(By.linkText("Log in"));
    }

    public static WebElement myAccLink() {
        return Hooks.driver.findElement(By.linkText("My account"));
    }

    public static String homeUrl() {
        return Hooks.driver.getCurrentUrl();
    }

    public static WebElement currency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public static List<WebElement> homeProducts() {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"item-box\"] .actual-price"));
    }
    public static WebElement searchBar() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public static WebElement searchBtn() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }
    public static List<WebElement> searchResults() {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"item-box\"] .product-title a"));
    }
    public static List<WebElement> mainCategory() {
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }
    public static WebElement firstSlide() {
        return Hooks.driver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]")).get(0);
    }
    public static WebElement secondSlide() {
        return Hooks.driver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]")).get(1);
    }
    public static WebElement faceMark() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"networks\"] li a")).get(0);
    }
    public static WebElement twittMark() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"networks\"] li a")).get(1);
    }
    public static WebElement youtubeMark() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"networks\"] li a")).get(3);
    }
    public static WebElement rssMark() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"networks\"] li a")).get(2);
    }
    public static WebElement htcWishlist() {
        return Hooks.driver.findElements(By.cssSelector("button[title=\"Add to wishlist\"]")).get(2);
    }
    public static WebElement wishlistMsg() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public static WebElement wishListLink() {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }
}
