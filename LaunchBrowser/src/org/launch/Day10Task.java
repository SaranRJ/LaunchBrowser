package org.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10Task {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//--------Que 8-------
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Redmi Phone");
		driver.findElement(By.className("L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[text()='REDMI Note 10S (Deep Sea Blue, 64 GB)']")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		List<String> li = new ArrayList<>();
		li.addAll(handles);
		driver.switchTo().window(li.get(1));
		WebElement price = driver.findElement(By.xpath("//div[text()='₹12,499']"));
		String text = price.getText();
		System.out.println(text);
		
		//--------Que 7---------
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.id("inputValEnter")).sendKeys("hand sanitizer");
//		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
//		driver.findElement(By.xpath("//p[@class='product-title']")).click();
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		Set<String> handles = driver.getWindowHandles();
//		System.out.println(handles);
//		List<String> li = new ArrayList<>();
//		li.addAll(handles);
//		driver.switchTo().window(li.get(1));
//		driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
		
		//-------Que 6----------
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement scroll = driver.findElement(By.xpath("//span[text()='Certification']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
//		WebElement sc2 = driver.findElement(By.xpath("//div[@id='heading30322']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", sc2);
//		driver.findElement(By.xpath("//div[@id='heading304']")).click();
//		driver.findElement(By.linkText("JUNIT")).click();
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		Set<String> handles = driver.getWindowHandles();
//		System.out.println(handles);
//		List<String> li = new ArrayList<>();
//		li.addAll(handles);
//		driver.switchTo().window(li.get(1));
//		WebElement win1 = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
//		Actions a= new Actions(driver);
//		a.contextClick(win1).perform();
		
		//----------Que 5-----------
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		Actions a = new Actions(driver);
//		WebElement course = driver.findElement(By.linkText("COURSES"));
//		a.moveToElement(course).perform();
//		WebElement pyt = driver.findElement(By.xpath("//span[text()='Python']"));
//		a.moveToElement(pyt).click().perform();
//		WebElement tra = driver.findElement(By.xpath("//p[text()='Hands on Training']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", tra);
//		WebElement rcli = driver.findElement(By.xpath("//h2[text()='Curriculum']"));
//		a.contextClick(rcli).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		//--------Que 4---------
//		driver.get("http://www.greenstechnologys.com/python-training.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement scroll = driver.findElement(By.xpath("(//div[@class='panel-heading accordion-toggle collapsed'])[6]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
//		WebElement scroll1 = driver.findElement(By.xpath("(//h3[@id='Python-Solutions-Architect-Training'])[4]"));
//		scroll1.click();
//		js.executeScript("arguments[0].scrollIntoView(true)", scroll1);
//		WebElement scroll2 = driver.findElement(By.xpath("//h3[text()='Selenium Day 9 Task']"));
//		js.executeScript("arguments[0].scrollIntoView(true)",scroll2);
//		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
//		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
//		String windowhandle = driver.getWindowHandle();
//		System.out.println(windowhandle);
//		Set<String> handle = driver.getWindowHandles();
//		System.out.println(handle);
//		List<String> li = new ArrayList<>();
//		li.addAll(handle);
//		driver.switchTo().window(li.get(1));
//		Actions a = new Actions(driver);
//		WebElement rcli = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
//		a.contextClick(rcli).perform();
		
		//-------Que 3------
//		driver.get("https://www.homedepot.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		driver.findElement(By.id("headerSearch")).sendKeys("ceiling fan");
//		driver.findElement(By.className("SearchBox__buttonIcon")).click();
//		driver.findElement(By.linkText("Indoor Ceiling Fans with Lights")).click();
//		driver.findElement(By.xpath("//label[@for='1z1hg27-0']")).click();
	
		
		//--------Que 2----------
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7");
//		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
//		driver.findElement(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']")).click();
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		Set<String> handles = driver.getWindowHandles();
//		System.out.println(handles);
//		List<String> li = new ArrayList<>();
//		li.addAll(handles);
//		driver.switchTo().window(li.get(1));
//		driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
//		WebElement pay = driver.findElement(By.xpath("//div[@class='you-pay']"));
//		String text = pay.getText();
//		System.out.println(text);
		
	
		//-------Que 1------
//		driver.get(" https://www.amazon.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();	
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Actions a = new Actions(driver);
//		WebElement rytclick = driver.findElement(By.xpath("//span[text()='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
//		a.contextClick(rytclick).perform();
//	  //  a.keyDown(null);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		Set<String> handles = driver.getWindowHandles();
//		System.out.println(handles);
//	    List<String> li = new ArrayList<>();
//	    li.addAll(handles);  
//	    driver.switchTo().window(li.get(1));
//	    WebElement price = driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']"));
//		String text = price.getText();
//		System.out.println("Price for iphone x:"+text);
		
	}

}
