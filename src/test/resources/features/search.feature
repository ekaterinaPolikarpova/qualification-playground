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
