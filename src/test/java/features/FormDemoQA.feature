Feature: El usuario realizará un registro de un estudiante satisfactoriamente
  The user will succesfully register a student
  Scenario: The user is going to register a student with valid credencials.

    Given the user open "chrome" with "https://demoqa.com/automation-practice-form" url page
    When the user enters name "Manny" on practice form demoqa page
    And the user enters lastname "Calavera" on practice form demoqa page
    And the user enters email "mannyCal@gmail.com" on practice form demoqa page
    And the user clicks male option gender
    And the user enters number "3355880266" on practice form demoqa page
    And the user enters the date of birth "30" "October" "2000" on date of birth practice form demoqa page
    And the user enters subject "Maths" on practice form demoqa page
    And the user clicks "sports" on practice form demoqa page
    And the user clicks "music" on practice form demoqa page
    And the user upload file picture on path "C:\\Users\\PC\\Downloads\\GzVXuFGa4AQOZO5.jpg"
    And the user enters address "Pancho street 32 Alebrije" on practice form demoqa page
    And the user selects "NCR" state option on practice form demoqa page
    And the user selects "Delhi" city option on practice form demoqa page
    Then the user clicks submit button on practice form demoqa page

