package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(),this);
	}
	
	@FindBy(xpath = "//*[@id=\"orderLink\"]")
	public WebElement orderSection;
	
	@FindBy(xpath = "//p[@class='order__header-btn']/parent::*[1]/..")
	public WebElement clickfirstOrder;
	
	@FindBy(xpath = "//*[@id='cancelBtn']/.")
	public WebElement clickCancelBtn;
	
	@FindBy(xpath = "//*[@id=\"reasonInput\"]")
	public WebElement cancelationReason;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement clickCancelOrder;
	
	@FindBy(xpath ="//p[text()='Your Order Has Been Cancelled']")
	public WebElement messageShowed;
	
	
	//RETURNORDER
	
	
	@FindBy(id = "returnBtn")
	public WebElement returnItem;
	
	@FindBy(id = "reasonInput")
	public WebElement reasonForReturn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffFeild;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement  returnBtn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnSuccessfull;
	
	//ReviewOrder
	
	@FindBy(id = "reviewBtn")
	public WebElement clickReview;
	
	@FindBy(id = "headlineInput")
	public WebElement  headLinneFeild;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionFeild;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addReveiwFeildClick;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAdded;
	
	
	
	
	
	
	

}
