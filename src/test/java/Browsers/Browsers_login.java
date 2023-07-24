package Browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browsers_login {
	
	public WebDriver driver;
	public String baseurl="https://demoqa.com/";
	
	@BeforeTest
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
	}
	/*@Test
	public void demoqaloginpage() {
	
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		
	}*/
}
