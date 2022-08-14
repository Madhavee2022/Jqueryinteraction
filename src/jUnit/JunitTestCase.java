package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTestCase {
	
	static WebDriver driver;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.ahapick.com");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
		}

	
	@Test
	void test_001_Menu() {
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Men Collection")).click();
		
	}
	
	@Test
	void test_002_Search() {
		driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("apple");
		driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys(Keys.ENTER);;
	}
	
	@Test
	void test_003_My_Account() {
		
	}

}
