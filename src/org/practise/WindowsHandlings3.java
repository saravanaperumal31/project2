package org.practise;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandlings3 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement txtsearch = driver.findElement(By.id("headerSearch"));
	txtsearch.sendKeys("ceiling fans");
	
	WebElement btnsearch = driver.findElement(By.xpath("//button[@title='Submit Search']"));
	btnsearch.click();
	
	WebElement clkfirst = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
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

	WebElement addcartclk = driver.findElement(By.xpath("(//div[text()='Control Type Included'])[2]"));
	addcartclk.click();
//	
//	WebElement txtcost = driver.findElement(By.xpath("(//span[text()='Rs. 249'])[2]"));
//	String text = txtcost.getText();
//	System.out.println(text);
//	
	
}
}
