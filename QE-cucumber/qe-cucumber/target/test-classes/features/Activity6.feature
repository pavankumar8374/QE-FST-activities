@activity6
Feature: To test input with database
Scenario:Adding items to a to-do
Given user is on the To-Do list page
When user adds the following tasks
| Buy Vegetables |
| Buy Fruits     |

Then they can see the task added to the list