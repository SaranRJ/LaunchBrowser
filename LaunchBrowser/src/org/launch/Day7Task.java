package org.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7Task {

	public static void main(String[] args) throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   //---------Que 12----------
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("inputValEnter")).sendKeys("Hp laptop");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		WebElement scn = driver.findElement(By.xpath("//picture[@class='picture-elem']"));
		File from = scn.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\HP.png");
		FileUtils.copyFile(from, to);
	
		//---------Que 11-----------------
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		WebElement fas = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
//		Actions a = new Actions(driver);
//		a.moveToElement(fas).perform();
//		WebElement cl = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
//		a.moveToElement(cl).click().perform();
//		WebElement kids = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"));
//		a.moveToElement(kids).perform();
//		File from = kids.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\Kids.png");
//		FileUtils.copyFile(from, to);
				
		//-----------Que 10-------
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Actions a = new Actions(driver);
//		WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
//		 a.moveToElement(fashion).perform();
//		 WebElement wom = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[2]"));
//		 a.moveToElement(wom).perform();
//		WebElement al = driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"));
//		a.click(al).perform();
//		WebElement scn = driver.findElement(By.xpath("//div[@data-id='SARFKH2FHZTJKW5W']"));
//		File from = scn.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\womendress.png");
//		FileUtils.copyFile(from, to);
		
		//----------Que 9--------
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.name("q")).sendKeys("iphone");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		WebElement scn = driver.findElement(By.xpath("//div[@class='_2kHMtA']"));
//		File from = scn.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\flipkart.png");
//		FileUtils.copyFile(from, to);
		
		//---------Que 8----------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		WebElement cer = driver.findElement(By.xpath("(//span[@class='feature-title'])[7]"));
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", cer);
//		WebElement java = driver.findElement(By.xpath("//div[@id='heading302']"));
//		java.click();
//		File from = java.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\Java.png");
//		FileUtils.copyFile(from, to);
		
		//---------Que 7----------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		WebElement cer = driver.findElement(By.xpath("(//div[@class='feature-row'])[7]"));
//        JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView(true)", cer);
//        WebElement cl = driver.findElement(By.xpath("//i[@class='fas fa-plus']"));
//        cl.click();
//        WebElement scn = driver.findElement(By.xpath("//div[@id='collapse20']"));  
//        File from = scn.getScreenshotAs(OutputType.FILE);
//        File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\InterQue.png");
//        FileUtils.copyFile(from, to);
	    
		//---------Que 6------------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement down = driver.findElement(By.xpath("//a[@title='Continuous Testing in DevOps']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		File from = down.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\TopselTrending.png");
//		FileUtils.copyFile(from, to);
		
		//----------Que 5-----------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		WebElement job = driver.findElement(By.xpath("//div[@id='heading2011']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", job);
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File from = ts.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\Jobopening.png");
//		FileUtils.copyFile(from, to);
//		WebElement top = driver.findElement(By.linkText("All Courses"));
//		js.executeScript("arguments[0].scrollIntoView(false)",top );
		
		//--------Que 4---------
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement scroll = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
//		File from = scroll.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\perumbakkamAddress.png");
//		FileUtils.copyFile(from, to);
//		System.out.println("Done");

		// --------Que 1--------
		// driver.get("http://www.greenstechnologys.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// TakesScreenshot ts =(TakesScreenshot)driver;
		// File from = ts.getScreenshotAs(OutputType.FILE);
		// System.out.println(from);
		// File to = new File("C:\\New folder\\LaunchBrowser\\ScreenShot\\greens.png");
		// FileUtils.copyFile(from, to);

	}
}
