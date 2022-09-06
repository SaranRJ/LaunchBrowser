package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver","C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\LaunchBrowser\\\\Driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	}
}
