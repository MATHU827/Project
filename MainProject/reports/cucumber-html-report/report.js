$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/ProductStore.feature");
formatter.feature({
  "line": 1,
  "name": "Product_Store",
  "description": "",
  "id": "product-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign Up to Product store",
  "description": "",
  "id": "product-store;sign-up-to-product-store",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Tc01_SignUp"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "the user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user opens product store  homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the user clicks signup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user close the application",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinition.the_user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 63373355600,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.the_user_opens_product_store_homepage()"
});
formatter.result({
  "duration": 131841614400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.the_user_enters_username_and_password()"
});
formatter.result({
  "duration": 74990417900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.the_user_clicks_signup()"
});
formatter.result({
  "duration": 10648381900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.the_user_close_the_application()"
});
formatter.result({
  "duration": 34461204100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login to Product store",
  "description": "",
  "id": "product-store;login-to-product-store",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Tc02_Login"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user opens product store  homepage",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 55177790700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_opens_product_store_homepage()"
});
formatter.result({
  "duration": 19484803200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 151232162100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_login()"
});
formatter.result({
  "duration": 788408800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To add a product to cart",
  "description": "",
  "id": "product-store;to-add-a-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Tc03_Add_to_cart"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user launched the chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens product store  Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on product and add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartStepDefiniton.user_launched_the_chrome_Browser()"
});
formatter.result({
  "duration": 13503769200,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefiniton.user_opens_product_store_Homepage()"
});
formatter.result({
  "duration": 3202634200,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefiniton.user_clicks_on_product_and_add_to_cart()"
});
formatter.result({
  "duration": 22183961700,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "To contact",
  "description": "",
  "id": "product-store;to-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Tc04_Contact"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user launched the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user opens Product store  Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user clicks contact",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enters contact details",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks send message",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepDefinition.user_launched_the_Chrome_Browser()"
});
formatter.result({
  "duration": 12943138100,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_opens_Product_store_Homepage()"
});
formatter.result({
  "duration": 3277615300,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_clicks_contact()"
});
formatter.result({
  "duration": 3215871800,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_enters_contact_details()"
});
formatter.result({
  "duration": 1272291600,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_clicks_send_message()"
});
formatter.result({
  "duration": 6323687900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "To select a product",
  "description": "",
  "id": "product-store;to-select-a-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Tc05_clickproduct"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user launched the Chrome_Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user opens Product Store  Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user clicks next",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user selects product",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectAProdcutFromNextStepDenition.user_launched_the_Chrome_Browser()"
});
formatter.result({
  "duration": 12233338000,
  "status": "passed"
});
formatter.match({
  "location": "SelectAProdcutFromNextStepDenition.user_opens_Product_Store_Homepage()"
});
formatter.result({
  "duration": 4465406000,
  "status": "passed"
});
formatter.match({
  "location": "SelectAProdcutFromNextStepDenition.user_clicks_next()"
});
formatter.result({
  "duration": 3322427600,
  "status": "passed"
});
formatter.match({
  "location": "SelectAProdcutFromNextStepDenition.user_selects_product()"
});
formatter.result({
  "duration": 12123314000,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "To check phone number",
  "description": "",
  "id": "product-store;to-check-phone-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@Tc06_To_check_phone_number"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "The user launched the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "The user opens Product Store  Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User opens product Store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User checks if the number is valid",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckForPhoneNumberStepDefinition.the_user_launched_the_Chrome_Browser()"
});
formatter.result({
  "duration": 12992122900,
  "status": "passed"
});
formatter.match({
  "location": "CheckForPhoneNumberStepDefinition.the_user_opens_Product_Store_Homepage()"
});
formatter.result({
  "duration": 6672000700,
  "status": "passed"
});
formatter.match({
  "location": "CheckForPhoneNumberStepDefinition.user_opens_product_Store_homepage()"
});
formatter.result({
  "duration": 30909921300,
  "status": "passed"
});
formatter.match({
  "location": "CheckForPhoneNumberStepDefinition.user_checks_if_the_number_is_valid()"
});
formatter.result({
  "duration": 3902243500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c440 []23456\u003e but was:\u003c440 [1]23456\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.ProductStore.StepDefinition.CheckForPhoneNumberStepDefinition.user_checks_if_the_number_is_valid(CheckForPhoneNumberStepDefinition.java:35)\r\n\tat ✽.Then User checks if the number is valid(src/main/resources/feature/ProductStore.feature:43)\r\n",
  "status": "failed"
});
});