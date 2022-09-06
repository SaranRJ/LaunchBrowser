package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeUsername {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		WebElement txtusr = driver.findElement(By.id("email"));
		txtusr.sendKeys("Saran");
		
		WebElement txtpass = driver.findElement(By.name("pass"));
		txtpass.sendKeys("Saran");
		driver.close();
		
	}
	
	
}
