package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement btnclk = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	btnclk.click();
	Thread.sleep(5000);
	
	WebElement drpyr = driver.findElement(By.id("day"));
	Select s=new Select(drpyr);
	
	List<WebElement> options = s.getOptions();
	for (int i = 1; i < options.size(); i++) {
		if(i%2==0) {
			WebElement op = options.get(i);
			String text = op.getText();
			System.out.println(text);
			}
	}
	}
}
