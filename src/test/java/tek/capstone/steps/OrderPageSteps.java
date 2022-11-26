package tek.capstone.steps;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class OrderPageSteps extends CommonUtility {
	     POMFactory factory = new POMFactory();
	
	//CancelAnOrder
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderSection);
		logger.info("User Click Order Section");
	    
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		stop(3000);
		clickElementWithJS(factory.orderPage().clickfirstOrder);
		logger.info("User Clicked On First Order");
	    
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    stop(5000);
		clickElementWithJS(factory.orderPage().clickCancelBtn);
		logger.info("User Clicked on Cancel Order");
	    
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String message) {

		selectByVisibleText(factory.orderPage().cancelationReason,message);
		logger.info("User Selected The Reasson for Cancelation");
	    
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		stop(3000);
		click(factory.orderPage().clickCancelOrder);
		logger.info("User Clicked on cancel Order Btn");
	    
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
		String expectedValue = string;
		String actualValue = getElementText(factory.orderPage().messageShowed);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("Cancelation Message Displayed");
	    
	}
	
	//RetunOrder
	
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		stop(5000);
		clickElementWithJS(factory.orderPage().returnItem);
		logger.info("User Clicked on Return Item");
	   
		
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String message) {
		selectByVisibleText(factory.orderPage().reasonForReturn,message);
		logger.info("The reason is selected");
		
	    
		
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String message) {
		selectByVisibleText(factory.orderPage().dropOffFeild,message);
		logger.info("User Clicked the Drop off Service");
		
	   
		
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnBtn);
		logger.info("User Clicked on Return button");
		}
	
	@Then("an order cancelation message should be displayed {string}")
	  public void anOrderCanCellation(String string) {
		String expectedValue = string;
		String actualValue = getElementText(factory.orderPage().returnSuccessfull);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("User Can See a message Item Return was Successfull");
		
  	
  }
	
	//ORDER-REVIEW
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().clickReview);
		logger.info("User Clicked Review Button");
	    
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headlineValue, String reviewText) {
	  sendText(factory.orderPage().headLinneFeild,headlineValue);  
	  sendText(factory.orderPage().descriptionFeild,reviewText);
	  logger.info("User Wrote the Review");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	      click(factory.orderPage().addReveiwFeildClick);
	      logger.info("User Click the add Button to Add the Review");
	    
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String message) {
		String expectedValue = message;
		String actualValue = getElementText(factory.orderPage().reviewAdded);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("Message added Successfully");
		
		
	    
	}

}
