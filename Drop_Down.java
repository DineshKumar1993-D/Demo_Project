package com.java;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice1\\Driver\\chromedriver.exe");

//		ChromeOptions option = new ChromeOptions();
//
//		option.addArguments("---Incognito");
//
//		option.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		
		System.out.println("Single DropDown");

		WebElement sele = driver.findElement(By.id("oldSelectMenu"));

		Select select = new Select(sele);

		List<WebElement> options = select.getOptions();

		for (WebElement web : options) {
			System.out.println(web.getText());
		}
		
		System.out.println("Select by index");
		
		select.selectByIndex(2);
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		System.out.println("Select by value");
		
		select.selectByValue("5");
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		System.out.println("Select by visible text");
		
		select.selectByVisibleText("Aqua");
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		boolean multiple2 = select.isMultiple();
		System.out.println(multiple2);
		
		System.out.println("Multiple DropDown");
		
		WebElement sel = driver.findElement(By.id("cars"));
	
		Select select1 = new Select(sel);
		
		List<WebElement> option1 = select1.getAllSelectedOptions();
	
		for (WebElement webE : option1) {
			System.out.println(webE.getText());
		}
	
		if(select1.isMultiple()) {
			
		select1.selectByIndex(0);
		select1.selectByValue("opel");
		select1.selectByVisibleText("Saab");
		}
		boolean multiple = select1.isMultiple();
		System.out.println(multiple);
	//	select1.deselectByIndex(0);
	//	select1.deselectAll();
	
		
		
		
	
	}

}
