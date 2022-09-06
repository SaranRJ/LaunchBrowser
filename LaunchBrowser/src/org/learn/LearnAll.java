package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAll {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select drop = new Select(dropdown);
		drop.selectByIndex(4);
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1 = new Select(dropdown1);
		drop1.selectByVisibleText("Automobile");
		
		WebElement fname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fname.sendKeys("Rj");
		String att = fname.getAttribute("value");
		System.out.println(att);
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("MSD");
		
		WebElement code = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		code.clear();
		code.sendKeys("+91");
		//code.getAttribute("value");
		
		//driver.close();
		
		
		
	}

}
