package smart.usa.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import smart.usa.basepage.BasePage;
import smart.usa.genericCode.CommonUtility;
import smart.usa.genericCode.WaitHelper;

public class ElementPage extends BasePage {

public ElementPage() {
PageFactory.initElements(driver, this);
}

final static String loopXpath = "";

@FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]")
@CacheLookup
private WebElement ClickSignIn;
public WebElement getClickSignIn() {
	return ClickSignIn;
}

@FindBy(xpath = "//*[@id='email']")
@CacheLookup
private WebElement userName;
public WebElement getUserName() {
	return userName;
}

@FindBy(xpath = "//*[@id='pass']")
@CacheLookup
private WebElement passWord;
public WebElement getpassWord() {
	return passWord;
}

@FindBy(xpath = "(//*[text()='Sign In'])[1]")
@CacheLookup
private WebElement clickLogIn;
public WebElement getclickclickLogIn() {
	return clickLogIn;
}

@FindBy(xpath = "(//*[text()='Welcome, MUHANA TRISHA!'])[1]")
@CacheLookup
private WebElement verify;
public WebElement getVerifyUserInfo() {
	return verify;
}

@FindBy(xpath = "//*[text()='Men']")
@CacheLookup
private WebElement mouseHoverMen;
public WebElement getMouseHoverMen() {
	return mouseHoverMen;
}

@FindBy(xpath = "(//*[text()='Tops'])[2]")
@CacheLookup
private WebElement mouseHoverTops;
public WebElement getMouseHoverTops() {
	return mouseHoverTops;
}

@FindBy(xpath = "(//*[text()='Jackets'])[2]")
@CacheLookup
private WebElement selectJackets;
public WebElement getSelectJackets() {
	return selectJackets;
}
//click on jupitar jacket 
@FindBy(xpath = "(//a[@class='product-item-link'])[3]")
@CacheLookup
private WebElement clickJupiterJackets;
public WebElement getClickJupiterJackets() {
	return clickJupiterJackets;
}
//verifying jupitar jacket
@FindBy(xpath = "//span[@itemprop='name']")
@CacheLookup
private WebElement verifyjupiterJackets;
public WebElement getVerifyjupiterJackets() {
	return verifyjupiterJackets;
}
//medium size
@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
@CacheLookup
private WebElement selectMediumSize;
public WebElement getSelectMediumSize() {
	return selectMediumSize;
}
//blue color 
@FindBy(xpath = "//div[@option-label='Blue']")
@CacheLookup
private WebElement selectBlueColor;
public WebElement getSelectBlueColor() {
	return selectBlueColor;
}
//select quantity
@FindBy(xpath = "//input[@class='input-text qty']")
@CacheLookup
private WebElement selectQty;
public WebElement getSelectQty() {
	return selectQty;
}
//add to cart
@FindBy(xpath = "//*[text()='Add to Cart']")
@CacheLookup
private WebElement clickOnAddCart;
public WebElement getClickOnAddCart() {
	return clickOnAddCart;
}
//click on shopping cart 
@FindBy(xpath = "//*[text()='shopping cart']")
@CacheLookup
private WebElement clickOnShoppinCartBtn;
public WebElement getClickOnShoppinCartBtn() {
	return clickOnShoppinCartBtn;
}
//click on procced to check out
@FindBy(xpath = "(//*[text()='Proceed to Checkout'])[2]")
@CacheLookup
private WebElement clickProccedCheckout;
public WebElement getclickProccedCheckout() {
	return clickProccedCheckout;
}
//elements for add new address details
@FindBy(xpath = "//*[text()='New Address']")
@CacheLookup
private WebElement clickNewAddress;
public WebElement getClickNewAddress() {
	return clickNewAddress;
}

@FindBy(xpath = "(//*[@type='text'])[2]")
@CacheLookup
private WebElement enterFirstName;
public WebElement getEnterFirstName(){
	return enterFirstName;
}

@FindBy(xpath = "(//*[@type='text'])[3]")
@CacheLookup
private WebElement enterLastName;
public WebElement getEnterLastName(){
	return enterLastName;
}
@FindBy(xpath = "(//*[@type='text'])[4]")
@CacheLookup
private WebElement enterCompanyName;
public WebElement getEnterComapnyName(){
	return enterCompanyName;
}

@FindBy(xpath = "(//*[@type='text'])[5]")
@CacheLookup
private WebElement enterAddress;
public WebElement getEnterAddress(){
	return enterAddress;
}

@FindBy(xpath = "(//*[@type='text'])[8]")
@CacheLookup
private WebElement enterCityName;
public WebElement getEnterCityName(){
	return enterCityName;
}

@FindBy(xpath = "(//*[@class='select'])[1]")
@CacheLookup
private WebElement selectState;
public WebElement getSelectState(){
	return selectState;
}

@FindBy(xpath = "(//*[@type='text'])[10]")
@CacheLookup
private WebElement enterZipCode;
public WebElement getEnterZipCode(){
	return enterZipCode;
}

@FindBy(xpath = "(//*[@class='select'])[2]")
@CacheLookup
private WebElement selectCountryName;
public WebElement getSelectCountryName(){
	return selectCountryName;
}

