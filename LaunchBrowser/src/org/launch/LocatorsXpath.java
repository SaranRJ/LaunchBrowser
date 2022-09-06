package org.launch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
       	driver.get(" https://www.redbus.in/");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Saran");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lalala");
//        driver.findElement(By.xpath("//button[@name='login']")).click();
//       
       	
           //driver.findElement(By.id("sign-in-icon-down")).click();
    
    
    

       	
        
        
        
        
        
        
	}

}
