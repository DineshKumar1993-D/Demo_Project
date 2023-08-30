package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Css {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice\\Driver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();

		option.addArguments("---Incognito");

		option.addArguments("--start-maximized");

		option.addArguments("disable-popup-blocking");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.imdb.com/title/tt22444570/?ref_=nv_sr_srsg_0_tt_5_nm_3_q_ponni");
		
		WebElement te = driver.findElement(By.xpath("//div"
				+ "[contains(@class,'gtEgaf')]"));
				
	
		String text = te.getText();
		System.out.println(text);
	
	}
}
