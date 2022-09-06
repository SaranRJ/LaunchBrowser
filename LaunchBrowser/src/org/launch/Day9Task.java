package org.launch;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Task {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       //----------Que 13----------
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement drop1 = driver.findElement(By.id("fruits"));
		Select s = new Select(drop1);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i <options.size() ; i++) {
			WebElement we = options.get(i);
		    String text = we.getText();
		    System.out.println(text);
		}
			
		//-----------Que 12-----------
//		driver.get("http://output.jsbin.com/osebed/2");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		WebElement drop1 = driver.findElement(By.id("fruits"));
//		Select s = new Select(drop1);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println(size);	
//		for (int i = 0; i < options.size(); i++) {
//			if(i%2==0) {
//				WebElement we = options.get(i);
//			    String opt = we.getAttribute("value");
//			    System.out.println(opt);
//			}
//		}
	
		//----------Que 11---------
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("SaranRJ14");
//		driver.findElement(By.id("password")).sendKeys("Saran@1427");
//		driver.findElement(By.id("login")).click();
//		WebElement drop1 = driver.findElement(By.id("adult_room"));
//		Select s = new Select(drop1);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println(size);
		
		//-------Que 10--------
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("SaranRJ14");
//		driver.findElement(By.id("password")).sendKeys("Saran@1427");
//		driver.findElement(By.id("login")).click();
//		WebElement drop1 = driver.findElement(By.id("location"));
//		Select s = new Select(drop1);
//		List<WebElement> options = s.getOptions();
//		
//		for(WebElement x: options) {
//			System.out.println(x.getText());
//		}	
		
		//-------Que 9--------
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("SaranRJ14");
//		driver.findElement(By.id("password")).sendKeys("Saran@1427");
//		driver.findElement(By.id("login")).click();
//		
//		WebElement drop1 = driver.findElement(By.id("room_type"));
//		Select s1 = new Select(drop1);
//		List<WebElement> options = s1.getOptions();
//		for (int i = 0; i <options.size() ; i++) {
//			  WebElement we = options.get(i);
//			  String text = we.getText();
//              System.out.println(text);
//		}		
//		for(WebElement x:options) {
//			System.out.println(x.getText());
//		}
		
		//---------Que 8----------
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
		
//		driver.findElement(By.id("username")).sendKeys("SaranRJ14");
//		driver.findElement(By.id("password")).sendKeys("Saran@1427");
//		driver.findElement(By.id("login")).click();
//		
//		WebElement drop1 = driver.findElement(By.id("location"));
//		Select s = new Select(drop1);
//		s.selectByVisibleText("London");
//		
//		WebElement drop2 = driver.findElement(By.id("hotels"));
//		Select s1 = new Select(drop2);
//		s1.selectByVisibleText("Hotel Sunshine");
//		
//		WebElement drop3 = driver.findElement(By.id("room_type"));
//		Select s2 = new Select(drop3);
//		s2.selectByIndex(3);
//		
//		WebElement drop4 = driver.findElement(By.id("room_nos"));
//		Select s3 = new Select(drop4);
//		s3.selectByValue("2");
//		
//		driver.findElement(By.id("Submit")).click();
//		driver.findElement(By.id("radiobutton_0")).click();
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("first_name")).sendKeys("Saran");
//		driver.findElement(By.id("last_name")).sendKeys("Rj");
//		driver.findElement(By.id("address")).sendKeys("iufgyitfyhvdgd");
//		driver.findElement(By.id("cc_num")).sendKeys("8756432987653450");
//		
//		WebElement drop5 = driver.findElement(By.id("cc_type"));
//		Select s4 = new Select(drop5);
//		s4.selectByVisibleText("VISA");
//		
//		WebElement drop6 = driver.findElement(By.id("cc_exp_month"));
//		Select s5 = new Select(drop6);
//		s5.selectByVisibleText("November");
//		
//		WebElement drop7 = driver.findElement(By.id("cc_exp_year"));
//		Select s6 = new Select(drop7);
//		s6.selectByVisibleText("2022");
//		
//		driver.findElement(By.id("cc_cvv")).sendKeys("654");
//		driver.findElement(By.id("book_now")).click();
//		
//		WebElement att = driver.findElement(By.id("order_no"));
//		String order = att.getAttribute("value");
//		System.out.println(order);
		
		
		//---------Que 7----------
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		WebElement drop = driver.findElement(By.name("country"));
//		Select s = new Select(drop);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println(size);	
//		for (int i = 0; i < options.size(); i++) {
//			WebElement we = options.get(i);
//			String att = we.getAttribute("value");
//			System.out.println(att);
//		}
		
		//---------Que 6----------
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		WebElement drop = driver.findElement(By.name("country"));
//		Select s = new Select(drop);
//		List<WebElement> options = s.getOptions();	
//		for (int i = 0; i < options.size(); i++) {
//			WebElement we = options.get(i);
//			String text = we.getText();
//			System.out.println(text);
//		}	
//		for(WebElement x:options)
//		{
//			System.out.println(x.getText());
//		}
		
		//-------Que 3-------
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		WebElement drop1 = driver.findElement(By.id("year"));
//		Select s = new Select(drop1);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println("No.of Years available:" +size);	
//		
//		for(WebElement x:options) {
//			System.out.println(x.getAttribute("value"));
//	}
		
		//------Que 5---------
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();		
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		WebElement drop = driver.findElement(By.id("day"));
//		Select s =new  Select(drop);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println("Total no.of Days:"+ size);		
//		for (int i = 1; i < options.size(); i++) {
//            if(i%2==0) {
//            	System.out.println(i);
//            } 
//		}	
		
				
		//------------Que 4-------
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		WebElement drop = driver.findElement(By.id("month"));
//		Select s = new Select(drop);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println("Months available:"+ size);		
//		for (int i = 0; i < options.size(); i++) {
//		      WebElement we = options.get(i);
//		      String text = we.getText();
//		      System.out.println(text);
//		}		
//		for(WebElement x:options) {
//			System.out.println(x.getText());
//		}
		
		
//		//---------Que 3-------
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		WebElement drop1 = driver.findElement(By.id("year"));
//		Select s = new Select(drop1);
//		List<WebElement> options = s.getOptions();
//		int size = options.size();
//		System.out.println("No.of Years available:" +size);	
//		for (int i = 0; i < options.size(); i++) {
//			  WebElement we = options.get(i);
//			  String text = we.getText();
//              System.out.println(text);		
//		}		
//		for(WebElement x:options) {
//			System.out.println(x.getText());
//		}
	}
	
}
