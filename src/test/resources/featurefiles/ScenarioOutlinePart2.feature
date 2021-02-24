Feature: To verify the Package Creation for  the eSign Application . 

Background:
Given User Navigates to the Dashboard esign Page 
When  User logins Credentails "Username" and "Password"
And   User Clicks on the Login Button 
And   User Navigates to the Dashboard Page 


Scenario Outline: To verify the package creation for the CSH Tenant 
Given User clicks on the Workflow button for CSH Tenant 
When  User Enters Borrower Details "<FirstName>" and "<LastName>" 
When  User Enters details "<EmailID>" and "<Mobile Number>"
And   User Clicks on the Create Button 

Examples:
|FirstName | LastName | EmailID | Mobile Number | 
|Lawrence  | Marx     | log2lawre@gmail.com | 8897896645| 
|Kumar     | Sanu     | log2sanu@gmail.com  | 8879961223|
|Udit      | Narayan  | log2Udit@gmail.com  | 7451222227|

Scenario Outline: To verify the Package Creation for the BOM Servicing Tenant 
Given User clicks on the Workflow button for BOM Servicing  Tenant 
When  User Enters Borrower Details "<FirstName>" and "<LastName>" 
When  User Enters details "<EmailID>" and "<Mobile Number>"
And   User Clicks on the Create Button 

Examples:
|FirstName | LastName | EmailID | Mobile Number | 
|Salman    | Khan     | log2Salamn@gmail.com | 8897897845| 
|Aamir     | Khan     | log2aamir@gmail.com  | 8879961227|
|Sharukh   | Khan     | log2Sharukh@gmail.com | 7451222227|


