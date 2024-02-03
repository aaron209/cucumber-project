Feature: Add to cart functionality

  Scenario Outline: Successful add to cart for a product
    Given The user launch the application
    Then The user search for the item "<item>"
    Examples:
      | item  |
      | phone |
