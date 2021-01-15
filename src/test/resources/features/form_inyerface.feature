Feature: Fill in the form of UserInyerface
  The user will go through the process of filling the form in the UserInyerface game

  Scenario: User can reach the "This is me" section of the game in less than one minute
    Given Juan is on the UserInyerface homepage
    When Juan starts the game by clicking over "HERE" text
    And fill the password "password" and email "email" in the first game section
    And accepts the Terms and Conditions
    And click on "Next" text
    Then Juan will see the section 2 "This is me" in less than 1 minute
