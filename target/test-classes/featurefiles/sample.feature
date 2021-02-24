#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Amazon Search

    @Smoke
    Scenario: Search a product for Samsung Galaxy
    Given I have a search field on Amazon page
    When I search a product name "Samsung Galaxy" and price 50000
    Then Product with name "Samsung Galaxy" should be displayed

    @Regression
    Scenario: Search a product for Apple IPhone
    Given I have a search field on Amazon page
    When I search a product name "Apple Iphone" and price 99999
    Then Product with name "Apple Iphone" should be displayed
    
    