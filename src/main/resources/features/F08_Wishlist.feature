@smoke
Feature: Wishlist

  Scenario: Adding product to wishlist
    Given User scroll down to below products
    When User add HTC One M8 product to wishlist
    Then A message with green background will appear indicating that product is added

  Scenario: Checking added products in wishlist
    Given User scroll down to below products
    When User add HTC One M8 product to wishlist
    And Waiting for the green message to disappear and click on wishlist link
    Then The added product will be shown in wishlist page and the quantity not zero