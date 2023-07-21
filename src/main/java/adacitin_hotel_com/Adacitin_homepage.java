package adacitin_hotel_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adacitin_homepage {
public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"location\"]")
	private WebElement location;
	
	
	@FindBy(xpath="//*[@id=\"hotels\"]")
	private WebElement hotels;
	
	@FindBy(xpath="//*[@id=\"room_type\"]")
	private WebElement roomtype;
	
	@FindBy(xpath="//*[@id=\"room_nos\"]")
	private WebElement no_of_rooms;
	
	@FindBy(xpath="//*[@id=\"datepick_in\"]")
	private WebElement check_in_date;
	
	@FindBy(xpath="//*[@id=\"datepick_out\"]")
	private WebElement check_out_date;
	
	@FindBy(xpath="//*[@id=\"adult_room\"]")
	private WebElement adult_per_room;
	
	@FindBy(xpath="//*[@id=\"child_room\"]")
	private WebElement children_per_room;
	
	@FindBy(xpath="//*[@id=\"Submit\"]")
	private WebElement search;

	
	public Adacitin_homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCheck_in_date() {
		return check_in_date;
	}

	public WebElement getCheck_out_date() {
		return check_out_date;
	}

	public WebElement getAdult_per_room() {
		return adult_per_room;
	}

	public WebElement getChildren_per_room() {
		return children_per_room;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
}
