Feature: Test Facebook Smoke scenerios

  #Scenario: Test login with valid credentials
  #Given Open FF and start application
  #When I enter valid "mathur.int@gmail.com" and valid "password"
  #Then User should be able to login
  Scenario Outline: Test login with valid credentials
    Given Open FF and start application
    When I enter valid <Email> and valid <pass>
    Then User should be able to login

    Examples: 
      | Email     | pass      |
      | username1 | password1 |
      | username2 | password2 |
