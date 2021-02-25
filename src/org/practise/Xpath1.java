package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> txtusername = driver.findElements(By.xpath("//input[@type='text']"));
		WebElement txtuser = txtusername.get(0);
		txtuser.sendKeys("Saravana");
		
		WebElement txtpass = txtusername.get(1);
		txtpass.sendKeys("Perumal");
		
		WebElement txtaddss = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtaddss.sendKeys("Plot no 14 Ongc First Main Road Karaikal");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("sharavan1100@gmail.com");
		
		WebElement txtph = driver.findElement(By.xpath("//input[@type='tel']"));
		txtph.sendKeys("9484494494");
		
		WebElement radiobtngen= driver.findElement(By.xpath("//input[@type='radio']"));
		radiobtngen.click();
		
		WebElement chkboxhob= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		chkboxhob.click();
		
	
		
		
}
}