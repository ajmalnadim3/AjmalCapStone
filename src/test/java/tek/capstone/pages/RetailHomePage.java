package tek.capstone.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//title[text()='React App']")
	public WebElement pageTitle;

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement homepageLogo;

//HOME-SHOP DEPARTMENTS

	@FindBy(xpath = "//*[@id=\"hamburgerBtn\"]/span")
	public WebElement allDepartments;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsField;

	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computersField;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHomeField;

	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportsField;

	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automativeField;

//slidBar 
	@FindBy(xpath = "//div[@class = 'sidebar_content-item']/span")
	public List<WebElement> slidBar;

//@AddItemToCart

	@FindBy(xpath = "//select[@id='search']")
	public WebElement smartHomeCategory;

	@FindBy(id = "searchInput")
	public WebElement searchFeildnew;

	@FindBy(id = "searchBtn")
	public WebElement searchClick;

	@FindBy(xpath = "//p[@class='products__name']")
	public WebElement clickItem;

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement selectItemNuber;

	@FindBy(xpath = "//*[@id=\"addToCartBtn\"]/span")
	public WebElement addToCarrt;

	@FindBy(id = "cartQuantity")
	public WebElement cartQtyFeild;

//PLACING ORDER

	@FindBy(id = "cartBtn")
	public WebElement cartBtnOption;

	@FindBy(id = "proceedBtn")
	public WebElement proceedCheckoutOption;

	@FindBy(id = "addAddressBtn")
	public WebElement addNewAddressBtn;

	@FindBy(id = "addPaymentBtn")
	public WebElement addPayMethod;

	@FindBy(xpath = "//*[@id=\"placeOrderBtn\"]")
	public WebElement clickPlaceOrder;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/p")
	public WebElement orderPlacedSuccessfully;

}
