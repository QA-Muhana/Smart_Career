package smart.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import smart.usa.basepage.BasePage;
import smart.usa.genericCode.CommonUtility;

public class Listener extends BasePage implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info(" OnTest Started: " + result.getName());
		System.out.println(" OnTest Started: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info(" OnTest Success: " + result.getName());
		System.out.println(" OnTest Success: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info(" OnTest Failure: " + result.getName());
		//CommonUtility.captureScreenshot(driver, "failed test");
		System.out.println(" OnTest Failure: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info(" OnTest Skipped: " + result.getName());
		System.out.println(" OnTest Skipped: " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName());
	}

}
