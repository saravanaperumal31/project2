package org.practise;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	List<WebElement> framescnt = driver.findElements(By.tagName("iframes"));
	int size = framescnt.size();
	System.out.println(size);
	
	driver.switchTo().frame(0);
	
	WebElement clkcnt = driver.findElement(By.xpath("//input[@type='submit']"));
	clkcnt.click();
//	clkcnt.sendKeys("25436625");
	
//	WebElement clkcnti = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
//	clkcnti.click();
	
//	Thread.sleep(4000);
//	WebElement clklog = driver.findElement(By.xpath("//input[@type='text']"));
//	clklog.click();
	Alert a=driver.switchTo().alert();
	String text = a.getText();
//	System.out.println(text);
//	splalrt.accept();

}
}
