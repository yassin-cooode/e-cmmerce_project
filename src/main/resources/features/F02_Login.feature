@smoke
Feature: F02_Login | users could use login functionality to use their accounts
#If email address test94@example.com is wrong run F01_Register first
  Scenario: user could login with valid email and password
    Given user go to login page
    When user enter his valid email test94@example.com and password P@ssw0rd
    And click login button
    Then user login to the system successfully

  Scenario: user could not login with invalid email and password
    Given user go to login page
    When user enter his invalid email wrong@example.com and password P@ssw0rd
    And click login button
    Then user could not login to the system