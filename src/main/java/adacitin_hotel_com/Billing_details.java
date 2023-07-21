package adacitin_hotel_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_details {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	private WebElement first_name;
	
	@FindBy(xpath="//*[@id=\"last_name\"]")
	private WebElement last_name;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	private WebElement address;
	
	
	@FindBy(xpath="//*[@id=\"cc_num\"]")
	private WebElement credit_card_no;
	


	@FindBy(xpath="//*[@id=\"cc_type\"]")
	private WebElement card_type;
	
	
	@FindBy(xpath="//*[@id=\"cc_exp_month\"]")
	private WebElement Expiry_month;
	

	@FindBy(xpath="//*[@id=\"cc_exp_year\"]")
	private WebElement expiry_year;
	

	@FindBy(xpath="//*[@id=\"cc_cvv\"]")
	private WebElement cvv_no;
	

	@FindBy(xpath="//*[@id=\"book_now\"]")
	private WebElement book_now;


	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement itinerary;
	

	public Billing_details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirst_name() {
		return first_name;
	}


	public WebElement getLast_name() {
		return last_name;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCredit_card_no() {
		return credit_card_no;
	}


	public WebElement getCard_type() {
		return card_type;
	}


	public WebElement getExpiry_month() {
		return Expiry_month;
	}


	public WebElement getExpiry_year() {
		return expiry_year;
	}


	public WebElement getCvv_no() {
		return cvv_no;
	}


	public WebElement getBook_now() {
		return book_now;
	}


	public WebElement getItinerary() {
		return itinerary;
	}


	

	
	
}
