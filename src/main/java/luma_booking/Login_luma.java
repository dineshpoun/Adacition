package luma_booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_luma {
	
	public static WebDriver driver;


	
	

	public Login_luma(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[@id=\"ui-id-5\"]")
	private WebElement mens;
	
	@FindBy(xpath="//img[@class='product-image-photo']")
	private WebElement tank;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-169']")
	private WebElement size;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-52']")
	private WebElement colour;
	
	@FindBy(xpath="//button[@id='btn-minicart-close']")
	private WebElement addtocard;

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]/span[2]")
	private WebElement shorts;
	
	@FindBy(xpath="//img[@src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/s/msh12-red_main_1.jpg']")
	private WebElement redcolourshorts;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-58']")
	private WebElement shortscolour;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-177']")
	private WebElement shortssize;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	private WebElement addcard;
	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement checkout;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement proceed;
	
	@FindBy(xpath="//input[@id='customer-email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='street[0]']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@name='region_id']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement zip;
	
	@FindBy(xpath="//select[@name='country_id']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='ko_unique_5']")
	private WebElement shipping;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	private WebElement next;
	
	@FindBy(xpath="//button[@title='Place Order']")
	private WebElement order;
	
	public WebElement getOrder() {
		return order;
	}

	public static void act() {
		
	
	
	}
	
	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getNext() {
		return next;
	}
	
	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getShortssize() {
		return shortssize;
	}

	public WebElement getShortscolour() {
		return shortscolour;
	}

	public WebElement getAddcard() {
		return addcard;
	}

	public WebElement getRedcolourshorts() {
		return redcolourshorts;
		
		
	}

	public WebElement getShorts() {
		return shorts;
	}

	public WebElement getMens() {
		return mens;
	}

	public WebElement getTank() {
		return tank;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}
	
	
	
	
	

}
