package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class SignInRetail extends BaseSetup {

	public SignInRetail() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id = "signinLink")
	public WebElement signInClick;
	
	
	@FindBy(id = "email")
	public WebElement emailFeild;
	
	
	@FindBy(id = "password")
	public WebElement passwordFeild;
	
	
	@FindBy(id = "loginBtn")
	public WebElement logIngBtnClick;
	
	
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement accountClick;

}
