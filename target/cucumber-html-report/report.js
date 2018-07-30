$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("form/ApplicationTest1.feature");
formatter.feature({
  "line": 2,
  "name": "My second application Feature (story :PS-101)",
  "description": "",
  "id": "my-second-application-feature-(story-:ps-101)",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 4698717461,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User can sort in the right order",
  "description": "",
  "id": "my-second-application-feature-(story-:ps-101);user-can-sort-in-the-right-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User type \"Ben\" on the search text box",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearch.user_is_on_google_search_page()"
});
formatter.result({
  "duration": 3012675886,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ben",
      "offset": 11
    }
  ],
  "location": "GoogleSearch.user_type_on_the_search_text_box(String)"
});
formatter.result({
  "duration": 8748321895,
  "status": "passed"
});
formatter.after({
  "duration": 1249664661,
  "status": "passed"
});
formatter.uri("form/Google.feature");
formatter.feature({
  "line": 2,
  "name": "MAGICAL APP Test-case (story :PS-102)",
  "description": "",
  "id": "magical-app-test-case-(story-:ps-102)",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 3315661567,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "MAGICAL APP Test",
  "description": "",
  "id": "magical-app-test-case-(story-:ps-102);magical-app-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User type \"Ben\" on the search text box",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearch.user_is_on_google_search_page()"
});
formatter.result({
  "duration": 2318257887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ben",
      "offset": 11
    }
  ],
  "location": "GoogleSearch.user_type_on_the_search_text_box(String)"
});
formatter.result({
  "duration": 872317641,
  "status": "passed"
});
formatter.after({
  "duration": 3036575931,
  "status": "passed"
});
formatter.uri("form/MySecondFeature.feature");
formatter.feature({
  "line": 2,
  "name": "User must see that sorting display (story :PS-103)",
  "description": "",
  "id": "user-must-see-that-sorting-display-(story-:ps-103)",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 3165266071,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User verify sorting display in the right order",
  "description": "",
  "id": "user-must-see-that-sorting-display-(story-:ps-103);user-verify-sorting-display-in-the-right-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.after({
  "duration": 1042199824,
  "status": "passed"
});
formatter.before({
  "duration": 3188223571,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User can sort in the right order",
  "description": "",
  "id": "user-must-see-that-sorting-display-(story-:ps-103);user-can-sort-in-the-right-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User type \"Ben\" on the search text box",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearch.user_is_on_google_search_page()"
});
formatter.result({
  "duration": 2505294195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ben",
      "offset": 11
    }
  ],
  "location": "GoogleSearch.user_type_on_the_search_text_box(String)"
});
formatter.result({
  "duration": 7821553096,
  "status": "passed"
});
formatter.after({
  "duration": 2875665389,
  "status": "passed"
});
});