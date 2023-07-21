package adacitin_hotel_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookes_itirnerary {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement check_all;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancel_all;
	
	@FindBy(xpath="//*[@id=\"logout\"]")
	private WebElement logout;

	public Bookes_itirnerary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getCheck_all() {
		return check_all;
	}

	public WebElement getCancel_all() {
		return cancel_all;
	}
	
	
	

}
