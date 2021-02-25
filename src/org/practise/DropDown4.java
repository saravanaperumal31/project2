package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	WebElement txtuser = driver.findElement(By.name("username"));
	txtuser.sendKeys("saravanaperumal");
	WebElement txtpass = driver.findElement(By.name("password"));
	txtpass.sendKeys("Saravana@31");
	WebElement btnclk = driver.findElement(By.id("login"));
	btnclk.click();
	WebElement drpdwnloc = driver.findElement(By.id("location"));
	Select s=new Select(drpdwnloc);
	s.selectByVisibleText("London");
//	WebElement drpdwnloc = driver.findElement(By.id("location"));
//	Select s=new Select(drpdwnloc);
//	List<WebElement> op = s.getOptions();
//	for (int i = 0; i < op.size(); i++) {
//		WebElement opt = op.get(i);
//		String text = opt.getText();
//		System.out.println(text);
	
	WebElement drpdwnhotl = driver.findElement(By.id("hotels"));
	Select s1=new Select(drpdwnhotl);
	s1.selectByVisibleText("Hotel Hervey");
	
	WebElement drpdwnrt = driver.findElement(By.id("room_type"));
	Select s2=new Select(drpdwnrt);
	s2.selectByVisibleText("Deluxe");
	
	WebElement drpdwnnor = driver.findElement(By.id("room_nos"));
	Select s3=new Select(drpdwnnor);
	s3.selectByVisibleText("2 - Two");
	
	WebElement drpdwnapr = driver.findElement(By.id("adult_room"));
	Select s4=new Select(drpdwnapr);
	s4.selectByVisibleText("2 - Two");
	
	WebElement drpdwncpr = driver.findElement(By.id("child_room"));
	Select s5=new Select(drpdwncpr);
	s5.selectByVisibleText("0 - None");
	
	WebElement btnsubmt = driver.findElement(By.id("Submit"));
	btnsubmt.click();
	
	WebElement rbtn = driver.findElement(By.id("radiobutton_0"));
	rbtn.click();
	
	WebElement btncnti = driver.findElement(By.id("continue"));
	btncnti.click();
	Thread.sleep(3000);
	
	WebElement txtname = driver.findElement(By.id("first_name"));
	txtname.sendKeys("Saravana");
	
	WebElement txtlname = driver.findElement(By.id("last_name"));
	txtlname.sendKeys("Perumal");
	 WebElement txtadd = driver.findElement(By.id("address"));
	 txtadd.sendKeys("East view Street Pondicherry");
	
	WebElement ccdnum = driver.findElement(By.id("cc_num"));
	ccdnum.sendKeys("1234567890765432");

	WebElement drpdwnccd = driver.findElement(By.id("cc_type"));
	Select s6=new Select(drpdwnccd);
	s6.selectByVisibleText("VISA");
	
	WebElement drpdwnmn = driver.findElement(By.id("cc_exp_month"));
	Select s7=new Select(drpdwnmn);
	s7.selectByVisibleText("February");
	
	WebElement drpdwnyr = driver.findElement(By.id("cc_exp_year"));
	Select s8=new Select(drpdwnyr);
	s8.selectByVisibleText("2022");
	
	WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
	txtcvv.sendKeys("256");
	
	WebElement btnbk = driver.findElement(By.id("book_now"));
	btnbk.click();
	
	Thread.sleep(6000);
	
	WebElement txtorderno = driver.findElement(By.xpath("(//input[@class='disable_text'])[15]"));
	String attribute = txtorderno.getAttribute("value");
	System.out.println(attribute);
	}
}
