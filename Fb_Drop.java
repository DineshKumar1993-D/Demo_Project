package com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Fb_Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice1\\Driver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();

		option.addArguments("---Incognito");

		option.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath
				("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement
				(By.xpath("//select[@id='day']"));
		
		Select select = new Select(day);
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement web : options) {
			System.out.println(web.getText());
		}
		
//		select.selectByIndex(5);
//		System.out.println(select.getFirstSelectedOption()
//				.getText());
		select.selectByValue("5");
		System.out.println(select.getFirstSelectedOption()
				.getText());
		
	}

}
