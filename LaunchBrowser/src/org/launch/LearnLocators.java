package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		String title = driver.getTitle();
//		System.out.println("Title:"+title);
//		WebElement txtuser = driver.findElement(By.id("email"));
//		txtuser.sendKeys("saran@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("54673498");
//		driver.quit();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.redbus.in/");
//		String url = driver.getCurrentUrl();
//		System.out.println("URL:"+url);
//		driver.findElement(By.className("db")).sendKeys("Chennai");
//		driver.findElement(By.className("db")).sendKeys("Coimbatore");
			
//		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(" https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("GreensTechnology");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		String title = driver.getTitle();
//		System.out.println("Title:"+title);
//        driver.findElement(By.name("DUMMY1")).sendKeys("17629876");
//        driver.findElement(By.name("AuthenticationFG.ACCESS_CODE")).sendKeys("jahsyd");

//		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Saran");
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("R");
//		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("No:FON,Tambaram,Chennai-97");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rj@gmail.com");
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("987654456");
//		driver.findElement(By.xpath("//input[@type='radio']")).click();
//		driver.findElement(By.id("checkbox1")).click();
//		driver.findElement(By.id("firstpassword")).sendKeys("hakala");
//		driver.findElement(By.id("secondpassword")).sendKeys("hakala");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
//		driver.findElement(By.id("username")).sendKeys("Saran");
//		driver.findElement(By.id("password")).sendKeys("lalala");
//		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		String title = driver.getTitle();
		System.out.println("Title:"+title);
        driver.findElement(By.name("DUMMY1")).sendKeys("17629876");
       // driver.findElement(By.name("AuthenticationFG.ACCESS_CODE")).sendKeys("jahsyd");

		
		
	}
}
