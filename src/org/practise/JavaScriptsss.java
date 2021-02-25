package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptsss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	WebElement txtuser = driver.findElement(By.name("username"));
	JavascriptExecutor a= (JavascriptExecutor)driver;
	a.executeScript("arguments[0].setAttribute('value','saravana')",txtuser);
	Object obj1 = a.executeScript("return arguments[0].getAttribute('value')",txtuser);
	String user=(String)obj1;
	System.out.println(user);
	
	WebElement txtpass = driver.findElement(By.name("password"));
	a.executeScript("arguments[0].setAttribute('value','123456')",txtpass);
	Object obj = a.executeScript("return arguments[0].getAttribute('value')",txtpass);
	String pass=(String)obj;
	System.out.println(pass);
	
	WebElement clk = driver.findElement(By.name("login"));
	a.executeScript("arguments[0].click()",clk);
}
}
