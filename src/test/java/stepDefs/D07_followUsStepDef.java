package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P03_homePage;

import java.awt.*;
import java.util.ArrayList;

public class D07_followUsStepDef {
    @Given("User clicks on Facebook mark")
    public void User_clicks_on_Facebook_mark() {
        P03_homePage.faceMark().click();
    }

    @Given("User clicks on Twitter mark")
    public void User_clicks_on_Twitter_mark() {
        P03_homePage.twittMark().click();
    }

    @Given("User clicks on Youtube mark")
    public void User_clicks_on_Youtube_mark() {
        P03_homePage.youtubeMark().click();
    }

    @Given("User clicks on Rss mark")
    public void User_clicks_on_Rss_mark() {
        P03_homePage.rssMark().click();
    }

    @Then("^New window tap should be open in facebook url (.*)$")
    public void New_window_tap_should_be_open_in_facebook_url(String expectUrl) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        String actualUrl = Hooks.driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        Hooks.driver.close();
        Hooks.softAssert.assertEquals(actualUrl, expectUrl);
        Hooks.softAssert.assertAll();
    }

    @Then("^New window tap should be open in twitter url (.*)$")
    public void New_window_tap_should_be_open_in_twitter_url(String expectUrl) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        String actualUrl = Hooks.driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        Hooks.driver.close();
        Hooks.softAssert.assertEquals(actualUrl, expectUrl);
        Hooks.softAssert.assertAll();
    }

    @Then("^New window tap should be open in youtube url (.*)$")
    public void New_window_tap_should_be_open_in_youtube_url(String expectUrl) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        String actualUrl = Hooks.driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        Hooks.driver.close();
        Hooks.softAssert.assertEquals(actualUrl, expectUrl);
        Hooks.softAssert.assertAll();
    }

    @Then("^New window tap should be open in rss url (.*)$")
    public void New_window_tap_should_be_open_in_rss_url(String expectUrl) {
        String actualUrl = Hooks.driver.getCurrentUrl();
        Hooks.softAssert.assertEquals(actualUrl, expectUrl , "F07_followUs -> User opens rss Link");
        Hooks.softAssert.assertAll();
    }
}
