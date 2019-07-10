Feature: To add customer

  Scenario Outline: To add customer
    Given The user should be telecom homepage
    When The user provide validate details "<fname>","<lname>","<email>","<address>","<phone>"
    Then The user validate the customer id generate

    Examples: 
      | fname  | lname      | email                   | address       | phone        |
      | Ganesh | J          | ganesh@gmail.com        | chennai       |  96835425125 |
      | Ajith  | Kumar      | Thala@gmail.com         | thiruvanmayur |  85612646233 |
      | Rajini | Kanth      | superstar@gmail.com     | Neelankarai   | 647431656646 |
      | Vijay  | sethupathi | Makkalselvan@gmail.com  | rajapalayam   |  64579841164 |
      | Kamal  | haasan     | ualaganayagan@gmail.com | alwarpet      |    846466666 |
