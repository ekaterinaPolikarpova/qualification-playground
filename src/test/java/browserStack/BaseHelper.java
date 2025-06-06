package browserStack;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseHelper {

    public static final String USERNAME = "ekaterina_r2J6mp";
    public static final String ACCESS_KEY = "HkTUFEYTgV7XP3nq3xxy";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        MutableCapabilities browserstackOptions = new MutableCapabilities();
        browserstackOptions.setCapability("os", "OS X");
        browserstackOptions.setCapability("osVersion", "Sonoma");
        browserstackOptions.setCapability("sessionName", "Wikipedia Title Test");

        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "latest");
        options.setCapability("bstack:options", browserstackOptions);

        driver = new RemoteWebDriver(
                new URL(URL),
                options
        );
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}