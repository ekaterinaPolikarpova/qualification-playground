package mobileTest.tests;

import mobileTest.base.BaseTest;
import mobileTest.screens.MainScreen;
import mobileTest.steps.AppSteps;
import org.testng.annotations.Test;

public class OpenAppTest extends BaseTest {
    @Test
    public void openAppTest() {
        AppSteps.get().launchApp();
        System.out.println("Current activity: " + driver.currentActivity());
        MainScreen.get().clickSearchButton();
        MainScreen.get().inputTextToSearchingLine();
    }
}
