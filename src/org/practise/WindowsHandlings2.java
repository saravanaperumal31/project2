package org.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlings2 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement txtsearch = driver.findElement(By.id("inputValEnter"));
	txtsearch.sendKeys("iphones");
	
	WebElement btnsearch = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
	btnsearch.click();
	
	WebElement clkfirst = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Blue']"));
	clkfirst.click();
	
	String parentid = driver.getWindowHandle();
	System.out.println(parentid);
	
	Set<String> allids = driver.getWindowHandles();
	System.out.println(allids);
	
	for (String each : allids) {
		if(!parentid.equals(each)) {
			driver.switchTo().window(each);
		}
		
	}

	WebElement addcartclk = driver.findElement(By.id("add-cart-button-id"));
	addcartclk.click();
	
	WebElement txtcost = driver.findElement(By.xpath("(//span[text()='Rs. 249'])[2]"));
	String text = txtcost.getText();
	System.out.println(text);
	
	
}
}
