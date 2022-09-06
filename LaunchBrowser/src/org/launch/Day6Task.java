package org.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray;

public class Day6Task {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		
		//driver.findElement(By.id("heading303")).click();
//		WebElement day = driver.findElement(By.linkText("DAY 6 TASK"));
//		a.contextClick(day).perform();
//		
//		for(int i=0;i<=6;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//		    r.keyRelease(KeyEvent.VK_DOWN);
//  	}
		
//		r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);   
	//	r.keyPress(KeyEvent.VK_ENTER);
	//	r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
//		driver.findElement(By.xpath("//button[(text()='✕')]")).click();
//		
//		WebElement fashion = driver.findElement(By.xpath("//div[@class='_1psGvi SLyWEo']"));
//		a.moveToElement(fashion).perform();
//		
//		WebElement foot = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[4]"));
//		a.moveToElement(foot).perform();
//		
//		driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]")).click();
//		
//		WebElement shoe = driver.findElement(By.xpath("//div[@class='_312yBx SFzpgZ']"));
//		a.contextClick(shoe).perform();
//		
//		for (int i = 0; i <6; i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//----------Que 10----------
//		WebElement slip = driver.findElement(By.xpath("(//a[@class='product-card dp-widget-link'])[5]"));
//	    //slip.click();
//		a.contextClick(slip).perform();
//	      
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
		
		//----------Que 9--------
//	   	WebElement sign = driver.findElement(By.id("nav-link-accountList"));
//		a.moveToElement(sign).perform();
//		
//		driver.findElement(By.xpath("//a[@class='nav-action-button']")).click();
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("Saran");
//		a.doubleClick(email).perform();
//		a.contextClick(email).perform();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//------------Que 8----------
//		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	    email.sendKeys("Saran");
//	    a.doubleClick(email).perform();
//	    
//	    r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_C);
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_C);  
//	    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		a.click(pass).perform();	
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
		//------------Que 7--------
//		driver.findElement(By.id("heading303")).click();
//		WebElement day = driver.findElement(By.linkText("DAY 6 TASK"));
//		a.contextClick(day).perform();
//		
//		for(int i=0;i<=6;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//		    r.keyRelease(KeyEvent.VK_DOWN);
//  	}
		
//		r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);   
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//-----Que 6--------
//		WebElement rpa = driver.findElement(By.linkText("RPA"));
//		a.contextClick(rpa).perform();
//	
//		for(int i=0;i<6;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);	
		
		//----------Que 5----------
//		WebElement resume = driver.findElement(By.xpath("//div[@id='heading201']"));
//		resume.click();
//		driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[4]")).click();
//		a.contextClick().perform();
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
		
		//----------Que 4---------
//		WebElement frame = driver.findElement(By.id("interview-question1-accordion"));
//		a.contextClick(frame).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);	
//		r.keyPress(KeyEvent.VK_ENTER);
			
		
		//-------Que 3------
//		WebElement inter = driver.findElement(By.id("heading20"));
//		inter.click();
//		WebElement cts = driver.findElement(By.xpath("(//li[@class='pointer'])[6]"));
//		a.contextClick(cts).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//--------Que 2-------
//		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
//		name.sendKeys("VelMurugan");
//		a.doubleClick(name).perform();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_X);
		
		
		//--------Que 1--------
//		WebElement txtusr = driver.findElement(By.id("email"));
//		txtusr.sendKeys("Saran");
//		a.doubleClick(txtusr).perform();
//		a.contextClick(txtusr).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		WebElement pass = driver.findElement(By.id("pass"));
//		a.contextClick(pass).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}

