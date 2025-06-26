Feature: Wikipedia Search

  Background:
    Given the user opens the 'Wikipedia' page

  Scenario Outline: Search for a word on Wikipedia
    When the user enters a query "<title>" and clicks search
    Then the title contains "<title>"

    Examples:
      | title    |
      | Selenium |
      | France   |
      | Facebook |


Feature:  JavaScript Alerts Handling

  Scenario: Handle JavaScript prompt with different inputs
    Given I navigate to "https://the-internet.herokuapp.com/"
    When I click button "JavaScript Alert"
    Then the JavaScriptAlerts page is opened
    Given I have a person with name
      | name | age |
      | anna | 18  |
    When I click button "Click for JS Prompt"
    And I send the person's name to the alert and accept it
    Then The entered name "<name>" is displayed on the page
    When I click button "Click for JS Prompt"
    And I send the person's age to the alert and accept it
    Then The entered age <age> is displayed on the page


