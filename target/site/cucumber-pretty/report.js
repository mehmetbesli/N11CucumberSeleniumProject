$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "N11 project using cucumber and selenium",
  "description": "This feature covers the operations we do after logging in to the site",
  "id": "n11-project-using-cucumber-and-selenium",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4494127668,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Go to the website and doing some operation",
  "description": "",
  "id": "n11-project-using-cucumber-and-selenium;go-to-the-website-and-doing-some-operation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username and password for login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I search product to buy",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I go to the second page to choose",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add third product to favourite",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I go to the favorite menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click product that I added favourite before",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I delete product from favourite menu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I log out from website",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 6802862329,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterUsernameAndPasswordForLogin()"
});
formatter.result({
  "duration": 2985354402,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchProductToBuy()"
});
formatter.result({
  "duration": 3393156256,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iGoToTheSecondPageToChoose()"
});
formatter.result({
  "duration": 3244923955,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddThirdProductToFavourite()"
});
formatter.result({
  "duration": 139589101,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iGoToTheFavoriteMenu()"
});
formatter.result({
  "duration": 1080315523,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickProductThatIAddedFavouriteBefore()"
});
formatter.result({
  "duration": 1319019580,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iDeleteProductFromFavouriteMenu()"
});
formatter.result({
  "duration": 294910120,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iLogOutFromWebsite()"
});
formatter.result({
  "duration": 775266142,
  "status": "passed"
});
formatter.after({
  "duration": 858527995,
  "status": "passed"
});
});