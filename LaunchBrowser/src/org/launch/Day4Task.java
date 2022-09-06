package org.launch;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement text = driver.findElement(By.xpath("//span[@class='blue_text']"));
//		String text2 = text.getText();
//		System.out.println("Text:"+text2);
//		driver.quit();
		
//		-------------paragraph after VelMurugan---------------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently focuses')]"));
//		String text = para.getAttribute("innerText");
//		System.out.println(text);
//		driver.quit();
//		
//		------adyar address----------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement address = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
//		String text = address.getText();
//		System.out.println("Address:"+text);
//		driver.quit();		
		
//		------omr address--------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement address = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
//		String text = address.getText();
//		System.out.println("Address:"+text);
//		driver.quit();
		
//		driver.get("http://www.greenstechnologys.com/");
//		WebElement para = driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;']"));
//		String text = para.getText();
//		System.out.println(text);
//		driver.quit();
		
//	-----------print values given by user--------	
//		driver.get("https://www.facebook.com/");
//		WebElement txtuser = driver.findElement(By.id("email"));
//		txtuser.sendKeys("saran");
//		String user = txtuser.getAttribute("value");
//		System.out.println("UserName:"+user);
//		
//		WebElement txtpass = driver.findElement(By.id("pass"));
//		txtpass.sendKeys("9856785439");
//		String pass = txtpass.getAttribute("value");
//		System.out.println("Password:"+pass);
//		driver.quit();
		
//		---------Search in google-----
//		driver.get("http://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("greens velmurugan");
//		driver.findElement(By.xpath("(//input[@role='button'])[2]")).click();
//		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
//		driver.quit();
		
//		----------UserName and Password given by User----------
//		driver.get("http://adactinhotelapp.com/");
//		WebElement user = driver.findElement(By.id("username"));
//		user.sendKeys("Saran");
//		String user1 = user.getAttribute("value");
//		System.out.println("UserName:"+user1);
//		
//		WebElement pass = driver.findElement(By.id("password"));
//		pass.sendKeys("9856786533");
//		String pass1 = pass.getAttribute("value");
//		System.out.println("Password:"+pass1);
//		driver.quit();
		
//		--------Get First ProductDetails------
//		driver.get("https://www.snapdeal.com/");
//		driver.findElement(By.name("keyword")).sendKeys("Shirts");
//		driver.findElement(By.className("searchTextSpan")).click();
//		driver.findElement(By.className("product-title")).click();
//		driver.findElement(By.xpath("//input[@class='sd-input']")).sendKeys("600097");
//		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//		driver.findElement(By.xpath("//p[@class='product-title']")).click();
		
//		---------Search any product in FlipKart-------
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.name("q")).sendKeys("iphone");
//		driver.findElement(By.className("L0Z3Pu")).click();
		
		
//	----------FlipKart userName--------
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//div[@class='_1psGvi _3BvnxG']")).click();
//		WebElement user = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
//		user.sendKeys("Saran");
//		String user1 = user.getAttribute("value");
//		System.out.println("UserName:"+user1);
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("8745789975");
//		pass.getAttribute("value");
//		System.out.println("Password:"+pass);
//		driver.quit();
		
		
//		-------ShopClues----------
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.findElement(By.id("autocomplete")).sendKeys("T-Shirt");
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.xpath("//h2[@class=' mii ']")).click();
		driver.quit();
		
	}
}
