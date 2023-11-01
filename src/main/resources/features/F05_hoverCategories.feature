@smoke
Feature: hoverCategories Feature

  Scenario: Selection of home page categories
    Given Hover above any category in home page and select it or one of its sub categories
    Then The page title that has the same name of the selected category will be shown
