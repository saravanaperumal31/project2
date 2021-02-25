package org.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlings {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("iphone x",Keys.ENTER);
	
	WebElement rclkname = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[2]"));
	Actions a=new Actions(driver);
	a.contextClick(rclkname).perform();
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	String parentId = driver.getWindowHandle();
	System.out.println(parentId);
	
	Set<String> allIds = driver.getWindowHandles();
	System.out.println(allIds);
	
	for (String eachid : allIds) {
		if(!parentId.equals(eachid)) {
			driver.switchTo().window(eachid);
			}}

	WebElement prntname = driver.findElement(By.id("price_inside_buybox"));
	String text = prntname.getText();
	System.out.println(text);
	driver.quit();
	

	
	
	
	
	
}
}
