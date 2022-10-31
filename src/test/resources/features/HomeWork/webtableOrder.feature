Feature:Web table user order feature


  @Web-Table-HW
  Scenario Outline:User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When  user selects product type "<productType>"
    *     user enters quantity "<quantity>"
    *     user enters name "<customerName>"
    *     user enters street "<street>"
    *     user enters city "<city>"
    *     user enters state "<state>"
    *     user enters zip code "<zipcode>"
    *     user selects card "<cardType>"
    *     user enters  card number "<cardNumber>"
    *     user enters exp date "<expDate>"
    *     user enters process order button
    Then  user should see "<customerName>" in first row of the web table


    Examples:
      | productType | quantity | customerName | street                | city         | state | zipcode | cardType         | cardNumber       | expDate |
      | MoneyCog    | 4        | Rufat        | 97 Spring street      | West Roxbury | MA    | 02132   | Visa             | 4400556677993333 | 12/27   |
      | Familybea   | 6        | Elnur        | 3000 OceanParkway     | Brooklyn     | NY    | 11235   | American Express | 4400556677883311 | 08/26   |
      | Screenable  | 3        | Rauf         | 2233 East 21st street | Brooklyn     | NY    | 11229   | MasterCard       | 5522556677993333 | 06/24   |



