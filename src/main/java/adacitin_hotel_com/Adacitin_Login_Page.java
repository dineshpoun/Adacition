package adacitin_hotel_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adacitin_Login_Page {
	
	public static WebDriver driver;// null
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	private WebElement login;

	public Adacitin_Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	}
	
	
	

	
	
	
	
	
	
	
	
