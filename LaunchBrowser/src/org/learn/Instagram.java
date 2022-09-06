package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("Saran");
        String name = user.getAttribute("value");
        System.out.println(name);
        
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("SaranSaran");
        String pass1 = pass.getAttribute("value");
        System.out.println(pass1);
        
       
		
		
		
		
		
	}
	
	
}
