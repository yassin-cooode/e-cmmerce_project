@smoke
Feature: HomeSliders

  Scenario: First slider is clickable on home page
    Given Click on the first slider in the home page
    Then The url should change to new url containing the first slider

  Scenario: Second slider is clickable on home page
    Given Click on the second slider in the home page
    Then The url should change to new url containing the second slider