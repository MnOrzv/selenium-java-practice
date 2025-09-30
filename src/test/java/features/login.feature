Feature: Login to Practice Automation page

  Scenario: validate an successful login
    Given the user open "chrome" with "https://practicetestautomation.com/practice-test-login/" url page
    When the user enters username "student" on login page
    And the user enters password "Password123" on login page
    Then the user clicks login continue button on practiceautomation page


