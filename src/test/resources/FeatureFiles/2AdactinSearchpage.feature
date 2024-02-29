@searchpage

Feature: To validate hotels Searchpage functionality
Background:
Given user launch Adactin application
And user enter username and password
|kanmaniM2923|123456|
|kanmaniM2923|vaithy@2411|
And user click login button
And user see the next page Welcome to Adactin Group of Hotels


Scenario: To search the valid location,hotel,roomtype,numberofrooms
When user enter the location,hotel,roomtype,numberofrooms
|Sydney|Hotel Creek|Double|2 - Two||
And user enter the check in date and check out date
|21/02/2023|23/02/2023|
And user enter the adults per room,childrens per room
|2 - Two|2 - Two|
And user click search button
Then user see the message next page of the select page


Scenario: To search the invalid location,hotel,roomtype,numberofrooms
When user enter the invalid location,valid hotel,valid roomtype,valid numberofrooms
|location|hotel|roomtype|numberofrooms|
|Sydney|Hotel Creek|Double|2 - Two|
|India|Hotel Creek|Double|2 - Two|
And user enter the check in date and check out date
|21/02/2023|23/02/2023|
And user enter the adults per room,childrens per room
|2 - Two|2 - Two|
And user click search button
Then user see the error message of the displayed