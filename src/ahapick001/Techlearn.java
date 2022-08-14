package ahapick001;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlearn {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		/*	driver.navigate().to("https://www.ahapick.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		 */

		// Google Search and Enter Keyword//
		/*	driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Sikuli");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 */


		/*	driver.findElement(By.id("edit-name")).sendKeys("Laasya");
		driver.findElement(By.name("pass")).sendKeys("absddfasf");
		//driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.form-submit")).click();
		 */

	/*	driver.get("http://hyderabadreport.com/");
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Us")).click();
	*/
		
		driver.get("https://www.google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links on Google"+links.size());
	}

}
