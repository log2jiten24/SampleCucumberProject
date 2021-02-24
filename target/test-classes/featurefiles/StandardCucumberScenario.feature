Feature: TO test the Order is being placed from the Amazon Page 

Scenario: To test the Order Creation functionality from the Amazon  WebPage 

Given User navigates to the Amazon Login Page 
And   Sign in Button is present on the Amazon Login Page 
When  User Clicks on the Amazon Login Button 
Then  User is Displayed on the Login  Page 
When  User enters 'log2jeet24@gmail.com' at the Username field 
And   User enters 'Password' in the Password Field 
And   User Clicks on the SignIn Button from the Amazon LoginPage  
Then  User Navigates to the Dashbard Page 
And   User verifies the Title of the Page as 'Amazon' 
But   Order Button is not Present on the Dashboard Page 


Scenario: To verify the Amazon Footer Section links 
Given User is on the Amazon Page 
When  User Scrolls down the Footer of the Page 
Then  User Gets all the Country Links 
|Australia|
|India|
|Singapore|
And   User gets all Amazon Services Links 
|Amazon Services|
|Amazon WebServcies|
And User gets all the Privacy Links 
|Privacy Notice| 
|Use and Sales |
