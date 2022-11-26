package tek.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@Then("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.SignInRetail().signInClick);
		logger.info("User Clicked Sign In Button");
	    
	}
	@Then("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.SignInRetail().emailFeild,email);
		sendText(factory.SignInRetail().passwordFeild,password);
		logger.info("User Entered E-mail and Password");
		
		
	    
	}
	@Then("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.SignInRetail().logIngBtnClick);
		logger.info("User Clicked Login Button");
	    
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.SignInRetail().accountClick));
		logger.info("Account is Visible");

	}

}
