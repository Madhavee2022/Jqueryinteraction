package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNG {
	WebDriver driver;

	@Test(enabled=false)
	public void home() {

		System.out.println("page");

	}

	@Test (enabled=false)
	public void shop() {

		System.out.println("shop");

	}

	@Test (enabled=false)
	public void dropdownSelect() {

		driver.get("https://www.ahapick.com/");
		//new Select(driver.findElement(By.name("product_cat"))).selectByVisibleText("Sunglass");
		//new Select(driver.findElement(By.name("product_cat"))).selectByValue("Shoes");
		new Select(driver.findElement(By.name("product_cat"))).selectByIndex(5);
	}
	@Test (enabled=false,priority=1)
	public void scrolldown() throws InterruptedException {
		driver.get("https://www.ahapick.com/");
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0,500)");


	}

	@Test (enabled=false,priority=2)
	public void scrollUp() throws InterruptedException {
		driver.get("https://www.ahapick.com/");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(900,0)");


	}

	@Test (enabled=false)// //Identify Locator Element
	public void IndentifyLocatorElement() throws Exception {
		driver.get("https://ahapick.com/product-category/women-collection/");
		{
			Thread.sleep(5000);
			WebElement element = (WebElement) driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[3]/a[1]/h2"));
			Coordinates coordinate = ((Locatable)element).getCoordinates(); 
			coordinate.onPage(); 
			coordinate.inViewPort();
		}    
	}
	@Test (enabled=false) //Right Click on Link,Button and Image etc.. using Selenium Webdriver
	public void RightClick() throws Exception {
		driver.get("http://www.ahapick.com/");
		{
			Thread.sleep(5000); 

			Actions act=new Actions(driver);
			act.contextClick(driver.findElement(By.linkText(""))).perform();
		}

	}
	 @Test(enabled=false)
	    public void Doubleclick() throws Exception
{
	    driver.get("http://www.seleniumlearn.com/double-click");
	    Thread.sleep(5000);
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().perform();
	    } 


	 @Test(enabled=true)
     public void draganddropSqure() throws Exception 
{
         driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
                  
         Actions act=new Actions(driver);
         
         WebElement source=driver.findElement(By.id("draggable")); // Find the first WebElement using the given method.
         WebElement target=driver.findElement(By.id("droppable"));
         
         act.dragAndDrop(source,target).perform();
         
     }

	@BeforeTest 
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https:\\www.ahapick.com");
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}

