Feature:Web table user order feature


  @Web-Table-HW
  Scenario Outline:User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When  user selects product type "<productType>"
    *     user enters quantity <quantity>
    *     user enters name "<customerName>"
    *     user enters street "<street>"
    *     user enters city "<city>"
    *     user enters state "<state>"
    *     user enters zip code "<zipcode>"
    *     user selects card "<cardType>"
    *     user enters  card number "<cardNumber>"
    *     user enters exp date "<expDate>"
    *     user enters process order button
    Then  user should see "<expectedName>" in first row of the web table


    Examples:
      | productType | quantity | customerName | street                | city         | state | zipcode | cardType         | cardNumber       | expDate | expectedName |
      | MoneyCog    | 4        | Rufat        | 97 Spring street      | West Roxbury | MA    | 02132   | Visa             | 4400556677993333 | 12/27   | Rufat        |
      | Familybea   | 6        | Elnur        | 3000 OceanParkway     | Brooklyn     | NY    | 11235   | American Express | 4400556677883311 | 08/26   | Elnur        |
      | Screenable  | 3        | Rauf         | 2233 East 21st street | Brooklyn     | NY    | 11229   | MasterCard       | 5522556677993333 | 06/24   | Rauf         |

    Examples: Examples: Famous male scientist
      | productType | quantity | customerName      | street            | city   | state | zipcode | cardType         | cardNumber       | expDate | expectedName      |
      | Familybea   | 2        | Albert Einstein   | 221B Baker Street | London | NY    | 11235   | MasterCard       | 1111222233334444 | 12/26   | Albert Einstein   |
      | MoneyCog    | 4        | Alfred Nobel      | 221B Baker Street | London | MA    | 11229   | Visa             | 1111555533334444 | 12/27   | Alfred Nobel      |
      | Screenable  | 2        | Charles Darwin    | 221B Baker Street | London | OH    | 02132   | American Express | 3333222233334444 | 12/24   | Charles Darwin    |
      | MoneyCog    | 3        | Carl Sagan        | 221B Baker Street | London | TX    | 02154   | Visa             | 1111222233334444 | 12/23   | Carl Sagan        |
      | Familybea   | 1        | Archimedes        | 221B Baker Street | London | CA    | 11485   | MasterCard       | 1111222266664444 | 12/24   | Archimedes        |
      | Screenable  | 2        | Alexander Flaming | 221B Baker Street | London | WA    | 74123   | visa             | 1111222233334444 | 12/23   | Alexander Flaming |


  @webtableAppOrder
  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zip code "50505"
    And user selects card "american express"
    And user enters  card number "1111222233334444"
    And user enters exp date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table
