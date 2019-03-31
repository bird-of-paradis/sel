package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	WebDriver driver;
	@BeforeMethod
	public void launch () {
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.0.5:32768/addressbook/");
		  
		
	}
	
  @Test
  public void verifyaddbook() {
	 driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	 driver.findElement(By.id("gwt-uid-5")).sendKeys("testing");
	 driver.findElement(By.id("gwt-uid-7")).sendKeys("selenium");
	 driver.findElement(By.id("gwt-uid-9")).sendKeys("6987654321");
	 driver.findElement(By.id("gwt-uid-11")).sendKeys("selenium@gmail.com");
	 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/11/1985");
	 driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	  
  }
  @AfterMethod
  public void close() {
	driver.close();
	  
  }
}
