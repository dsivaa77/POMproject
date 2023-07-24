package TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Browsers.Browsers_login;
import Objects.locators;

public class login_page extends locators{
	@Test(priority=1)
	public void test1() {
		WebElement element=driver.findElement(training1);
		element.click();
		System.out.println("Test1 executed successfully");
		//driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
	}
	@Test(priority=2)
	public void test2() {
		driver.findElement(By.xpath("")).click();
	}
	
	
}


