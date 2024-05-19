

Feature: Application Login
  

  Scenario: Home Page Default Login
    Given User is on NetBanking landing page
    When user login into application with "jin" and password "1234"
    Then home screen is populate
    And cards are displayed "true"
    
    Scenario: Home Page Default Login
    Given User is on NetBanking landing page
    When user login into application with "john" and password "4321"
    Then home screen is populate
    And cards are displayed "false"
    

 