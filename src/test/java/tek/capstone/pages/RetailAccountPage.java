package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	//ADDPHONE
	@FindBy(id = "nameInput")
	public WebElement nameFeild;
	
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateClick;
	
	@FindBy(xpath = "//*[@id=\"personalPhoneInput\"]")
	public WebElement phoneNumber;
	
	@FindBy(xpath = "//img[@alt='profile pic']")
	public WebElement profileSeen;
	//password change
	@FindBy(id = "previousPasswordInput")
	public WebElement  oldPassword;
	
	@FindBy(name = "newPassword")
	public WebElement newPasswordFeild;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//button[text()='Change Password']")
	public WebElement  clickChangePasswordBtn;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passChangedSuccessfully;
	
	//Adding Card elements
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement clickaddPcardbtn;
	
	@FindBy( xpath = "//input[@name='cardNumber']")
	public WebElement addCardNumb;
	
	@FindBy(name = "nameOnCard")
	public WebElement cardName;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityPassFeild;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement payBtnClick;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentSuccessfullyAdded;
	
	//AddingAddress
	
	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addingAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement selectCountry;
	
	@FindBy(id = "fullNameInput")
	public WebElement nameFeildFullName;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumbFeild;
	
	@FindBy(name = "street")
	public WebElement st_addressFeild;
	
	@FindBy(id = "apartmentInput")
	public WebElement appartment;
	
	@FindBy(name = "city")
	public WebElement cityFeild;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement selectState;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipcodeFeild;
	
	@FindBy(xpath = "//button[text()='Add Your Address']")
	public WebElement clickAddBtn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement successfullyAdded;
	
	//EDIT ADDRRESS
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement editAddress;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updatateAddress;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement  addressUpdatedSuccessful;
	
	//RemovingAddress
	
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddress;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div")
	public WebElement addressboxEmpt;
	
	
	
	
	
	
	
	//EDITTING CARD
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/img")
	public WebElement masterCardimagClick;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editCardBTNclick;
	
	@FindBy(xpath = "//*[@id=\"cardNumberInput\"]")
	public WebElement addingEditNumber;
	
	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateEiditCard;
	
	//RemovingCard
	
	@FindBy(xpath = "//p[text()='Master Card']")
	public WebElement cardPictureFeild;
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removingCard;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[1]")
	public WebElement emptyCardFeild;
	
	

}
