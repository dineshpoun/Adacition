package com.adacitin.sd;



import org.openqa.selenium.WebDriver;

import com.adacitin.runner.Runner;
import com.pack.Base_Demo01;

import adacitin_hotel_com.Adacitin_Login_Page;
import adacitin_hotel_com.Adacitin_homepage;
import adacitin_hotel_com.Billing_details;
import adacitin_hotel_com.Bookes_itirnerary;
import adacitin_hotel_com.Select_hotel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_definition extends Base_Demo01{
	
public static WebDriver driver=Runner.driver;

Adacitin_Login_Page login=new Adacitin_Login_Page(driver);
Adacitin_homepage home=new Adacitin_homepage(driver);
Select_hotel hotel=new Select_hotel(driver);
Billing_details bill=new Billing_details(driver);
Bookes_itirnerary book=new Bookes_itirnerary(driver);


@Given("user navigate to the adacitin login page")
public void user_navigate_to_the_adacitin_login_page() {
    maxi(driver);
    link(driver, "http://adactinhotelapp.com/index.php");

}

@When("user given usename and password")
public void user_given_usename_and_password() {
	
   sendkey(login.getUsername(), "dineshpoun");
   sendkey(login.getPassword(), "pass123");
}


@Then("user click the login button")
public void user_click_the_login_button() {
   
	cl(login.getLogin());
	
}


@Given("hotel location")
public void hotel_location() {
	
	dropdown(home.getLocation(), "London");
    
}

@When("select hotel")
public void select_hotel() {
    
	dropdown(home.getHotels(), "Hotel Hervey");
}

@When("select room type")
public void select_room_type() {
	dropdown(home.getRoomtype(), "Super Deluxe");
}


@When("number of rooms")
public void number_of_rooms() {
    dropdown(home.getNo_of_rooms(), "1");
	
}

@When("checkin date")
public void checkin_date() {
  
	clear(home.getCheck_in_date());
	sendkey(home.getCheck_in_date(), "28/04/2023");
	
}

@When("checkout date")
public void checkout_date() {
	
	clear(home.getCheck_out_date());
	sendkey(home.getCheck_out_date(), "29/04/2023");
 	
}

@When("adults per room")
public void adults_per_room() {
	dropdown(home.getAdult_per_room(), "2");
    
	
}


@Then("childrens per room")
public void childrens_per_room() {
   
	dropdown(home.getChildren_per_room(), "0");
	cl(home.getSearch());
}




@Given("user select hotel")
public void user_select_hotel() {
	
	
   cl(hotel.getSelecthotel());
   
	
}
@When("user click continue button")
public void user_click_continue_button() {
  
	cl(hotel.getSearch());
	
}



@Given("user given first name")
public void user_given_first_name() {
  
	sendkey(bill.getFirst_name(), "dinesh");
}

@When("user given last name")
public void user_given_last_name() {
    
	sendkey(bill.getLast_name(), "P");
	
}

@When("user given address")
public void user_given_address() {
   
	sendkey(bill.getAddress(), "Mylappor, chennai-600028");
	
}

@When("user given credit card no")
public void user_given_credit_card_no() {
   
	sendkey(bill.getAddress(), "1647827849823736");
	
}

@When("user given expiry month")
public void user_given_expiry_month() {
   
	dropdown(bill.getCard_type(), "MAST");
	dropdown(bill.getExpiry_month(), "10");
}

@When("user given expiry year")
public void user_given_expiry_year() {
   
	dropdown(bill.getExpiry_year(), "2022");
	
}


@When("user given cvv no")
public void user_given_cvv_no() {
    sendkey(bill.getCvv_no(), "382");
	
}

@Then("user click the booknow button")
public void user_click_the_booknow_button() {
   
	cl(bill.getBook_now());
}



@Given("user click the my itinerary element")
public void user_click_the_my_itinerary_element() {
   cl(bill.getItinerary());
	
}


@Given("user select the order")
public void user_select_the_order() {
    cl(book.getCheck_all());
	
}

@When("user click the cancel selected butoon")
public void user_click_the_cancel_selected_butoon() {
    
	cl(book.getCancel_all());
	
}

@When("user accept the popup alert")
public void user_accept_the_popup_alert() {
    
	alert(driver);
}

@Then("user click the logout button")
public void user_click_the_logout_button() {
   cl(book.getLogout());
	
}


}
