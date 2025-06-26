package mobileTest.steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import mobileTest.base.BaseSteps;
import mobileTest.utils.DriverHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;

import java.time.Duration;

public class AppSteps extends BaseSteps {

    public AndroidDriver driver;

    private static final ThreadLocal<AppSteps> stepsInstanceHolder = new InheritableThreadLocal<>();

    public static AppSteps get() {
        return (AppSteps) BaseSteps.get(stepsInstanceHolder, AppSteps.class);
    }

    @Step("Launching the application")
    public void launchApp() {
        DriverHelper.get().getDriver().activateApp("org.joinmastodon.android");
    }


    public void scrollToPoint() {
        Dimension screenSize = driver.manage().window().getSize();
        int x = screenSize.getWidth();   // ширина (ось X)
        int y = screenSize.getHeight();  // высота (ось Y)
        int startX = (int) (x * 0.8);
        int startY = (int) (y * 0.8);
        int endX = (int) (x * 0.2);
        int endY = (int) (y * 0.2);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY)).
                waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

    }
}

