package com.Utility;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class ExtendedRunner extends BlockJUnit4ClassRunner{

	public ExtendedRunner(Class<?> klass) throws InitializationError {
		super(klass);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run(RunNotifier notifier) {
		
		notifier.addListener(new Listners());
		notifier.fireTestRunStarted(getDescription());
		super.run(notifier);
		
	}

}
