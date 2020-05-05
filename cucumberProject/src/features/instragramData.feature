Feature: Instragram sign up feature
@regression
  Scenario Outline: validating the instragram sign up functionalities
    Given user is in the instragram sign up page
    When user enters mobile number  "<mobile Number>" in instra page
    And user enters full Name "<full name>" in instra page
    And user enters username "<username>" in instra page
    And user enters password "<password>"in instra page
    Then user should be able to create an instragram account
     And user should be able to close the browser

    Examples: 
      | mobile Number | full name      | username | password   |
      |       6474647 | test test      | test1234 | fjlk++     |
      |       4363434 | michael jordan | mcj      | dfjdfj23   |
      |       4363434 | michael jordan | mcj      | dfjdfj23   |
      |       4363343 | bob vance      | dfafd    | df44324    |
      |       4363434 | mer palmar     | fdaf     | dfjdfj23++ |
