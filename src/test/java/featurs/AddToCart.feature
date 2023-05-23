@Swag
Feature: this will help me to cart they things what i want in Swag Labs

    
  Scenario: go to they vaidate loginpage and Add to the cart
  Given I go to login the Swag Labs webpage
     When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click ob login button
    Then I shoud land on home page "https://www.saucedemo.com/inventory.html"
    And click on what product i want
    And Click on Add to cart
    And Click on your Cart
    And Verify the Name of the product "Sauce Labs Backpack"
    
