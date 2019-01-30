package com.Utility;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class Listners extends RunListener {
	
	public void TestStarted(Description description) {
		
		AutomationLog.info("Starting : " + description.getMethodName());
			
	}
	
	public void TestEnds(Result result) {
		
		AutomationLog.info("Tests Finished ! and the total test case count is :" + result.getRunCount()+ "Total time is : "+ result.getRunTime());
		
	}
	
	public void TestFailure(Failure failure) {
		
		AutomationLog.error("Test failure:"+ failure.getDescription().getMethodName());
		
	}

}
