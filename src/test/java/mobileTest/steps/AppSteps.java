package mobileTest.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import mobileTest.base.BaseSteps;
import mobileTest.utils.DriverHelper;

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
}