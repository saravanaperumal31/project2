package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demoqa.com/automation-practice-form/");
	
	JavascriptExecutor a=(JavascriptExecutor)driver;
	WebElement clkscl = driver.findElement(By.xpath("//div[text()='Select State']"));
	a.executeScript("arguments[0].scrollIntoView('true')",clkscl);
	WebElement clkste = driver.findElement(By.xpath("//div[text()='Select State']"));
	clkste.click();
	
	WebElement drpclk = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
	drpclk.click();
	 WebElement txt = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
	 String text = txt.getText();
	 System.out.println(text);
	 
	 WebElement clkste1 = driver.findElement(By.id("state"));
	 clkste1.click();
	 
	 WebElement drpclh2 = driver.findElement(By.xpath("//div[text()='Rajasthan']"));
	 drpclh2.click();
	 WebElement txt2 = driver.findElement(By.xpath("//div[text()='Rajasthan']"));
	 String text2 = txt2.getText();
	 System.out.println(text2);
	 
	 WebElement clkcity = driver.findElement(By.xpath("//div[text()='Select City']"));
	 clkcity.click();
	 
	 WebElement drpclk3 = driver.findElement(By.xpath("//div[text()='Jaiselmer']"));
	 drpclk3.click();
	 
	 WebElement txtdrp = driver.findElement(By.xpath("//div[text()='Jaiselmer']"));
	 String text3 = txtdrp.getText();
	 System.out.println(text3);
	
}
}
