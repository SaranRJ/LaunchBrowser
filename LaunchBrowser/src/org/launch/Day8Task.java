package org.launch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//-----------Que 8---------
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(4);
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("Saran");
		
		
		
		
		
		
		//---------Que 7----------
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.name("fldLoginUserId")).sendKeys("1476865");
//		driver.findElement(By.linkText("CONTINUE")).click();
//		
//		driver.findElement(By.id("fldPasswordDispId")).sendKeys("SaranSel");
		
		
		//-----------Que 6--------
//		driver.get("https://retail.onlinesbi.com/retail/login.htm");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//	
//		driver.findElement(By.xpath("//a[@class='login_button']")).click();
//		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
		//---------Que 5-------------
//		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//	
//		driver.findElement(By.xpath("//input[@onclick='return fLogon()']")).click();
//		
//		Alert a = driver.switchTo().alert();
//		a.getText();
//		a.accept();
				
		
		//---------Que 4-------------
//		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//		driver.switchTo().frame(0);
//		driver.findElement(By.linkText("CONTINUE")).click();
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
		
		//-----------------Que 3-----------------
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//		Alert a = driver.switchTo().alert();
//		a.sendKeys("Saran");
//		a.accept();
		
		
		//---------Que 2---------
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
	
		//-----------Que 1----------
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		 Alert a = driver.switchTo().alert();
//		 a.accept();
		
		
		
		
		
	}

}
