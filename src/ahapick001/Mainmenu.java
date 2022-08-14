package ahapick001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainmenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.ahapick.com");
		/*  driver.navigate().to("https:\\www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh(); */
		Thread.sleep(3000);
		driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("apple");
       driver.findElement(By.className("my-account")).click();
       driver.findElement(By.name("username")).sendKeys("Madhavi");
       driver.findElement(By.name("password")).sendKeys("sgdgsggf453");
       Thread.sleep(3000);
       driver.findElement(By.name("login")).click();
       Thread.sleep(3000);
       driver.findElement(By.linkText("Women Collection")).click();
       Thread.sleep(3000);
       driver.findElement(By.partialLinkText("Arrival")).click();
       driver.close();
	}

}
