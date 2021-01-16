Feature: Fill in the form of UserInyerface
  The user will go through the process of filling the form in the UserInyerface game

  Scenario: User can reach the "This is me" section of the game
    Given User is on the UserInyerface homepage
    When User starts the game by clicking over "HERE" text
    And fill the password "A1bcdsefan" and email "abc" in the first game section
    And accepts the Terms and Conditions
    And click on "Next" text
    Then User sees the text "This is me" on the screen

  Scenario: User doesn't upload an image and select more than 3 interests in the section "This is me"
    Given User reach the section "This is me" using password "A1bcdsefan" and email "abc" and clicking on Next
    And select 4 interests
    When User clicks on the Next button
    Then User sees the warning messages "Please upload a picture" and "Please choose 3 interests."