package AppiumDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class DriverHelper {
    public static void main(String[] args) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:udid", "R58N65Y0TBV");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:appPackage", "com.google.android.youtube");
        caps.setCapability("appium:appActivity", "com.google.android.youtube.HomeActivity");


        try {
            URL appiumServerUrl = new URL("http://127.0.0.1:4723");
            AndroidDriver driver = new AndroidDriver(appiumServerUrl, caps);
            driver.getBatteryInfo();
            System.out.println(driver.getBatteryInfo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}