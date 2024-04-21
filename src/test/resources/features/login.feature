Feature: Sauce Login

  Background:
    Given User on landing page

  @Test1 @Smoke
  Scenario: Verify successful login with valid credentials
    When User enter valid credentials
    Then User navigated to products page