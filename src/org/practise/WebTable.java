package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\\\New folder\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	driver.manage().window().maximize();
	List<WebElement> tables = driver.findElements(By.tagName("table"));
	int size = tables.size();
	System.out.println("Number of table is ...."+size);
	
	WebElement table1 = driver.findElement(By.xpath("//table[@border='l']"));
	List<WebElement> tablerows = table1.findElements(By.tagName("tr"));
	int rowSize = tablerows.size();
	System.out.println("Number of rows is...."+rowSize);
}
}
	
//	for (int i = 0; i <tablerows.size(); i++) {
//		WebElement eachrows = tablerows.get(i);
//		String text = eachrows.getText();
//		System.out.println(text);
//		
//	}
	
//	driver.close();
	

