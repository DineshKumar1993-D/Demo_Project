package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Relative {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice\\Driver\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("---Incognito");
		
		option.addArguments("--start-maximized");
		
		option.addArguments("disable-popup-blocking");
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://affiliate.flipkart.com/login");
		
		//By Using id
		driver.findElement(By.
				id("inputEmail")).sendKeys("pdineshkumar03@gmail.com");
		//By Using name
		Thread.sleep(1500);
		driver.findElement(By.
				name("inputPassword")).sendKeys("9843099435");
		Thread.sleep(1500);
		//By Using ClassName
		driver.findElement(By.xpath
				("//input[@class='btn btn-default']")).click();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.amazon.in/");
		//By Using Index
		driver1.findElement(By.xpath("(//a[@data-csa-"
				+ "c-type='link'])[6]")).click();
		//By Using Basic Xpath
		driver1.findElement(By.xpath("//a[@id='nav-hamburger"
				+ "-menu']")).click();
		//By Using Contains text half
		driver1.findElement(By.xpath("//a[contains(text(),"
				+ "'Movers')]")).click();
		Thread.sleep(1500);
		//By Using text
		driver1.findElement(By.xpath("//a[text()="
				+ "'Amazon Renewed']")).click();
		Thread.sleep(1500);
		//By Using Contains attribute
		driver1.findElement(By.xpath("//a[contains"
				+ "(@data-csa-c-slot-id,'Ham')]")).click();
		
		Thread.sleep(1500);
		//By Using Linktext
		driver1.findElement(By.linkText("Flight Tickets")).click();
		//By Using Partial LinkText
		Thread.sleep(1500);
		
		driver1.findElement(By.partialLinkText("Create your Ama")).click();
	
	
	
	
	}

}
