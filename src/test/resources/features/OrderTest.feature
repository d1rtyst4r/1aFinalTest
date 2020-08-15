@OneATest
Feature: Search feature test
  Background:
    Given I open web https://1a.lv

  Scenario:
    Given 1a logo is visible
    When I accept cookies
    And I search macbook
    And I save product name and price
    And I confirm my Order
    And I logIn as guest
    And I fill form
    Then I check name and price
