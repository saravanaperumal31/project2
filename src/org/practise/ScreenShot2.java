package org.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot2 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement clkbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	clkbtn.click();
	
	Actions a= new Actions(driver);
	WebElement msewom = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"));
	a.moveToElement(msewom).perform();

	TakesScreenshot tk=(TakesScreenshot)driver;
	File scht = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(scht);
	
	File f=new File("D:\\New folder\\Selenium\\ScreenShot\\flipkart3.png");
	FileUtils.copyFile(scht, f);
	System.out.println("done");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	TakesScreenshot tk=(TakesScreenshot)driver;
//	File screenshot = tk.getScreenshotAs(OutputType.FILE);
//	System.out.println(screenshot);
//	
//	File f=new File("D:\\New folder\\Selenium\\ScreenShot\\greens.png");
//	FileUtils.copyFile(screenshot,f);
//	System.out.println("done");
	
}
}
