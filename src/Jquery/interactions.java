package Jquery;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class interactions {

		WebDriver driver;
		@BeforeClass
		public  void launchbrowser() {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium2022\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			}
		
			@SuppressWarnings("deprecation")
			@Test(priority=-1,description="To launch Application")
			
			public void launchapp() 
			{
			driver.get("https://jqueryui.com/demos/");
			
			String interText=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/h3")).getText();
			
			System.out.println(interText);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			}
			
			@Test(priority=2,description="list of webelements present in application page ")
			public void list() {
			List<WebElement>tabs=driver.findElements(By.tagName("a"));//by using for loop
			WebElement s;
			for(int i=0;i<tabs.size();i++) {
				
				s=tabs.get(i);
				System.out.println(s.getText());
			}
			}
			/*@Test(priority=3,description="list of webelements present in application page", enabled=false)
			
			public void listeach() {
			List<WebElement> tab =driver.findElements(By.tagName("a"));//by using for each 
			for(WebElement objlinks :tab) {
				
				String strlinks= objlinks.getText();
						System.out.println(strlinks);
			}
			}
			@Test(priority=4,description="to get text from listof elements in interactions")
			public void interlist() {
			List<WebElement>tab1=driver.findElements(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul"));//by using for loop
			WebElement s;
			for(int i=0;i<tab1.size();i++) {
				
				s=tab1.get(i);
				System.out.println(s.getText());
			}

	}*/
		@Test(priority=5,description="Dragable")
		public void drag()  {
			driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
			
			driver.switchTo().frame(0);
			
			Actions action =new Actions(driver);
			
	      WebElement Dragable= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	      // action.clickAndHold(Dragable).dragAndDropBy(Dragable, 400, 200).release().build().perform();
	       action.dragAndDropBy(Dragable, 250, 100).build().perform();
	       
			System.out.println(Dragable.getText());
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			String expectedurl="https://jqueryui.com/draggable/";
			Assert.assertEquals(actualurl, expectedurl);
			System.out.println("URL Test Passed");
			driver.switchTo().defaultContent();
		}
		
		@Test(priority=6,description="Drop element src to target")
		public void drop() {
			//driver.get("https://jqueryui.com/droppable/");
			driver.findElement(By.xpath("//a[text()='Droppable']")).click();
			driver.switchTo().frame(0);
			WebElement srcEle=driver.findElement(By.id("draggable"));
			WebElement tarEle=driver.findElement(By.id("droppable"));
			Actions action=new Actions(driver);
			action.clickAndHold(srcEle).moveToElement(tarEle).release().build().perform();
			driver.switchTo().defaultContent();
			
		}
		
		@Test(priority=7,description="Resizable")
		public void Resizable() {
		//driver.get("https://jqueryui.com/resizable/");
			driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a")).click();
			driver.switchTo().frame(0);
			WebElement resize=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
			Actions act=new Actions(driver);
			act.moveToElement(resize).dragAndDropBy(resize, 100, 100).build().perform();
			driver.switchTo().defaultContent();
		}
		@Test(priority=8)
		public void selectable() throws Exception {
		//driver.get("https://jqueryui.com/selectable/");
			driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
			driver.switchTo().frame(0);
			List<WebElement>tab4=driver.findElements(By.id("selectable"));//by using for loop
			WebElement s;
			for(int i=0;i<tab4.size();i++) {
				
				s=tab4.get(i);
				System.out.println(s.getText());
			}
			boolean item=driver.findElement(By.xpath("//li[contains(text(),'Item 1')]")).isEnabled();
			System.out.println(item);
		driver.findElement(By.xpath("//li[contains(text(),'Item 2')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Item 3')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Item 4')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Item 5')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Item 6')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Item 7')]")).click();
		driver.switchTo().defaultContent();
		}
		@Test(priority=9)
		public void sortable() throws Exception {
			//driver.get("https://jqueryui.com/sortable/");
			
			driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
			driver.switchTo().frame(0);
			List<WebElement>tab5=driver.findElements(By.id("sortable"));//by using for loop
			WebElement r;
			for(int i=0;i<tab5.size();i++) {
				
				r=tab5.get(i);
				System.out.println(r.getText());
			}
			
			Thread.sleep(3000);
			
			//String sort=driver.findElement(By.xpath("/html/body/ul/li[1]")).getText();
			//System.out.println("This is for Validation  " + (sort.getBytes()));
			Actions act=new Actions(driver);
			WebElement sort1=driver.findElement(By.xpath("/html/body/ul/li[1]"));
		WebElement sort2=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
			//act.clickAndHold().dragAndDrop(sort, sort1).build().perform();
			act.dragAndDrop(sort1, sort2).release(sort2).build().perform();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
		}
		
		
		@Test(priority=10,description="sortable")
		public void sort() {
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		 driver.switchTo().frame(0);

		 Actions act=new Actions(driver);
		 WebElement srt=driver.findElement(By.xpath("//li[2][@class='ui-state-default ui-sortable-handle']"));
		 
		 act.clickAndHold(srt).dragAndDropBy(srt, 33, 128).release().build().perform();
		 driver.switchTo().defaultContent();
		boolean img= driver.findElement(By.xpath("//img[@src=\"/jquery-wp-content/themes/jquery/content/donate.png\"]")).isDisplayed();
		System.out.println("This is for sort  "+ img);
		
		}
		@Test(priority=11)
		public void slider() {
			driver.get("https://jqueryui.com/slider/");
			
			driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[11]/a"));
			
			driver.switchTo().frame(0);
			WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
			Actions act=new Actions(driver);
			act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
		}
		@AfterClass
		public void close() {
			
			driver.close();
		}
			
			}



