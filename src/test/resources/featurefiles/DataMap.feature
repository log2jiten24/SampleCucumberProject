Feature: User Registration with different USer Details 

Scenario: User Registers and Create Package with different sets of test data 

Given User is on Registration home dashboard page 
When  User enters following details for creating package 
      | Kumar | Jitendra | log2jeet24@gmail.com | 8879551929 | Pune |
      | Priya | Singh    | log2jiten24@gmail.com | 7989017224 | Kolkata |
      | Aadya | Singh | log2aadya@gmail.com | 7909019295 | Howrah |

Then User Package and Registration is successfull 


Scenario: User Registers and Create Package with different sets of test data having different columns

Given User is on Registration home dashboard page 
When  User enters following details for creating package having different set of columns 
      |FirstName | LastName | Email ID | MobileNum | City |
      | Kumar | Jitendra | log2jeet24@gmail.com | 8879551929 | Pune |
      | Priya | Singh    | log2jiten24@gmail.com | 7989017224 | Kolkata |
      | Aadya | Singh | log2aadya@gmail.com | 7909019295 | Howrah |

Then User Package and Registration is successfull 