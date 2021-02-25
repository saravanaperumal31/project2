package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
	WebElement drpcntry = driver.findElement(By.name("country"));
	Select s=new Select(drpcntry);
	
	List<WebElement> options = s.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement op = options.get(i);
		String text = op.getAttribute("value");
		System.out.println(text);
	}
}
}
