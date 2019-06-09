$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Common/Usgbc_Login.feature");
formatter.feature({
  "name": "Login to USGBC Leed Online Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "User will login to leed online and navigate to credit page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to navigate to leed online home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_has_to_navigate_to_leed_online_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to accept end user license agreement",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_has_to_accept_End_user_license_Agreement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on LOG IN button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_on_LOG_IN_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Project",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_clicks_on_Project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the credits page of the project",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_navigates_to_the_credits_page_of_the_project()"
});
formatter.result({
  "status": "passed"
});
});