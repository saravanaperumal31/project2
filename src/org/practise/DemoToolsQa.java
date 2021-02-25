package org.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoToolsQa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	List<WebElement> txtboxname = driver.findElements(By.xpath("//input[@type='text']"));
	WebElement userfirst = txtboxname.get(0);
	userfirst.sendKeys("Saravana");
	WebElement userlast = txtboxname.get(1);
	userlast.sendKeys("Perumal");
	
	driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Plot 14 Ongc First Main Road Neravy karaikal");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sharavan1100@gmail.com");
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9489257947");
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (int i = 0; i < checkbox.size(); i++) {
		checkbox.get(i).click();
	}
	driver.findElement(By.id("msdd")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='English']")).click();
	WebElement drpdownskill = driver.findElement(By.id("Skills"));
	Select s= new Select(drpdownskill);
	s.selectByVisibleText("Android");
	WebElement drpdwncountries = driver.findElement(By.id("countries"));
	Select s1= new Select(drpdwncountries);
	s1.selectByValue("India");
	WebElement selct2 = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
	selct2.click();
	WebElement clk = driver.findElement(By.id("select2-country-container"));
	clk.sendKeys("India");
	
}
}
