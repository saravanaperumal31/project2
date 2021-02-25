package org.practise;

import java.io.File;
import java.io.IOException;

//import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot {
public static void main(String[] args) throws IOException  {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	WebDriverWait w=new WebDriverWait(driver,20);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File screenshot = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshot);
	
	File f=new File("D:\\New folder\\Selenium\\ScreenShot\\greens1.png");
	FileUtils.copyFile(screenshot,f);
	System.out.println("done");
	driver.quit();
	
}
}
