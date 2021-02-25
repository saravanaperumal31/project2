package org.practise;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	List<WebElement> framescnt = driver.findElements(By.tagName("frameset"));
	int size = framescnt.size();
	System.out.println(size);

	Thread.sleep(5000);
	driver.switchTo().frame(0);
	WebElement clkcnt = driver.findElement(By.xpath("//input[@type='text']"));
	clkcnt.sendKeys("25436625");
	
	WebElement clkcnti = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	clkcnti.click();
	
	
//	Alert simplealert = driver.switchTo().alert();
//	String text = simplealert.getText();
//	System.out.println(text);
//	simplealert.accept();

	
//	Thread.sleep(5000);
	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	WebElement txtpass = driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
//	txtpass.sendKeys("834748379876");
//	js.executeScript("arguments[0].setAttribute('value','2345679345')",txtpass);
	
//	WebElement clklog = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
//	clklog.click();
}
}
	
//	WebElement txtpass = driver.findElement(By.xpath("(//span[@class='pwd_field'])[2]"));
//	Object obj = js.executeScript("return arguments[0].getAttribute('value')",txtpass);
//	System.out.println(obj);
//	String pass=(String)obj;
//	System.out.println(pass);
	
	
//	Alert simplealert = driver.switchTo().alert();
//	String text = simplealert.getText();
//	System.out.println(text);
//	simplealert.accept();

