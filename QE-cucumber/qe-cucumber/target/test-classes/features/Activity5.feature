@Loginsteps
Feature: Login Test
Scenario:Testing Login without Examples
Given the user is on the login page
When the user enters "<usernames>" and "<passwords>"
And clicks the submit button
Then get the confirmation messsage  as "Welcome Back, Admin!"

Examples:
|usernames|passwords|
|admin    |password |
|admin1    |password1|