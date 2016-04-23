package com.dreamersweekend.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NemiDefinitions {
	@Given("^I have hooks$")
	public void i_have_hooks() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I wrote One$")
	public void i_wrote_One() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^They should run fine$")
	public void they_should_run_fine() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}


	@Given("^I hook$")
	public void i_hook(String str) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(str);
	}

	@When("^I can hook$")
	public void i_can_hook() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I can Hook");
	}

	@Then("^I will hook$")
	public void i_will_hook() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I will hook");
	}

}
