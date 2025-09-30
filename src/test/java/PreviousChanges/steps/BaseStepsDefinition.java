package PreviousChanges.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static PreviousChanges.steps.Hooks.driver;

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

    @Given("I navigate to {string}")
    public void navigateToWeb() {

    }

    @When("I click button {string}")
    public void clickButton() {

    }

    @Then("the JavaScriptAlerts page is opened")
    public void assertThatPageIsOpened() {

    }

    @Given("I have a person with name //d and age {int}")
    public void initPersonData(String name, int age) {
        Person person = new Person(name, age);
    }

    @When("I send the person's name to the alert and accept it")
    public void sendNameAndAccept(){

    }
    @And("I send the person's age to the alert and accept it")
    public void sendAge(){

    }

    @Then("The entered name {string} is displayed on the page")
    public void assertThatExpectedTextIsDisplayed(String name){

    }

    @Then("The entered age {int} is displayed on the page")
    public void assertThatExpectedAgeIsDisplayed(){

    }

//    Given I navigate to https://the-internet.herokuapp.com/
//    When I click on JavaScript Alert button
//    Then The JavaScriptAlerts page is opened
//    Given I have a person with name "<name>" and age "<age>"
//    When I click on Click for JS Prompt // исп 2 степ
//    And I send the person's name to the alert and accept it
//    Then The entered name text is displayed on the page
//    When I click on Click for JS Prompt/исп 2 степ
//    And I send the person's age to the alert and accept it/исп 7 степ
//    Then The entered age text is displayed on the page

}
