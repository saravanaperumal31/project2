package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.flipkart.com");
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL is..."+currentUrl);
	
//	WebElement mvecusor = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	
//	Actions a=new Actions(driver);
//	a.moveToElement(mvecusor).perform();
//	
//	a.click(mvecusor).perform();
//	
	Thread.sleep(6000);
//	
//	WebElement mvecur1 = driver.findElement(By.xpath("//span[contains(text(),'Home & ')]"));
//	a.moveToElement(mvecur1).perform();
//	
//	Thread.sleep(6000);
//	
//	WebElement btnclk = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
//	a.click(btnclk).perform();
//
//	Thread.sleep(5000);
//	WebElement txtpdt = driver.findElement(By.xpath("//a[contains(text(),'Dolphin')]"));
//	String text = txtpdt.getText();
//	System.out.println(text);
//	
//	driver.quit();
	
}
}


//a[contains(text(),'Dolphin')]