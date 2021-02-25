package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/courses.html");
	
//	WebElement mvecurs1 = driver.findElement(By.xpath("//div[text()='Courses ']"));
	Actions a=new Actions(driver);
//	a.moveToElement(mvecurs1).perform();
//	
//	WebElement mvecurs2 = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
//	a.moveToElement(mvecurs2).perform();
//	Thread.sleep(1000);
//	WebElement btnsql = driver.findElement(By.xpath("(//a[text()='View All Courses'])[8]"));
//	a.click(btnsql).perform();	
	
	WebElement mvecurs3 = driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));
	Actions b=new Actions(driver);
	b.moveToElement(mvecurs3).perform();
	
	WebElement mvecurs4 = driver.findElement(By.xpath("(//a[text()='Data Warehousing Training '])[1]"));
	b.moveToElement(mvecurs4).perform();
	
	WebElement btnclk = driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
	b.click(btnclk).perform();

}
}
	
//	WebElement mvecurs3 = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
//	a.moveToElement(mvecurs3).perform();
//	

//	
//	Thread.sleep(5000);
//	
//	WebElement txtprdt = driver.findElement(By.xpath("//span[text()='LG Electronics']"));
//	
//	String text = txtprdt.getText();
//	System.out.println(text);
//
//	driver.quit();

