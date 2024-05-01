
Feature: Loggedin user view
@login
  Scenario: Validate user is able to view after log in
    Given user navigate to login page
    
    When user succesfully enter the log in details
 
    Then user should be able to see the product category page
 
  