Feature: To check the Adacitin hotel Functionality
Scenario: user given the login credentials
Given user navigate to the adacitin login page 
When user given usename and password 
Then user click the login button

@A1
Scenario: user booking the hotel 
Given hotel location
When select hotel
And select room type
And number of rooms
And checkin date
And checkout date
And adults per room 
Then childrens per room

@A2
Scenario: user select hotel
Given user select hotel
When user click continue button

@A3
Scenario: user billing for hotel
Given user given first name
When user given last name 
And user given address
And user given credit card no
And user given expiry month
And user given expiry year
And user given cvv no
Then user click the booknow button

@A4
Scenario: user confirming the hotel
Given user click the my itinerary element

@A5
Scenario: user cancelling the booking
Given user select the order
When user click the cancel selected butoon
And user accept the popup alert
Then user click the logout button