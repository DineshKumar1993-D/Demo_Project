package com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Window_Handle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Weekend_Pratice1\\Driver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--incognito");

		option.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");

		String wi = driver.getWindowHandle();
		String title2 = driver.switchTo().window(wi).getTitle();
		System.out.println(title2);

		WebElement win = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));

		Actions act = new Actions(driver);

		act.contextClick(win).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(2500);
		Set<String> window = driver.getWindowHandles();

		for (String string : window) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);

		}
		Thread.sleep(1500);
		driver.switchTo().window(wi);
	}

}
