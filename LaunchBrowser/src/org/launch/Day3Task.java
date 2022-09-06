package org.launch;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task {

	public static void main(String[] args) {

		
		//-------------gmail form-------------
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
//		driver.findElement(By.id("firstName")).sendKeys("Saran");
//		driver.findElement(By.id("lastName")).sendKeys("R");
//		driver.findElement(By.id("username")).sendKeys("sr0438535");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gsgsgs12@");
//		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("gsgsgs12@");
//		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
//		driver.findElement(By.id("phoneNumberId")).sendKeys("9865436786");
		
		
		
		//---------------Swiggy----------
	  
	    driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
	    driver.findElement(By.id("mobile")).sendKeys("9626384085");
	    driver.findElement(By.id("name")).sendKeys("Saran");
	    driver.findElement(By.id("email")).sendKeys("hgfvb@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("kjdfghj");
	    driver.findElement(By.xpath("//a[@class='a-ayg']")).click();  
		
		
	}

}
