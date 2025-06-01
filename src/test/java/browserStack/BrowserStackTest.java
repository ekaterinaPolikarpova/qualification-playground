package browserStack;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTest {

    public static final String USERNAME = "ekaterina_r2J6mp";
    public static final String ACCESS_KEY = "HkTUFEYTgV7XP3nq3xxy";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        MutableCapabilities browserstackOptions = new MutableCapabilities();
        browserstackOptions.setCapability("os", "Windows");
        browserstackOptions.setCapability("osVersion", "11");
        browserstackOptions.setCapability("sessionName", "Wikipedia Title Test");

        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "latest");
        options.setCapability("bstack:options", browserstackOptions);

        driver = new RemoteWebDriver(
                new URL(URL),
                options
        );
    }

    @Test
    public void testWikipediaTitle() {
        driver.get("https://www.wikipedia.org/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wikipedia";
        System.out.println("Title is: " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title does not match expected value.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}