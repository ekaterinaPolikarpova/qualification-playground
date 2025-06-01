package mobileTest;

import org.testng.annotations.Test;

public class LaunchAppWithJsonCapsTest extends BaseTest {
    @Test
    public void openAppTest() {
        System.out.println("Current activity: " + driver.currentActivity());
    }
}
