#Author: anik@agile1tech.com
#Keywords Summary :


Feature: Login feature

Background: user should be in the login page
 Given user is in the login page

  Scenario: testing the login with valid credentials 
   
  
   When user enters valid password
   And user enters valid username
   And user clicks on the login button
   Then user should be logged in
   And user should see the login page 
   And user should be able to close the browser
   
   
   Scenario: testing the login with invalid credentials 
   
  
   When user enters invalid password
   And user enters invalid username
   And user clicks on the login button
   Then user should not be able to logged in 
   And user should stay in the same page
    And user should be able to close the browser
  
