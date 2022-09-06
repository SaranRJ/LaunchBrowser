package org.launch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Task {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Actions a = new Actions(driver);
		// WebElement from = driver.findElement(By.xpath("(//a[@class='button
		// button-orange'])[5]"));
		// WebElement to = driver.findElement(By.id("bank"));
		// a.dragAndDrop(from, to).perform();
		//
		// WebElement from1 = driver.findElement(By.xpath("(//a[@class='button
		// button-orange'])[2]"));
		// WebElement to1 = driver.findElement(By.id("amt7"));
		// a.dragAndDrop(from1, to1).perform();
		//
		// WebElement from2 = driver.findElement(By.xpath("(//a[@class='button
		// button-orange'])[6]"));
		// WebElement to2 = driver.findElement(By.id("loan"));
		// a.dragAndDrop(from2, to2).perform();
		//
		// WebElement from3 = driver.findElement(By.xpath("(//a[@class='button
		// button-orange'])[2]"));
		// WebElement to3 = driver.findElement(By.id("amt8"));
		// a.dragAndDrop(from3, to3).perform();

		// //-------Que 2-------
		// WebElement move =
		// driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		// a.moveToElement(move).perform();
		// driver.findElement(By.id("multiasins-img-link")).click();

		// ----------Que 3----------
		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// driver.findElement(By.xpath("//img[@alt='Home']")).click();
		// WebElement home =
		// driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		// a.moveToElement(home).perform();
		// driver.findElement(By.linkText("Bath Towels")).click();
		// WebElement text =
		// driver.findElement(By.xpath("//a[contains(@title,'Flipkart')]"));
		// String text2 = text.getText();
		// System.out.println("text:"+text2);

		// --------Que 4---------
		// WebElement mob = driver.findElement(By.id("nav_44"));
		// a.moveToElement(mob).perform();
		// WebElement mob1 = driver.findElement(By.linkText("Realme"));
		// a.moveToElement(mob1).click().perform();
		// driver.findElement(By.xpath("//label[@for='Rs. 7000 - Rs. 9999']")).click();

		// ------Que 5--------
		// WebElement spo = driver.findElement(By.id("nav_45"));
		// a.moveToElement(spo).perform();
		// driver.findElement(By.linkText("Weight Gainers")).click();

		// ------Que 6-------
		//
		// WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		// a.moveToElement(course).perform();
		// WebElement soft = driver.findElement(By.xpath("//div[@title='Software
		// Testing']"));
		// a.moveToElement(soft).perform();
		// driver.findElement(By.linkText("Selenium Certification Training")).click();

		// --------Que 7-------
		// WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		// a.moveToElement(course).perform();
		// WebElement oracle = driver.findElement(By.xpath("//div[@title='Oracle']"));
		// a.moveToElement(oracle).perform();
		// driver.findElement(By.linkText("SQL Certification Training")).click();

		// -----------Que 8-----------

		// WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		// a.moveToElement(course).perform();
		// WebElement ware = driver.findElement(By.xpath("//div[@title='Data Warehousing
		// courses']"));
		// a.moveToElement(ware).perform();
		// driver.findElement(By.linkText("Talend Certification Training")).click();

		// -------Que 9--------
		// WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		// a.moveToElement(course).perform();
		// WebElement rpa = driver.findElement(By.xpath("//div[@title='RPA']"));
		// a.moveToElement(rpa).perform();
		// driver.findElement(By.linkText("Blue Prism Certification Training")).click();

		// ------------Que 10-----------
		// WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		// a.moveToElement(course).perform();
		// WebElement ware1 = driver.findElement(By.xpath("//div[@title='Data
		// Warehousing courses']"));
		// a.moveToElement(ware1).perform();
		// driver.findElement(By.linkText("DataStage Certification Training")).click();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions a = new Actions(driver);

		//---------Que 11--------

//		WebElement alldept = driver.findElement(By.xpath("//a[@class='ShoppingLinks__link']"));
//		a.moveToElement(alldept).perform();
//		WebElement heat = driver.findElement(By.linkText("Heating & Cooling"));
//		a.moveToElement(heat).perform();
//		WebElement air = driver.findElement(By.linkText("Air Conditioners"));
//		a.moveToElement(air).perform();
//		driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']")).click();
		
		//---------Que 12---------
//		WebElement alldept = driver.findElement(By.xpath("//a[@class='ShoppingLinks__link']"));
//		a.moveToElement(alldept).perform();
//		WebElement paint = driver.findElement(By.xpath("//a[@data-level='Paint']"));
//		a.moveToElement(paint).perform();
//		WebElement interior = driver.findElement(By.xpath("//a[@title='Interior Paint']"));
//        a.moveToElement(interior).perform();
//        driver.findElement(By.linkText("Ceiling Paint")).click();
        
        //--------Que 13-----------
		
//        WebElement mob = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
//        a.moveToElement(mob).perform();
//        WebElement cover = driver.findElement(By.xpath("//span[text()='Plain Back Covers']"));
//		cover.click();
		
		//---------Que 14-------
		
//		 WebElement fash = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
//		a.moveToElement(fash).perform();
//		driver.findElement(By.xpath("//span[contains(text(),'Heels')]")).click();
		
		//-------Que 15---------
//		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		a.moveToElement(sign).perform();
//		driver.findElement(By.linkText("Start here.")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Saran");
//		driver.findElement(By.id("ap_phone_number")).sendKeys("984577854");
//		driver.findElement(By.id("ap_email")).sendKeys("saran@gmail.com");
//        driver.findElement(By.id("ap_password")).sendKeys("saransaran");
//        driver.findElement(By.id("continue")).click();

		//--------Que 16-------
//		WebElement sign1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		a.moveToElement(sign1).perform();
//		driver.findElement(By.xpath("//span[contains(text(),'Save Items')]")).click();
		
		//-------Que 17--------
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
//		WebElement women = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
//		a.moveToElement(women).perform();
//		driver.findElement(By.linkText("Flats")).click();
		
		//------Que 18----------
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
//		WebElement kids = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"));
//		a.moveToElement(kids).perform();
//		driver.findElement(By.linkText("Remote Control Toys")).click();
		
		//---------Que 19-------
		
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
//		WebElement elec = driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
//        a.moveToElement(elec).perform();
//        driver.findElement(By.linkText("Realme")).click();
//        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		
		//------Que 20--------
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		WebElement tv = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[2]"));
        a.moveToElement(tv).perform();
        driver.findElement(By.linkText("Mi")).click();
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[5]")).click();
        
	}
}
