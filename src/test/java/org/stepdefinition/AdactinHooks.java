package org.stepdefinition;

import org.utils.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AdactinHooks extends BaseClass {
	
	@Before
	public void browser() {
		browserlaunch();
		maximizeBrowser();
		applyWaitToElements();
	}
//	@After
//	public void afterScenareio(Scenario scenario) {
//
//		String scenarioName = scenario.getName();
//		screenshot(scenarioName);
////		closeBrowser();
//		
//	}	
	
	@After
	
	public void afterScenerio( Scenario scenario ) {
		String name = scenario.getName();
            screenshot(name);
            closeBrowser();
	}

	
}
