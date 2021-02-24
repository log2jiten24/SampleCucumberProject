

@All
Feature: Amazon Home Page 
In order to check my order details 
As a registered user 
I want to specify the feature details of the order page 

Background:
Given a registered user exists and logins 
When  User Navigates to the Home Page 
Then  User Enters "Username" and "Password" 
And   User Clicks on Login Button
Then  User Navigates to the Order page 


Scenario: Check Previous Order Details 
When User Clicks on Order Link 
Then User Clicks on Previous Order Details 

Scenario: Check Cancelled  Order Details 
When User Clicks on Order Link 
Then User Clicks on Cancelled  Order Details 

Scenario: Check Open  Order Details 
When User Clicks on Order Link 
Then User Clicks on Open  Order Details 

