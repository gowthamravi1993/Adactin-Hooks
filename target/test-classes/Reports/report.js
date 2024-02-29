$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/4Adactinhotelbooking.feature");
formatter.feature({
  "name": "To validate hotels continuepage functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hotelbooking"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch Adactin application",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinLoginPage.user_launch_Adactin_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "kanmaniM2923",
        "123456"
      ]
    },
    {
      "cells": [
        "kanmaniM2923",
        "vaithy@2411"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see the next page Welcome to Adactin Group of Hotels",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage.user_see_the_next_page_Welcome_to_Adactin_Group_of_Hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the location,hotel,roomtype,numberofrooms",
  "rows": [
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Double",
        "2 - Two",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSearchPage.user_enter_the_location_hotel_roomtype_numberofrooms(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the check in date and check out date",
  "rows": [
    {
      "cells": [
        "21/02/2023",
        "23/02/2023"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSearchPage.user_enter_the_check_in_date_and_check_out_date(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the adults per room,childrens per room",
  "rows": [
    {
      "cells": [
        "2 - Two",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSearchPage.user_enter_the_adults_per_room_childrens_per_room(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSearchPage.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see the message next page of the select page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSearchPage.user_see_the_message_next_page_of_the_select_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinContinuePage.user_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinContinuePage.user_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To enter the invalid credit card number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hotelbooking"
    },
    {
      "name": "@sanitary"
    }
  ]
});
formatter.step({
  "name": "user enter the firstname,lastname,Address,invalid credit card number",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "address",
        "credit card number"
      ]
    },
    {
      "cells": [
        "Gowtham",
        "Ravi",
        "coimbatore",
        "23435657890987"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotelBookingPage.user_enter_the_firstname_lastname_Address_invalid_credit_card_number(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the credit card type,expiry month,expiry year,enter the cvv number",
  "rows": [
    {
      "cells": [
        "VISA",
        "January",
        "2030",
        "2343"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelBookingPage.user_select_the_credit_card_type_expiry_month_expiry_year_enter_the_cvv_number(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click book now button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelBookingPage.user_click_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinHotelBookingPage.user_see_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});