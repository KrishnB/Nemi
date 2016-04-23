$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nemi.feature");
formatter.feature({
  "line": 1,
  "name": "Nemi do wonders.",
  "description": "",
  "id": "nemi-do-wonders.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Hook scenario",
  "description": "",
  "id": "nemi-do-wonders.;hook-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Browser(name\u003d\"Hello\")"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I hook",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 12,
    "value": "Multiline data"
  }
});
formatter.step({
  "line": 15,
  "name": "I can hook",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I will hook",
  "keyword": "Then "
});
formatter.match({
  "location": "NemiDefinitions.i_hook(String)"
});
formatter.result({
  "duration": 129447515,
  "status": "passed"
});
formatter.match({
  "location": "NemiDefinitions.i_can_hook()"
});
formatter.result({
  "duration": 171190,
  "status": "passed"
});
formatter.match({
  "location": "NemiDefinitions.i_will_hook()"
});
formatter.result({
  "duration": 95243,
  "status": "passed"
});
});