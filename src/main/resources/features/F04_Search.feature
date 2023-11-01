@smoke
Feature: Search Feature

  Scenario Outline: user could search using product name
    Given user type product name <product name> in search bar
    When user clicks on search button
    Then A new page will open with new url contains the search results and each result contains the search word <product name>
    Examples:
      | product name |
      | book         |
      | laptop       |
      | nike         |

  Scenario Outline: user could search with sku
    Given user type serial number <SKU> in search bar
    When user clicks on search button
    And click on the product in search result
    Then the selected product sku must match the searched sku <SKU>
    Examples:
      | SKU       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |