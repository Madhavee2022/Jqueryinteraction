mport static org.testng.Assert.assertEquals;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Ignore;
	import org.testng.annotations.Test;
@Test
public class AtTestClasslevel {
		
		WebDriver driver;
		
		@BeforeClass
		public void launchbrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();}
		
			
			
			public void launchapp() 
			{
			driver.get("https://jqueryui.com/demos/");
			boolean logo=driver.findElement(By.xpath("//*[@id=\"logo-events\"]/h2/a")).isDisplayed();
			Assert.assertTrue(logo);
			System.out.println(logo);
			}
			
			
			public void title (){
			String actualurl=driver.getCurrentUrl();
			//System.out.println(actualurl);
			String expectedurl="https://jqueryui.com/demos/";
			Assert.assertEquals(actualurl, expectedurl);
			System.out.println("URL Test Passed");
			}
			
			
			public void titleTest() 
			{
				
			String acttitle= driver.getTitle();
			String exptitle="jQuery UI Demos | jQuery UI";
			Assert.assertEquals(acttitle, exptitle);
			System.out.println("Title test passed");
			}
			
			public void failTitle() {
				
				String acttitle= driver.getTitle();
				String exptitle="jQuery UI Demos";
				Assert.assertEquals(acttitle, exptitle);
				//java.lang.AssertionError: expected [jQuery UI Demos] but found [jQuery UI Demos | jQuery UI]
				
			}
				
			@AfterClass
			public void close() 
			{
				
				driver.close();
			}
			
		}

		
		



	

