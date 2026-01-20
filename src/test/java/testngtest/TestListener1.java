package testngtest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener1 implements ITestListener {

	
	public void onStart(ITestContext context) {
	    // not implemented
		System.out.println("Starting onStart for Testcase " + context.getName() );
	  }
	
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("Starting onFinish for Testcase " + context.getName() );
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Starting onTestSuccess Testcase " + result.getName() );
	  }
	
	public void onTestFail(ITestResult result) {
		System.out.println("Starting onTestFail Testcase " + result.getName() );
	  }
}

