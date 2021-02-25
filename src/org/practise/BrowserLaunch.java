package org.practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.gmail.com");
WebElement user = driver.findElement(By.id("identifierId"));
user.sendKeys("greens@gmail.com");
Alert a= driver.switchTo().alert();
}
}
