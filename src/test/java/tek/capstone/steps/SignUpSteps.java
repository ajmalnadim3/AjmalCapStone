package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class SignUpSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signUpRetail().creatNewAccount);
		logger.info("User Clicked On Creat New Account");
	    
		
		
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String,String>> signUpData = data.asMaps(String.class ,String.class);
	    sendText(factory.signUpRetail().nameFeild, signUpData.get(0).get("name"));
	    sendText(factory.signUpRetail().emailFeild, signUpData.get(0).get("email"));
	    sendText(factory.signUpRetail().passwordFeild, signUpData.get(0).get("password"));
		sendText(factory.signUpRetail().confirmPasswordInputFeild,signUpData.get(0).get("confirmPassword"));
		logger.info("User Entered Reuired Feilds Data");
		
		
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signUpRetail().signUpFeild);
		logger.info("User Clicked Sign Up Button");
		
	    
	}
	
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.SignInRetail().accountClick));
	    logger.info("Account i-con is Visible to the User");
	}

}
