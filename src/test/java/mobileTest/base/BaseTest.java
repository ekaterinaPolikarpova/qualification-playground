package mobileTest.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import mobileTest.utils.DriverHelper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected AndroidDriver driver;
    private final AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    @BeforeTest
    public void setUp() {
        service.start();
        driver = DriverHelper.get().getDriver();
        driver.isDeviceLocked();
    }

    @AfterTest
    public void tearDown() {
        DriverHelper.get().getDriver().quit();
        service.stop();
    }
}