@FindBy(xpath = "(//*[@type='text'])[11]")
@CacheLookup
private WebElement enterPhoneNumber;
public WebElement getEnterPhoneNumber(){
	return enterPhoneNumber;
}

@FindBy(xpath = "//*[text()='Ship here']")
@CacheLookup
private WebElement clickOnShipHere;
public WebElement getClickOnShipHere(){
	return clickOnShipHere;
}

@FindBy(xpath = "(//*[@type='radio'])[1]")
@CacheLookup
private WebElement selectShippingOption;
public WebElement getSelectShippingOption(){
	return selectShippingOption;
}

@FindBy(xpath = "(//*[@type='submit'])[2]")
@CacheLookup
private WebElement clickOnNextBtn;
public WebElement getClickOnNextBtn(){
	return clickOnNextBtn;
}

@FindBy(xpath = "//*[text()='Place Order']")
@CacheLookup
private WebElement clickPlaceOrder;
public WebElement getClickPlaceOrder(){
	return clickPlaceOrder;
}

@FindBy(xpath = "//*[text()='Your order number is: ']")
@CacheLookup
private WebElement orderConfirmationNumber;
public WebElement getOrderConfirmationNumber(){
	return orderConfirmationNumber;
}

@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
@CacheLookup
private WebElement verifyConfirmationText;
public WebElement getVerifyConfirmationText(){
	return verifyConfirmationText;
}


public void getLogIn() {
	getClickSignIn().click();
	logger.info("******User able to Click on sign in button*******");
	getUserName().sendKeys(prop.getProperty("userName"));
	logger.info("******User able to enter the userName*******");
	getpassWord().sendKeys(prop.getProperty("textPassword"));
	logger.info("******User able to enter the password*******");
	getclickclickLogIn().click();
	logger.info("******User able to Click on logIn button*******");
		
}
public void getNewAddressInfo() {
	
	logger.info("******User able to enter the First Name*******");
	WaitHelper.getSeleniumWait(getEnterFirstName(), 20);
	getEnterFirstName().clear();
	getEnterFirstName().sendKeys(CommonUtility.getRandomStringValues());
	
	logger.info("******User able to enter the Last Name*******");
	WaitHelper.getSeleniumWait(getEnterLastName(), 20);
	getEnterLastName().clear();
	getEnterLastName().sendKeys(CommonUtility.getRandomStringValues());
	
	logger.info("******User able to enter the Company Name as personal*******");
	WaitHelper.getSeleniumWait(getEnterComapnyName(), 20);
	getEnterComapnyName().clear();
	getEnterComapnyName().sendKeys(CommonUtility.getRandomStringValues());
	
	logger.info("******User able to enter the house address*******");
	WaitHelper.getSeleniumWait(getEnterAddress(), 20);
	getEnterAddress().clear();
	getEnterAddress().sendKeys("927 ontorio " + CommonUtility.getRandomStringValues());
	
	logger.info("******User able to enter the city name*******");
	WaitHelper.getSeleniumWait(getEnterCityName(), 20);
	getEnterCityName().clear();
	getEnterCityName().sendKeys("Richmond hill" + CommonUtility.getRandomStringValues());
	
	//we can select the static dropdown in many ways as below
	//Select obj = new Select(driver.findElement(By.xpath("(//*[@class='select'])[1]")));
	//obj.selectByVisibleText("New York");
	//obj.selectByIndex(43);
	//obj.selectByValue("43");
	
	logger.info("******User able to select state as New York*******");
	WaitHelper.getSeleniumWait(getSelectState(), 20);
	CommonUtility.getSelectValues(getSelectState(), "New York");
	
	logger.info("******User able to enter the ZipCode*******");
	WaitHelper.getSeleniumWait(getEnterZipCode(), 20);
	getEnterZipCode().clear();
	getEnterZipCode().sendKeys("11418");
	
	logger.info("******User able to select Country as United States*******");
	WaitHelper.getSeleniumWait(getSelectCountryName(), 20);
	CommonUtility.getSelectValues(getSelectCountryName(), "United States");
	
	logger.info("******User able to enter the Phone Number*******");
	WaitHelper.getSeleniumWait(getEnterPhoneNumber(), 20);
	getEnterPhoneNumber().clear();
	getEnterPhoneNumber().sendKeys(CommonUtility.getRandomNumericValues());
	
	logger.info("******User able to click on Ship Here Button*******");
	WaitHelper.getSeleniumWait(getClickOnShipHere(), 20);
	CommonUtility.getActionClick(getClickOnShipHere());

     logger.info("******User able to select the shipping method*******");
     driver.navigate().refresh();
     WaitHelper.getSeleniumWait(selectShippingOption, 20);
     CommonUtility.getJsClick(selectShippingOption);
   
   //CommonUtility.waitAndClick(selectShippingOption, driver);
   
   logger.info("******User able to click on Next button*******");
	WaitHelper.getSeleniumWait(getClickOnNextBtn(), 20);
	CommonUtility.getActionClick(getClickOnNextBtn());
	
	logger.info("******User able to click on Place order button*******");
	WaitHelper.getSeleniumWait(getClickPlaceOrder(), 20);
	CommonUtility.getJsClick(getClickPlaceOrder());
	
	
}
}
