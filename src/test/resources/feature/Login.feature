Feature: valid Login
Scenario Outline: Login with valid data
When user Launches into browser and  navigates into testme app
And user clicks the sigin button
When User Enter the valid username as "<user>" as un 
When User Enter the valid Password as "<pwd>" as pwd
Then click on the Login button
Then validates that the user Login into a valid data
Then user clicks the logout button
 Examples:
 |user|pwd|
 |Lalitha|Password123|
 |sharmila|sha1234|