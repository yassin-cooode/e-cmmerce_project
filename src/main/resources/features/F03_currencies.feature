@smoke
Feature: Currencies Feature

  Scenario: Showing products price in Euro
    Given User selects Euro currency from the dropdown list on the top left of home page
    Then Every product price in home page should be by Euro currency