Feature: Product_Store 
@Tc01_SignUp
Scenario: Sign Up to Product store 
	Given the user launched the chrome browser 
	When the user opens product store  homepage 
	Then the user enters username and password 
	Then  the user clicks signup
	And the user close the application 
	
@Tc02_Login
Scenario: Login to Product store 
	Given  user launched the chrome browser 
	When  user opens product store  homepage 
	Then  user enters username and password 
	Then   user clicks login

@Tc03_Add_to_cart
Scenario: To add a product to cart 
	Given  user launched the chrome Browser
	When  user opens product store  Homepage 
	Then  user clicks on product and add to cart 

@Tc04_Contact
Scenario: To contact 
	Given  user launched the Chrome Browser
	When  user opens Product store  Homepage 
	Then  user clicks contact
	Then  user enters contact details
	Then  user clicks send message

@Tc05_clickproduct
Scenario: To select a product 
	Given  user launched the Chrome_Browser
	When  user opens Product Store  Homepage 
	Then  user clicks next
	Then  user selects product
	
@Tc06_To_check_phone_number
Scenario: To check phone number
    Given The user launched the Chrome Browser
    When The user opens Product Store  Homepage
    When User opens product Store homepage
    Then User checks if the number is valid

