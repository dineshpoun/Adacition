package com.pom.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pack.Base_Demo01;

import adacitin_hotel_com.Adacitin_Login_Page;
import adacitin_hotel_com.Adacitin_homepage;
import adacitin_hotel_com.Billing_details;
import adacitin_hotel_com.Bookes_itirnerary;
import adacitin_hotel_com.Select_hotel;

public class Runner_Class extends Base_Demo01{
	
	
	public static void main(String[] args) throws IOException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(op);
		
		maxi(driver);
		
		link(driver, "http://www.adactinhotelapp.com/index.php");
		
		Adacitin_Login_Page lo = new Adacitin_Login_Page(driver);
		sendkey(lo.getUsername(), "dineshpoun");
		sendkey(lo.getPassword(), "pass123");
	
		
		cl(lo.getLogin());
		
		Adacitin_homepage home=new Adacitin_homepage(driver);
		
		dropdown(home.getLocation()	, "Sydney");
		
		dropdown(home.getHotels(), "Hotel Creek");
		
		dropdown(home.getRoomtype(), "Deluxe");
		
		dropdown(home.getNo_of_rooms(), "2");

		clear(home.getCheck_in_date());
		home.getCheck_in_date().sendKeys("28/04/2023");
		
		clear(home.getCheck_out_date());
		home.getCheck_out_date().sendKeys("30/04/2023");
		
		dropdown(home.getAdult_per_room(), "2");
		
		dropdown(home.getChildren_per_room(), "2");
		
		cl(home.getSearch());
		
		Select_hotel selecthotel=new Select_hotel(driver);
		
		cl(selecthotel.getSelecthotel());
		
		cl(selecthotel.getSearch());
		
		Billing_details bill=new Billing_details(driver);
		
		sendkey(bill.getFirst_name(), "dinesh");
		
		sendkey(bill.getLast_name(), "Poun raj");
		
		sendkey(bill.getAddress(), ",thiruporur Chennai");
		
		sendkey(bill.getCredit_card_no(), "1234567891022335");
		
		dropdown(bill.getCard_type(), "AMEX");
		
		dropdown(bill.getExpiry_month(), "5");
		
		dropdown(bill.getExpiry_year(), "2022");
		
		sendkey(bill.getCvv_no(), "388");
		
		cl(bill.getBook_now());
		
		cl(bill.getItinerary());
		
		Bookes_itirnerary i=new Bookes_itirnerary(driver);
		
		cl(i.getCheck_all());
		
		
		
		cl(i.getCancel_all());
		
		alert(driver);
		
		
		cl(i.getLogout());
		
		screenshot1(driver , "C:\\Users\\DELL\\eclipse-workspace\\Maven_Practice\\screenshot\\Ag.png");
		
		
	}
	
	
	
	
	

}
