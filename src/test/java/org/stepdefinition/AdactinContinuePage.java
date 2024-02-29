package org.stepdefinition;

import org.pojo.AdactinContinuePojo;
import org.utils.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinContinuePage extends BaseClass {
	AdactinContinuePojo p;
	@When("user select the hotel")
	public void user_select_the_hotel() {
		p=new AdactinContinuePojo();
		clickElement(p.getRadio());
	   
	}

	@Then("user click continue button")
	public void user_click_continue_button() {
		p=new AdactinContinuePojo();
		clickElement(p.getCon());
	}

	

}
