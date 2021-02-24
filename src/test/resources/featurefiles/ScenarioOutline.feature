Feature: Login credentials with Scenario Outline 

@Login
Scenario Outline: Login UserID and Password with different sets of login credenials 

Given User is on the Application Page 
When  User Clicks on the SignIn Button 
Then  User is displayed with login Screen 
When  User Enters "<Username>" in the Username field 
When  User Enters "<Password>" in the Password field 
And   User Clicks on the Sign In Button 
Then  User gets Error Message while login 

Examples:
|Username | Password |
|admin    | incorePwd|
|InvalidUser| InvalidPwsd|
|login User | login Pwd  | 


@BillingAmount
Scenario Outline: Calculate the billing amount 

Given User is on the billing page 
When  User Enters Billing Amount "<Billing Amount>"
When  User Enters Tax Amount "<Tax Amount>"
And   User Clicks on calculate button
Then  User gets the Calculated Final Bill Amount "<Final Amount>"

Examples:
|Billing Amount| Tax Amount | Final Amount |
|1500           |0.50       |1500.50|
|1805           |2.89       |1807.89|
|2100           |4.23       |2104.23|


