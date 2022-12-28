package smart.usa.testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smart.usa.basepage.BasePage;

public class CrossBrowserTesting extends BasePage {

	@BeforeMethod
	@Parameters("browser")  //Parameters is a advanced annotation of TestNG
	public void getStartUp(String browser) throws Exception {
		
		if (browser.equalsIgnoreCase("chrome")) {
			logger.info("******* Test Execute on Safari Browser  ********");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			logger.info("******* Test Execute on Chrome Browser  ********");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) {
			logger.info("******* Test Execute on Edge Browser  ********");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			logger.info("******* Incorrect Browser path or another version ********");
			throw new Exception("Incorrect Browser");
		}
	}

	@Test
    public void getTests() throws InterruptedException {
		
    	driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
    
	@AfterMethod
    public void getTearDown() {
    	
		driver.quit();
	}
}
