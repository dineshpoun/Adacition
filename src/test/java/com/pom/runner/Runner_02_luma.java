package com.pom.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pack.Base_Demo01;

import luma_booking.Login_luma;

public class Runner_02_luma extends Base_Demo01 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);

		maxi(driver);

		link(driver, "https://magento.softwaretestingboard.com/");

		Login_luma luma = new Login_luma(driver);

		Thread.sleep(3000);
		cl(luma.getMens());

		cl(luma.getShorts());

		cl(luma.getRedcolourshorts());

		Thread.sleep(2000); 

		cl(luma.getShortssize());

		cl(luma.getShortscolour());
		Thread.sleep(2000); 
		cl(luma.getAddcard());

		Thread.sleep(3000); 
		cl(luma.getCheckout());
		
		Thread.sleep(3000);
		cl(luma.getProceed());
		
		Thread.sleep(3000);
		sendkey(luma.getEmailid(), "dinesh@gmail.com");
		
		Thread.sleep(3000);
		sendkey(luma.getFirstname()	, "dinesh");
		
		Thread.sleep(3000);
		sendkey(luma.getLastname(), "pounraj");
		
		Thread.sleep(3000);
		sendkey(luma.getCompany(), "axess");
		
		Thread.sleep(3000);
		sendkey(luma.getStreet(), "6/14 pakthavatsalam street ,s.t.puramtheni");
		
		Thread.sleep(3000);
		sendkey(luma.getCity(), "theni");
		
		Thread.sleep(3000);
		dropdown(luma.getState(), "58");
		
		Thread.sleep(3000);
		sendkey(luma.getZip(), "12345");
		
		Thread.sleep(3000);
		dropdown(luma.getCountry(), "US");
		
		Thread.sleep(3000);
		sendkey(luma.getPhone(), "9500613978");
		
		Thread.sleep(3000);
		cl(luma.getShipping());
		
		Thread.sleep(3000);
		cl(luma.getNext());


		Thread.sleep(3000);
		cl(luma.getOrder());
		
		
		
		
		
		

	}
}
