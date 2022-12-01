package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class RetailAccountPageSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	    click(factory.SignInRetail().accountClick);
	    logger.info("User Clicked on Account Option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
		clearTextUsingSendKeys(factory.accountPage().nameFeild);
		
		sendText(factory.accountPage().nameFeild,name);
		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		sendText(factory.accountPage().phoneNumber, phoneNumber);
		
		logger.info("User entered Name and phone Number");
		
	   
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateClick);
		logger.info("User Clicked on Update Button");
	 
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileSeen));
		logger.info("User can see the Profiel ");
	    
	}
	
	//Change Password
	
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
	List<Map<String, String>> ChangePassword = dataTable.asMaps(String.class, String.class);
	sendText(factory.accountPage().oldPassword,ChangePassword.get(0).get("previousPassword")); 
	sendText(factory.accountPage().newPasswordFeild,ChangePassword.get(0).get("newPassword"));
	sendText(factory.accountPage().confirmPassword,ChangePassword.get(0).get("confirmPassword"));
	logger.info("User Changed the Password");

	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().clickChangePasswordBtn);
		logger.info("User Cliched the Button to Change Password");
	   
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
	   waitTillPresence(factory.accountPage().passChangedSuccessfully);
	   logger.info("Messaged pop up SUCCESSFULLY CHANGED");
		
	}
	
	//Adding Payment Card
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountPage().clickaddPcardbtn);
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> cardPay =data.asMaps(String.class, String.class);
	sendText(factory.accountPage().addCardNumb,cardPay.get(0).get("cardNumber"));
	sendText(factory.accountPage().cardName,cardPay.get(0).get("nameOnCard"));
	selectByVisibleText(factory.accountPage().expirationMonth,cardPay.get(0).get("expirationMonth"));
	selectByVisibleText(factory.accountPage().expirationYear,cardPay.get(0).get("expirationYear"));
	sendText(factory.accountPage().securityPassFeild,cardPay.get(0).get("securityCode"));
	logger.info("User added his debit card information");
	
	   
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().payBtnClick);
		logger.info("User clicked on ADD CARD BUTTON");
		
	    
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentSuccessfullyAdded);
		logger.info("User Added the Debit Card Information Successfully");
	    
	}
	
	
	//EditingCard
	
	
	@When("User click on card image")
	public void userClickOnEditCardImage() {
		click(factory.accountPage().masterCardimagClick);
		logger.info("User Clicked Master Card Image");
		
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSectIon() {
		click(factory.accountPage().editCardBTNclick);
		clearTextUsingSendKeys(factory.accountPage().addingEditNumber);
		clearTextUsingSendKeys(factory.accountPage().cardName);
		clearTextUsingSendKeys(factory.accountPage().securityPassFeild);
		logger.info("User Clicked on Edit Card Option");

	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable table) {
		List<Map<String, String>> editCard = table.asMaps(String.class, String.class)	;
		sendText(factory.accountPage().addingEditNumber,editCard.get(0).get("cardNumber"));
		sendText(factory.accountPage().cardName,editCard.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth,editCard.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear,editCard.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityPassFeild,editCard.get(0).get("securityCode"));
		logger.info("User Entered Required information to Edit the Card");
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateEiditCard);
		logger.info("User Clicked Update Card");

	}

	
	
	//RemovingCard
	
	@When("User click on card options")
	public void userClickCardPicture() {
		click(factory.accountPage().cardPictureFeild);
		logger.info("User Clicked on Card");
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removingCard);
		logger.info("User Clicked Remove to remove the card");

	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().emptyCardFeild);
		logger.info("Empty Card box is Displayed");
	   
	}
	
//	AddingAddress
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addingAddress);
		logger.info("User Clidk On Add Addrees I-con");
	   
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable table) {
		List<Map<String, String>> Address = table.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().selectCountry,Address.get(0).get("country"));
		sendText(factory.accountPage().nameFeildFullName,Address.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumbFeild,Address.get(0).get("phoneNumber"));
		sendText(factory.accountPage().st_addressFeild,Address.get(0).get("streetAddress"));
		sendText(factory.accountPage().appartment,Address.get(0).get("apt"));
		sendText(factory.accountPage().cityFeild,Address.get(0).get("city"));
		selectByVisibleText(factory.accountPage().selectState,Address.get(0).get("state"));
		sendText(factory.accountPage().zipcodeFeild,Address.get(0).get("zipCode"));
		logger.info("User Entered Required Information");
		
		
	    
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().clickAddBtn);
		logger.info("User Clicked Add Button");
	    
	}
	@Then("a message should be displayed ’Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().successfullyAdded);
		logger.info("Message Successfully Updated");
	  
	}
	//EditAddrress

	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	click(factory.accountPage().editAddress);
	clearTextUsingSendKeys(factory.accountPage().nameFeildFullName);
	clearTextUsingSendKeys(factory.accountPage().phoneNumbFeild);
	clearTextUsingSendKeys(factory.accountPage().st_addressFeild);
	clearTextUsingSendKeys(factory.accountPage().appartment);
	clearTextUsingSendKeys(factory.accountPage().cityFeild);
	clearTextUsingSendKeys(factory.accountPage().zipcodeFeild);
	logger.info("User Clicked on Edit Address Option and cleared the Values");
	}
	

	
	@Then("User click update Your Address button")
	public void userClickUpdateAddBtn() {
		click(factory.accountPage().updatateAddress);
		logger.info("User Clicked the Update Address Button");
	 
	}
	
	@Then("a message should be displayed ’Address Updated Successfully’")
	public void addressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().addressUpdatedSuccessful);
		
	logger.info("updated Successefully");
		
	}
	
	//Remove Address
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
      click(factory.accountPage().removeAddress);
      logger.info("User Clicked on Remove Card");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().addressboxEmpt);
		logger.info("Address is removed");
	   
	}
	
	

}
