package com.pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Demo01 {
	public static WebDriver driver;

	public static void maxi(WebDriver d) {

		d.manage().window().maximize();

	}

	public static void link(WebDriver d, String v) {
		d.get(v);

	}

	public static void title(WebDriver d) {

		String title = d.getTitle();
		System.out.println(title);
	}

	public static void currenturl(WebDriver d) {
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void toswitch(WebDriver d) {
		d.switchTo();
	}

	public static void pagesource(WebDriver d) {
		String pageSource = d.getPageSource();
		System.out.println(pageSource);

	}

	public static void back(WebDriver d) {
		d.navigate().back();

	}

	public static void forward(WebDriver d) {
		d.navigate().forward();

	}

	public static void fresh(WebDriver d) {
		d.navigate().refresh();

	}

	public static void cl(WebElement E) {

		E.click();
	}

	public static void sendkey(WebElement E, String str) {

		E.sendKeys(str);
	}

	public static void clear(WebElement E) {

		E.clear();

	}

	public static void gettext(WebElement E) {

		String text = E.getText();
		System.out.println(text);

	}

	public static void displayed(WebElement E) {

		boolean displayed = E.isDisplayed();
		System.out.println(displayed);

	}

	public static void enabled(WebElement E) {

		boolean enabled = E.isEnabled();
		System.out.println(enabled);

	}

	public static void selected(WebElement E) {

		boolean selected = E.isSelected();
		System.out.println(selected);

	}

	public static void attribute(WebElement E, String a) {

		String attribute = E.getAttribute(a);
		System.out.println(attribute);

	}

	public static void tagname(WebElement E) {

		String tagName = E.getTagName();
		System.out.println(tagName);

	}

	public static void location(WebElement E) {

		Point location = E.getLocation();
		System.out.println(location);

	}

	public static void size(WebElement E) {

		Dimension size = E.getSize();
		System.out.println(size);

	}

	public static void cssvalue(WebElement E, String css) {

		String cssValue = E.getCssValue(css);
		System.out.println(cssValue);

	}

	public static void rectangle(WebElement E) {

		Rectangle rect = E.getRect();
		System.out.println(rect);

	}

	public static void alert(WebDriver d) {
		d.switchTo().alert().accept();

	}

	public static void dropdown(WebElement E, String option) {

		Select dropdown = new Select(E);
		dropdown.selectByValue(option);

	}

	public void dragAndDrop(WebDriver d, WebElement E1, WebElement E2) {
		Actions action = new Actions(d);
		action.dragAndDrop(E1, E2).perform();

	}

	public void mouseover(WebDriver d, WebElement element) {

		Actions action = new Actions(d);
		action.moveToElement(element).build().perform();

	}

	public static void click(WebDriver d, WebElement element) {

		Actions action = new Actions(d);
		action.click(element).build().perform();

	}
//		
//		public static void screenshot(WebDriver d,String path) throws IOException {
//			TakesScreenshot ts = (TakesScreenshot) d;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//			File f = new File(path);
//			
//			
//			
//			
//		}

	public static void screenshot1(WebDriver d, String path2) throws IOException {
		TakesScreenshot ts1 = (TakesScreenshot) d;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File f1 = new File(path2);
		FileUtils.copyFile(source, f1);

	}

	public void down() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public void enter() throws AWTException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void close(WebDriver d) {

		d.close();
	}

	public static void quit(WebDriver d) {
		d.quit();
	}

}
