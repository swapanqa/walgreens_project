package com.walgreens.framework_Analizer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int count = 0;
	int retryLimit = 3;
	
	//try my test cases 3 times.
	
	public boolean retry(ITestResult result) {
		
		if(count<retryLimit) {
			count++;
			return true;
		}
		return false;
	}

}
