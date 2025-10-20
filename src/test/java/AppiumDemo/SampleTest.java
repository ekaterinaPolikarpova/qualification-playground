package AppiumDemo;// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SampleTest {

    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        var options = new UiAutomator2Options()
                .setUdid("R58N65Y0TBV")
                .setPlatformVersion("13")
                .setNewCommandTimeout(Duration.ofSeconds(3600));

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, options);
    }

    @Test
    public void sampleTest() {
        driver.activateApp("com.productmadness.hovmobile");
        System.out.println("Тест запущен");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}