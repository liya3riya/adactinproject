Feature: Hotel Booking in Adactin Application.


Scenario: User Login in the Adactin Application.

Given  User launch the Adactin web application.

When  User enter the user name in the username field.

And  User enter the password in the password field.

Then  User after given the login details click the login button to navigate to search hotel page.


Scenario: User search hotel page in Adactin Application.

When  User have to select mandatory for preffered location in search hotel page.

And  User have to select preffered hotels in search hotel page.

And  User have to select preffered Room Type in search hotel page.

And  User have to select mandatory for the number of rooms in search hotel page.

And  User have to select mandatory for adults per room in search hotel page.

And  User have to select children per room in search hotel page.

Then  After selcted all the fields and click search button to navigate select hotel page.


Scenario: User Select hotel page in Adactin Application.


And  User have to select mandatory the hotel from the select hotel page.

Then  User have to click continue button to navigate Book a hotel page.



Scenario: User book a hotel in Adactin Application.

When  User mandatory to enter the First name in First name field.

And  User mandatory to enter the Last name in Last name field.

And  User mandatory to enter the Billing Address in Billing Address field.

And  User mandatory to enter the Credit Card No in Credit Card No field.

And  User mandatory to select the preffered credit card type to select in credit card type.

And  User mandatory to select the Expiry month to select in credit card type.

And  User mandatory to select the Expiry year to select in credit card type.

And  User mandatory to enter the CVV number to enter in the CVV number.

Then  User have to click Search button to navigate Booking Confirmation page.



Scenario: User booking confirmation page in Adactin Application.
 
Then : User to click my logout button to navigate Booked logout page.

