@SmartBear
Feature: SmartBear order process verification
  User story: When user successfully creates a new order, the order should appear under the orders list


  Background: User is logged into the system and is on order page
    Given User logs in
    And   User goes to the Order page
    Then  User is on Order page


  Scenario: User fills out the "new order" form and his order appears under the orders list.
    When  User selects the FamilyAlbum from product dropdown
    *     User enters "4" to quantity
    *     User enters "John Wick" to costumer's name
    *     User enters "Kinzie Ave" to the street
    *     User enters "Chicago" to the city
    *     User enters "IL" to the state
    *     User enters "60056" to zipcode
    *     User selects Visa as a card type
    *     User enters "1111222233334444" to card number
    *     User enters "12/22" to expiration date
    *     User clicks the process button
    *     User goes to the Web Orders Page
    Then  User verifies "John Wick" is on the list
