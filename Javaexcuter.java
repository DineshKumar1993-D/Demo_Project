package com.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javaexcuter {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice1\\Driver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--incognito");

		option.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(200,1000)");

	}

}
