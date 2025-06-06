package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static steps.Hooks.driver;

public class BaseStepsDefinition {

    @Given("the user opens the 'Wikipedia' page")
    public void openPage() {
        driver.get("https://www.wikipedia.org/");
    }

    @Then("the title contains {string}")
    public void assertThatTitleContainsExpectedWord(String expectedTitle) {
        String actualTitle = driver.getTitle();
        System.out.println("Title is: " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title does not match expected value.");
    }

    @When("the user enters a query {string} and clicks search")
    public void inputSearchWordAndClickSearch(String word) {
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(word);
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
    }

    @Then("the page opened with a title containing {string}")
    public void assertThatPageContainsExpected() {
        WebElement heading = driver.findElement(By.id("firstHeading"));
        String headingText = heading.getText();
        System.out.println("Heading: " + headingText);
        Assert.assertTrue(headingText.contains("Selenium"), "Page heading does not match expected value.");
    }

//
//    public void testWikipediaTitle() {
//        driver.get("https://www.wikipedia.org/");
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Wikipedia";
//        System.out.println("Title is: " + actualTitle);
//        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title does not match expected value.");
//    }
}
