Feature: Search a product

  @search
  Scenario: customer should be able to search product he is looking for
    Given the user is on the apparel page
    When the user click search button, write Shirt and press ENTER
    Then page with results is displayed

  Scenario: customer should be able to login
    Given the user is on the apparel page
    When the user click My account button and Log in
    And enters valid credentials and click log in
    Then personal cabinet is displayed

  Scenario: customer should be able to create new account
    Given the user is on the apparel page
    When the user click My account button and Create account
    And enters valid credentials and click Create
    Then message about successfull registration is displayed

  Scenario: customer should be able to sort apparels
    Given the user is on the apparel page
    When the user click on Relevance
    And select sorting from dropdown menu
    Then apparels in selected order are displayed

  Scenario: customer should be able to see apparels In stock
    Given the user is on the apparel page
    When the user select In stock from checkbox Availability
    Then apparels which are in stock are displayed