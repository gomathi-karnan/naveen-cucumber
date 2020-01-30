Feature: create a new CRM account 

Background: 

	When get in to <url> 
		|https://ui.cogmento.com/|
	Then verify the login page 
	
	Scenario: Create a new Contact
		Given go to contacts
		When click on new user button
		Then fill the mandatory details 
		And save
		
	
Scenario Outline: sign in to user account 
	Given enter "<username>" and "<password>" to login 
	When user is in the right page 
	Examples: 
		|username | password |
		|gomathitweety@gmail.com |Mnbvcxz@2017|
		|mani|mani|
		
		