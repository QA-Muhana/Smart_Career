package smart.usa.testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smart.usa.basepage.BasePage;

public class ParallelTesting extends BasePage {

	@Test
	public void getTest1() throws InterruptedException {
		
		logger.info("******* Test Execute on Chrome Browser  ********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

	}
	
	@Test
    public void getTest2() throws InterruptedException {
		
    	logger.info("******* Test Execute on Chrome Browser  ********");
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@Test
    public void getTest3() throws InterruptedException {
	
    	logger.info("******* Test Execute on Chrome Browser  ********");
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    	driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
}

}
