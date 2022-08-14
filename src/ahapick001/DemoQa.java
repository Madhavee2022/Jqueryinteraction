package ahapick001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DemoQa {
 
static WebDriver driver;
 
public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.chrome.driver","E:\\Selenium2022\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
 
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td/input"
	));

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");

driver.findElement(By.xpath("//div[text()='Login ']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='container_tasks']")).click();



driver.findElement(By.xpath("//div[text()='Android calibration']/../../../../..//div[@class='img']")).click();

//Thread.sleep(1000);

//driver.close();
}

}

