package org.practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waitss {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Thread.sleep(2000);
	FluentWait<WebDriver>wt=new FluentWait<WebDriver>(d)
			.withTimeout(Duration.ofSeconds(50)).
			pollingEvery(Duration.ofSeconds(4)).ignoring(Throwable.class);
	wt.until(ExpectedConditions.alertIsPresent());
}
}
