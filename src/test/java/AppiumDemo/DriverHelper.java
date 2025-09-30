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
        caps.setCapability("platformVersion", "13");
        caps.setCapability("deviceName", "SM-G960U1");
        caps.setCapability("udid", "R58N65Y0TBV");
        caps.setCapability("automationName", "UiAutomator2");

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