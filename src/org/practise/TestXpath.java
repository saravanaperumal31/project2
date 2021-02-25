package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.redbus.in/");
	
	WebElement btnclick = driver.findElement(By.xpath("//div[@class='toparrowhead-sign]"));
	btnclick.click();

}
}
