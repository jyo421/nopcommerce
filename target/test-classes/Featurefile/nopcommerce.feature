@tag
Feature: Test the DemoWebShop website
 @tag1 @smoke
 Scenario: Verify the nopcommerce website
    Given open the browser
    When user enter the url "https://demo.nopcommerce.com"
    Then click on the Register
    When click on the Gender
    Then Enter a Firstname  "<firstname>"
    When enter a Lastname "<lastname>"
    Then Enter a "<Date-of-birth>"
    Then Enter a Email "<Email>"
    Then Enter a company details "<companydetails>"
    Then Click on news letter"<news letter>"
    When enter the Password"<password>"
    Then Enter a  ConfirmPassword "<ConfirmPassword>"
    When click on a Register button
    Then Click on the login component
    When Enter the  existing email "<email>"
    Then Enter the existing password "<password>"
    When Click on a login button
    Then click on a Computertoggle
    Then click on a Desktop
    Then click on lenova image
    Then click on add to cart
    Then click on shopping cart
    Then click on a Notebooks
    Then click on applemacbook
    Then click on cart
    Then click on shopping
    Then click on software
    Then click on soundforge
    Then click on cartbutton
    Then click on shoppingbutton
    Then click on a books
