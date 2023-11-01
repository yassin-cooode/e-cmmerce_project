package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Hooks {
   public static ChromeDriver driver ;
   public static SoftAssert softAssert = new SoftAssert();
    @Before
   public void open() {

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @After
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
