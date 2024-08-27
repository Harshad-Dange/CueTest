package com.Utility;

import cucumber.api.java.Before;

public class Hooks {

	
	@Before
	public void beforeSuite() {
		System.out.println("This is hooks");
		baseClass.createReportFolder();
	}
}
