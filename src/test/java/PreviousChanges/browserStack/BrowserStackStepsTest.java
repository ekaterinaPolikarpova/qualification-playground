package PreviousChanges.browserStack;

import PreviousChanges.Utils.BaseHelper;
import io.qameta.allure.Step;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
public class BrowserStackStepsTest extends BaseHelper {

    @Step("Get actual title")
    public String getActualTitle(String url) {
        driver.get(url);
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    @Step("Print assert title")
    public void assertThatTrue() {
       Assert.assertTrue(true);
    }

    @Test
    public void browserStackStepsTest() {
        getActualTitle("https://www.wikipedia.org/");
        assertThatTrue();
    }
}
