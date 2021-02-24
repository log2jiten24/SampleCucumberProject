
@All
Feature: Uber booking app 

@Smoke
Scenario: Booking Cab through Uber for Sedan

Given User wants to select car through Uber as "Sedan" type from uber application
When  User Select cartype as "Sedan" and pickup start point "Kolkata" and drop location "Howrah"
Then  Driver starts the Journey 
And   Driver ends the Journey
And   User changes the start point to "Belur" and pays extra charge 240 INR
And   User changes the end point to 'Liluah' and pays extra charge 400 INR 
Then  User pays 1200 INR 

@Smoke @Regression
Scenario: Booking Cab through Uber for SUV

Given User wants to select car through Uber as "SUV" type from uber application
When  User Select cartype as "Sedan" and pickup start point "Barrackpore" and drop location "Howrah"
Then  Driver starts the Journey 
And   Driver ends the Journey
Then  User pays 1800 INR 

@Production 
Scenario: Booking Cab through Uber for MniCar

Given User wants to select car through Uber as "MiniCar" type from uber application
When  User Select cartype as "Sedan" and pickup start point "Bandel" and drop location "Howrah"
Then  Driver starts the Journey 
And   Driver ends the Journey
Then  User pays 1400 INR 

