package jUnit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTestcase1 {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\ahapick.com");
				}
    @Disabled
    
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
		
	}

	@Test
	void test_0011_Menu() {
		driver.findElement(By.linkText("Women Collection")).click();
		
	}

}
