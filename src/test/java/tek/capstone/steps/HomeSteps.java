package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// Retail HomePage

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info("User See both Title are Matching");

	}

	@Then("User verify retail page logo is present")

	public void userVerifyRetailPageLogoIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().homepageLogo));
		logger.info("logo is present");
	}

	// Shop Departments

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allDepartments);
		logger.info("User Clicked on all Section");
	}

	@Then("options are present in Shop by Department sidebar Electronics  Computers  Smart Home  Sports  Automative")
	public void belowOptionsArePresentInShopByDepartmentSidebar() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsField));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computersField));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeField));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sportsField));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automativeField));

		logger.info("Sidebar Shop Department Sections are Visible to th User");
	}

	// SidebarOptions

	@When("User on {string}")
	public void userOnElectornics(String department) {
		List<WebElement> dept = factory.homePage().slidBar;
		for (WebElement element : dept) {
			if (element.getText().equals(department)) {
				element.click();
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentoption = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().slidBar;
		for (int i = 0; i < departmentoption.get(0).size(); i++) {

			for (WebElement element : dept) {
				if (element.getText().equals(departmentoption.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText()+ " is present");
				}

			}

		}
	}

	// @AddItemToCart

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String name) {
		selectByVisibleText(factory.homePage().smartHomeCategory, name);
		logger.info("User Changed the Category to Smart Home");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().searchFeildnew, string);
		logger.info("User typed kasa outdoor smart plug in Search Feild ");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchClick);
		logger.info("User Cliked Search Button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		clickElementWithJS(factory.homePage().clickItem);
		logger.info("User Clicked on the Item");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByVisibleText(factory.homePage().selectItemNuber, string);
		logger.info("User Selected Item Quatntity");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCarrt);
		logger.info("User Clicked the Add to Cart Button");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		String expectedQty = string;
		String actualQty = getElementText(factory.homePage().cartQtyFeild);
		Assert.assertEquals(expectedQty, actualQty);

		logger.info("User Can See The Quantity is added in the Cart");

	}

	// PlacingOrders

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartBtnOption);
		logger.info("User Clicked on Cart Logo");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedCheckoutOption);
		logger.info("User Clicked On Proceed to Checkout Button");

	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addNewAddressBtn);
		logger.info("User Clicked to add New Address");

	}

	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		clickElementWithJS(factory.homePage().addPayMethod);
		logger.info("User Clicked to Add Payment Card");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().clickPlaceOrder);
		logger.info("User Clicked on Place Order");

	}

	@Then("a message pop up {string}")
	public void aMessagePopUp(String message) {
		String expectedValue = message;
		String actualValue = getElementText(factory.homePage().orderPlacedSuccessfully);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("User See The Message Order Placed Successfully");

	}


}
