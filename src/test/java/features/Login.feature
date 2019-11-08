Feature: Login test

  I need to check if the user can login successfully

  Scenario: Login

    Given I am on home page
    When I go to login
    And I have entered login data
    And I click on login button
    When I click on the "Verträge" tab
    Then I should see "Gut versichert" inside the Verträge tab
#    When I click on the "Rente" tab
#    Then Pension income should be over 2400 Euro
    When I click on the "Bedarf" tab
    Then I should see "Du hast alle empfohlenen Produkte!" in the left column
    When I click on Clark "Clark jetzt empfehlen" link
    And Recommend Clark by mail
    Then I should see "erfolgreich versendet" after invitation