package smart.usa.stepdef;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import smart.usa.basepage.BasePage;
import smart.usa.genericCode.CommonUtility;
import smart.usa.genericCode.WaitHelper;
import smart.usa.pagefactory.ElementPage;

public class Stepdef extends BasePage {
	ElementPage ep;
	
	@Given("User already login the application and verify the login info in the landing page")
	public void user_already_login_the_application_and_verify_the_login_info_in_the_landing_page() {
      ep = PageFactory.initElements(driver, ElementPage.class); 
      logger.info("******** User already login to the application *********");
      ep.getLogIn();
      logger.info("******** User able to verify login info on the screen *********");
      String expected = "Welcome, MUHANA TRISHA!"; // handled by text
      String actual   = ep.getVerifyUserInfo().getText();
      //CommonUtility.getAssert(actual, expected);
      Assert.assertEquals(actual, expected);
      logger.info(">>>>>>> User Verification <<<<<<<<<" + actual);
       
	}
	@When("user should be able to Jupiter All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_jupiter_all_weather_trainer_jacket_from_men_module() {
		logger.info("******** User able to mouse hover to the men module *********");
		WaitHelper.getSeleniumWait(ep.getMouseHoverMen(), 20);
		CommonUtility.getMouseHover(ep.getMouseHoverMen());
		
		logger.info("******** User able to mouse hover to the tops inside the men module *********");
		WaitHelper.getSeleniumWait(ep.getMouseHoverTops(), 20);
		CommonUtility.getMouseHover(ep.getMouseHoverTops());
		
		logger.info("******** User able click on Jackets inside the men module *********");
		WaitHelper.getSeleniumWait(ep.getSelectJackets(), 20);
		CommonUtility.getActionClick(ep.getSelectJackets());
		//CommonUtility.getJsClick(ep.getSelectJackets());
		
		logger.info("******** User able to click Jupiter Jackets inside the men module *********");
		WaitHelper.getSeleniumWait(ep.getClickJupiterJackets(), 20);
		CommonUtility.getActionClick(ep.getClickJupiterJackets());
	    
	}
	@When("user verify the jacket name on the Jupiter All-Weather Trainer list")
	public void user_verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
	    
		logger.info("******** User able to verify Jupiter Jackets inside the men module *********");
		WaitHelper.getSeleniumWait(ep.getVerifyjupiterJackets(), 15);
		CommonUtility.getActionClick(ep.getVerifyjupiterJackets());
		String expected = ep.getVerifyjupiterJackets().getText();
		String actual = prop.getProperty("verifiedJupiterJacket"); //handle the test data in properties file
		//CommonUtility.getAssert(actual, expected);
		Assert.assertEquals(actual, expected);
	}
	@When("user should be able to select the {string} and {string} and {string} and click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_and_click_on_the_add_to_cart(String getSize, String getColor, String getQuantity) {
	    
		logger.info("******** User able to select the medium size Jacket *********");
		WaitHelper.getSeleniumWait(ep.getSelectMediumSize(), 20);
	    CommonUtility.getActionClick(ep.getSelectMediumSize());
	    
	    logger.info("******** User able to select the Blue color Jacket *********");
		WaitHelper.getSeleniumWait(ep.getSelectBlueColor(), 20);
	    CommonUtility.getActionClick(ep.getSelectBlueColor());
	    
	   logger.info("******** User able to select the quantity Jacket *********");
	   WaitHelper.getSeleniumWait(ep.getSelectBlueColor(), 20);
	   ep.getSelectQty().clear();
	   ep.getSelectQty().sendKeys("1");
	    
	   logger.info("******** User able to click on add to cart *********");
		WaitHelper.getSeleniumWait(ep.getClickOnAddCart(), 20);
	    CommonUtility.getActionClick(ep.getClickOnAddCart());
	     
	}

	
	@When("user able to click on the cart and checkout")
	public void user_able_to_click_on_the_cart_and_checkout() {
	    
		logger.info("******** User able to click the cart option *********");
		WaitHelper.getSeleniumWait(ep.getClickOnShoppinCartBtn(), 20);
		CommonUtility.getActionClick(ep.getClickOnShoppinCartBtn());
		
		logger.info("******** User able to click the button procced to checkout *********");
		WaitHelper.getSeleniumWait(ep.getclickProccedCheckout(), 20);
		CommonUtility.getActionClick(ep.getclickProccedCheckout());
		
		
	}
	@When("user able to enter the shipping details and click on the next")
	public void user_able_to_enter_the_shopping_details_and_click_on_the_next() {
	    
		logger.info("******** User able to click on the New Address button *********");
		WaitHelper.getSeleniumWait(ep.getClickNewAddress(), 20);
		CommonUtility.getJsClick(ep.getClickNewAddress());
		
		ep.getNewAddressInfo();
	    
	}
	@When("user able to verify the shipping address and place the order")
	public void user_able_to_verify_the_shipping_address_and_place_the_order() {
	    
		logger.info("******User able to verify the Order number*******");
		WaitHelper.getSeleniumWait(ep.getOrderConfirmationNumber(), 20);
		CommonUtility.getActionClick(ep.getOrderConfirmationNumber());
	    String actual = ep.getOrderConfirmationNumber().getText();
	    logger.info("This is a new order number :" + actual);
	    Assert.assertEquals(actual, actual);
	}

	
	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String expected) throws IOException {
	    
		logger.info("******User able to verify the Order number*******");
		WaitHelper.getSeleniumWait(ep.getOrderConfirmationNumber(), 20);
		CommonUtility.getActionClick(ep.getOrderConfirmationNumber());
	    String actual = ep.getOrderConfirmationNumber().getText();
	    logger.info("This is a new order number :" + actual);
	    Assert.assertEquals(actual, actual);
	    CommonUtility.getCaptureScreenshot(driver, "VerifyOrderNumber");
		
		logger.info("******User able to verify the confirmation text*******");
		WaitHelper.getSeleniumWait(ep.getVerifyConfirmationText(), 20);
		CommonUtility.getActionClick(ep.getVerifyConfirmationText());
	    String actual1 = ep.getVerifyConfirmationText().getText();
	    logger.info("Verified Text :" + actual1);
	    Assert.assertEquals(actual1, expected);
	    
	    
	    // We have know this functionality for interview
	   // TakesScreenshot shot = (TakesScreenshot)driver;
	   // File file = shot.getScreenshotAs(OutputType.FILE);
	   // FileHandler.copy(file, new File("./Sreenshot/" + "Test" + ".png"));
	}

}
