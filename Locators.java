package com.java;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice\\Driver\\chromedriver.exe");
	
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("---Incognito");
		
		option.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(option);
	
		driver.get("https://www.facebook.com/");
		
		System.out.println("Locators");
		
		System.out.println("==By Using id Name==");
		
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("Dinesh@123");
		Thread.sleep(1000);
		
		System.out.println("==By Using Name==");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("16524hghhj");
		Thread.sleep(1500);
		
		System.out.println("==By Using Class Name==");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
	
		driver1.get("https://www.amazon.in/");
		
		System.out.println("==Using LinkText==");
		
		WebElement linkt = driver1.findElement(By.linkText("Mobiles"));
		linkt.click();
		Thread.sleep(1000);
		
		System.out.println("==Partial Link Text==");
		
		WebElement part = driver1.findElement(By.partialLinkText("Today's"));
		part.click();
		
		
	}

}
