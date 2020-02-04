Feature: User Input Check

  So that user input can be verified

  As a master of disguise

  I want to enter a string
  Scenario: Get input from user

    Given I am getting a word from the user

    When the user enters a word

    Then I should be told the word is "FIS"