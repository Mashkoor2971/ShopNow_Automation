Feature: Flipkart Checkout Page

@test
Scenario Outline: Verify user is able to naviagte to checkout page
    Given User is on the Flipkart Homepage
    And user verifies PageTitle'<Title>'
    When User searches for '<Keyword>' by clicking on enter
    And Click on product in PLP then PDP page should be displayed
    Then Add the product to the Cart
    And click on cart Icon from the Top Navigation
    Then user clicks on Proceed to checkout Button 
    And user enters the '<email>' in login field
    Then user gets the OTP from the mail'<email>','<password>'
    
    Examples:
    |Keyword|email                     |password      |Title|
    |Laptop |automation27@yahoo.com    |Testing@123   |Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!|
   