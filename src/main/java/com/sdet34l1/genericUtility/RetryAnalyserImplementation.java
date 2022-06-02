package com.sdet34l1.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class RetryAnalyserImplementation implements IRetryAnalyzer{
	int count =0;
	int maxRetry = 4;
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxRetry)
		{
			count++;
			return true;
		}
		return false;
	}

}
