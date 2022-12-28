package smart.usa.genericCode;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import smart.usa.basepage.BasePage;

public class CommonUtility extends BasePage {

	public static void getMouseHover(WebElement ele) {
		Actions ap = new Actions(driver);
		ap.moveToElement(ele).build().perform();
	}
	public static void getActionClick(WebElement ele) {
		Actions ap = new Actions(driver);
		ap.click(ele).build().perform();
	}
	
	public static Actions getAction() {
		Actions ap = new Actions(driver);
		return ap;
		
	}
	//public static void getAssert(String actual, String expected) {
	//	Assert.assertEquals(actual, expected);
		//logger.info("******** Verified Text ********* " + expected);
	//}
	
	public static void getJsClick(WebElement element) {
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();",element );
	}
	
	public static void getContinuouslyClickUntillFindElement(String xpath) {
	WebElement eleClick	= driver.findElement(By.xpath("xpath"));
	for(int i = 0; i <= 299; i++) {
		eleClick.click();
		break;
	}}
	
  public static void getSelectValues(WebElement ele, String text) {
	  Select value = new Select(ele);
      value.selectByVisibleText(text);
	}
  
  public static void waitAndClick(WebElement element, WebDriver driver) {
		try {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
			if (element.isDisplayed() && element.isEnabled()) {
				getAction().moveToElement(element);
				getAction().click(element).build().perform();
			}
		} catch (TimeoutException toe) {
			logger.log(Level.WARN, " Interrupted! ", toe);
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			logger.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
	}
  public static String getRandomStringValues() {
	String alphabet = RandomStringUtils.randomAlphabetic(5);
	return alphabet;
  }
  
  public static String getRandomNumericValues() {
	String number = RandomStringUtils.randomNumeric(10);
	return number;
  }
  
	public static void getCaptureScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot shot = (TakesScreenshot) driver;
			File store = shot.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(store, new File("./Sreenshot/" + screenshotName + ".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
}
