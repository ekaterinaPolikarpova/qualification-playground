package AppiumDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AndroidDriverHelper {

    private static AndroidDriver driver = null;


    public static AndroidDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    private static void initDriver() {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("R58N65Y0TBV")
                .setAppPackage("com.productmadness.hovmobile")
                .setPlatformName("Android")
                .setPlatformVersion("10")
                .setAutomationName("UiAutomator2");
//        options.setCapability("platformName", "Android");
//        options.setCapability("appium:platformVersion", "10");
//        options.setCapability("appium:deviceName", "SM-A105F");
//        options.setCapability("appium:udid", "R58N65Y0TBV");
//        options.setCapability("appium:automationName", "UiAutomator2");
//        options.setCapability("appium:appPackage", "com.google.android.youtube");

        try {
//            URL AppiumServerUrl = new URL("http://127.0.0.1:4723");
            driver = new AndroidDriver(new URL("http://localhost:4723/"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private AndroidDriverHelper() {
    }
}
