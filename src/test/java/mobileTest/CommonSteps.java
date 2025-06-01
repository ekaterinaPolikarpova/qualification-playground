package mobileTest;

import io.qameta.allure.Step;
import org.testng.Assert;

public class CommonSteps {

    @Step("Asserting that it works")
    public void assertItWorks() {
        Assert.assertTrue(true);
    }

    @Step("Assert something else")
    public void assertSomething() {
        Assert.assertFalse(false);
    }

}
