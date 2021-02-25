package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://output.jsbin.com/osebed/2");
	
	WebElement drpdwnmul = driver.findElement(By.id("fruits"));
	Select s= new Select(drpdwnmul);
	
	boolean multi= s.isMultiple();
	System.out.println(multi);
	List<WebElement> options = s.getOptions();
	System.out.println("All selected Options are...");
	for (int i = 0; i <options.size(); i++) {
			s.selectByIndex(i);
			List<WebElement> opts = s.getOptions();
			WebElement q = opts.get(i);
			String txt = q.getText();
			System.out.println(txt);
		
		}
	WebElement frstselctopt = s.getFirstSelectedOption();
	String text = frstselctopt.getText();
	System.out.println("First Selected option is..."+text);
}
}
//	System.out.println("Options not selected are...");
//	for (int i = 0; i <options.size(); i++) {
//		if(i%2==1) {
//			s.selectByIndex(i);
//			List<WebElement> opt = s.getOptions();
//			WebElement e = opt.get(i);
//			String text = e.getText();
//			System.out.println(text);
		
	
	
//	for (int i = 1; i < options.size(); i++) {
//		if(i%2==1) {
//			WebElement op = options.get(i);
//			String text = op.getText();
//			System.out.println(text);
//			}
//	}

//List<WebElement> op = s.getOptions();
//System.out.println("Even fruits in option");
//for (int i = 0; i <op.size(); i++) {
//	if(i%2==0) {
//		WebElement opt = op.get(i);
//		String text = opt.getText();
//		System.out.println(text);
//	}
//}
//System.out.println("number of options not selected");
//for (int j = 0; j<op.size(); j++) {
//	if(j%2==1) {
//		WebElement opt = op.get(j);
//		String text = opt.getText();
//		System.out.println(text);
//	}

