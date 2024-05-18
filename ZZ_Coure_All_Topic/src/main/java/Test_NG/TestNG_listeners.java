package Test_NG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish");

	}

	
	

}
