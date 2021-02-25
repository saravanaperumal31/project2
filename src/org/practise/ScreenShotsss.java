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

public class ScreenShotsss {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\\\New folder\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();

	JavascriptExecutor js=(JavascriptExecutor)driver;

	WebElement clkword = driver.findElement(By.xpath("(//span[text()='Reviews'])[6]"));
	js.executeScript("arguments[0].scrollIntoView(true)",clkword);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File scst = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(scst);

	File des=new File("D:\\New folder\\Selenium\\ScreenShot\\toptrend.png");
	FileUtils.copyFile(scst, des);
	System.out.println("done");
	
}
}
