@smoke
Feature: Follow Us Links

  Scenario: User opens facebook link
    Given User clicks on Facebook mark
    Then New window tap should be open in facebook url https://www.facebook.com/nopCommerce

  Scenario: User opens twitter link
    Given User clicks on Twitter mark
    Then New window tap should be open in twitter url https://twitter.com/nopCommerce

  Scenario: User opens youtube link
    Given User clicks on Youtube mark
    Then New window tap should be open in youtube url https://www.youtube.com/user/nopCommerce

  Scenario: User opens rss link
    Given User clicks on Rss mark
    Then New window tap should be open in rss url https://demo.nopcommerce.com/new-online-store-is-open