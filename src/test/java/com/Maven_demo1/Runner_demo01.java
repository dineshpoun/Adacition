package com.Maven_demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pack.Base_Demo01;

public class Runner_demo01 extends Base_Demo01{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver d1=new ChromeDriver(op);
		
		//url("https://www.google.com/");
		maxi(d1);
		
		
		
		d1.get("https://www.google.com/");
		
		
		
		
		
		
		
		
	}

}
