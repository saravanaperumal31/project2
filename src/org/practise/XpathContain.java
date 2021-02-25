package org.practise;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContain {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.id("i-icon-profile"));
	findElement.click();
	
	driver.findElement(By.id("signInLink")).click();
	
	
	
	WebElement findElement2 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(findElement2);
	Thread.sleep(3000);
	
	
	WebElement findElement3 = driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']"));
	driver.switchTo().frame(findElement3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement findElement2 = driver.findElement(By.xpath("//div[contains(text(),'About redBus')]"));
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView('true')", findElement2);
//	
//	
//	
//	
//	Thread.sleep(5000);
//	
//	WebElement findElement = driver.findElement(By.xpath("//div[@class='desc-OP-new rest1 animate']"));
//	
//	String text = findElement.getText();
//	System.out.println(text);
//	
	
	
//	WebElement txtusername = driver.findElement(By.xpath("//input[contains(@id,'user')]"));
//	txtusername.sendKeys("Saravanaperumal@gmail.com");
//	String txtuname = txtusername.getAttribute("value");
//	System.out.println(txtuname);
//	
//	WebElement txtpasswrd = driver.findElement(By.xpath("//input[contains(@id,'pas')]"));
//	txtpasswrd.sendKeys("Saravana24252425");
//	String txtupass = txtpasswrd.getAttribute("value");
//	System.out.println(txtupass);
//	
//	driver.quit();
}
}





















//	WebElement txtadd = driver.findElement(By.xpath("//span[contains(text(),'No:11,')]"));
//	String text = txtadd.getText();
//	System.out.println(text);
//	
//	WebElement txtadd1 = driver.findElement(By.xpath("//span[contains(text(),'First ')]"));
//	String text1 = txtadd1.getText();
//	System.out.println(text1);
//	
//	WebElement txtadd2 = driver.findElement(By.xpath("//span[contains(text(),'padman')]"));
//	String text2 = txtadd2.getText();
//	System.out.println(text2);
//	
//	WebElement txtadd3 = driver.findElement(By.xpath("//span[contains(text(),'Adyar,')]"));
//	String text3 = txtadd3.getText();
//	System.out.println(text3);
//	
//	driver.quit();


