package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class SignUp extends BaseSetup {
	
	public SignUp() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	public WebElement creatNewAccount;
	
	@FindBy(id = "nameInput")
	public WebElement nameFeild;
	
	
	@FindBy(id = "emailInput")
	public WebElement emailFeild;
	
	
	@FindBy(id = "passwordInput")
	public WebElement passwordFeild;
	
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInputFeild;
	
	@FindBy(id = "signupBtn")
	public WebElement signUpFeild;
	
	

}
