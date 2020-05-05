

Feature: Yahoo sign up feature



@regression
  Scenario: validating the yahoo sign up functionalities 
   
   Given user is in the yahoo sign up page
   When user enters firstname "Michael" in yahoo page
   And user enters lastname "Jordan" in yahoo page
   And user enters email address"mj@yahoo.com" in yahoo page
   And user enters password "dfkjdljf++"in yahoo page
  Then user should be able to create an yahoo account 