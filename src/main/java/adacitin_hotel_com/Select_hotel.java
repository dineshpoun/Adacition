package adacitin_hotel_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"radiobutton_0\"]")
	private WebElement selecthotel;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	private WebElement search;

	public Select_hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	

}
