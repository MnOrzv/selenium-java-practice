Feature: Validate the title of the page
Scenario: Validate correctly the title of the page

  Given the user open "chrome" with "https://www.saucedemo.com/" url page
  When the user validates the presence of title page on SwagLabs page
