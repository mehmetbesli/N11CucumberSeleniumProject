Feature: N11 project using cucumber and selenium
  This feature covers the operations we do after logging in to the site

  Scenario: Go to the website and doing some operation
    Given I navigate to the login page
    And I enter username and password for login
    And I search product to buy
    And I go to the second page to choose
    And I add third product to favourite
    And I go to the favorite menu
    And I click product that I added favourite before
    And I delete product from favourite menu
    Then I log out from website
