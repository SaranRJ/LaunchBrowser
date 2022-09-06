package org.learn;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketIrctc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("CHENNAI EGMORE - MS");
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("COIMBATORE JN - CBE");
		driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='TATKAL']")).click();
		driver.findElement(By.xpath("//div[@role='button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'AC 2 Tier (2A)')]")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
//		driver.findElement(By.xpath("//span[text()='AC 3 Tier (3A)']")).click();
//		driver.findElement(By.xpath("(//div[@class='pre-avl'])[2]")).click();
//		driver.findElement(By.xpath("//button[text()=' Book Now ']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

}
