$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nemi.feature");
formatter.feature({
  "line": 1,
  "name": "Nemi do wonders.",
  "description": "",
  "id": "nemi-do-wonders.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing hooks",
  "description": "",
  "id": "nemi-do-wonders.;testing-hooks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Browser1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have hooks",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I wrote One",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "They should run fine",
  "keyword": "Then "
});
formatter.match({
  "location": "NemiDefinitions.i_have_hooks()"
});
formatter.result({
  "duration": 231679847,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.dreamersweekend.stepdefinitions.NemiDefinitions.i_have_hooks(NemiDefinitions.java:12)\r\n\tat ✽.Given I have hooks(nemi.feature:5)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "NemiDefinitions.i_wrote_One()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NemiDefinitions.they_should_run_fine()"
});
formatter.result({
  "status": "skipped"
});
});