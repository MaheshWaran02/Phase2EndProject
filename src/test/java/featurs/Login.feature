@Swag

Feature: this feature fill will check on my login functionalty of Swag Labs

  Background: 
    Given I go to login the Swag Labs webpage

  Scenario: Validate the login succes scebario
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click ob login button
    Then I shoud land on home page "https://www.saucedemo.com/inventory.html"

  Scenario Outline: Validate the loginfaild and locked out user
    When I enter the username "<UserNames>"
    And I enter the password "<password>"
    And I click ob login button
    Then I shoud get the error message is "<Error>"

    Examples: 
      | UserNames       | password     | Error                                                                     |
      | standard_user   |        12345 | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
