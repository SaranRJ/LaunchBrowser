package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAddress {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trainingintambaram.net/selenium-training-in-chennai/");
		
		//WebElement address = driver.findElement(By.xpath("//strong[text()='Greens Technology Tambaram']"));
		//String a = address.getText();
		//System.out.println("Tambaram address:"+a);
		
		
		//WebElement address = driver.findElement(By.xpath("//strong[contains(text(),'Tam')]"));
		//String ad = address.getText();
		//System.out.println("Tambaram Address:"+ad);
		
		//WebElement address1line = driver.findElement(By.xpath("(//strong[contains(text(),'Tam')]/following-sibling::br)[1]"));
	//	String ad1 = address1line.getText();
	//	System.out.println(ad1);
		
		WebElement address = driver.findElement(By.xpath("//strong[contains(text(),'Tam')]/parent::p"));
		String ad = address.getText();
		System.out.println(ad);
		
		driver.quit();
		
		
		//strong[text()='Greens Technology Tambaram']/following-sibling::br
		
	}

}
