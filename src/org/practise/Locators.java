package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement button = driver.findElement(By.xpath("//input[@type='text']"));
	button.click();
	
	WebElement txtuserid = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	txtuserid.sendKeys("3664738");
	
	WebElement txtuserpass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
	txtuserpass.sendKeys("Deal@31");
}
}
