package smart.usa.hookstest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import smart.usa.basepage.BasePage;
import smart.usa.genericCode.CommonUtility;

public class Hooks extends BasePage{

@Before
public void getStart() {
	logger.info(">>>>>>>>>>>Automation started<<<<<<<<<");
	BasePage.getInitialization();
	}

@After
public void getTearDown(Scenario scenario) {
	//if(scenario.isFailed()) {
		//CommonUtility.captureScreenshot(driver, "fail test");
	//}
	logger.info(">>>>>>>>>>>Automation Ended<<<<<<<<<");
	//driver.quit();
	
}}

