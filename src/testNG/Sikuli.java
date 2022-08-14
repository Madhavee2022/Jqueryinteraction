package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sikuli {
	WebDriver driver;
  @Test
  
  public void s1() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium2022\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.ahapick.com");
		
  }
				
		@AfterTest
  public void afterTest() {
  }

}
