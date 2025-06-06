package browserStack;

import org.testng.Assert;
import org.testng.annotations.Test;

import static browserStack.BaseHelper.driver;

public class BrowserStackTest {

    @Test
    public void testWikipediaTitle() {
        driver.get("https://www.wikipedia.org/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wikipedia";
        System.out.println("Title is: " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title does not match expected value.");
    }
}