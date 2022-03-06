$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureAdactin/Adactin.feature");
formatter.feature({
  "name": "AdactinBooking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open adactin and launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.pass_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get into adactin site and book tickets",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.find_elemeent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});