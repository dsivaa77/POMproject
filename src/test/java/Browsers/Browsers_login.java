package Browsers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browsers_login {
	
	public WebDriver driver;
	public String baseurl="https://partners78.beta-wspbx.com";
	public String quoteurl="https://partners78.beta-wspbx.com/quoteasp/";
	String userProfile;
	
	@BeforeClass
	public void openbrowser() {
		String username=System.getProperty("user.name");
		System.out.println("The system user name is"  +username);
		
		userProfile= "C:\\Users\\"+username+"\\AppData\\Local\\Google\\Chrome\\User Data\\PP";

		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir="+userProfile);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));		
	}
	@AfterClass
	public void closebrowser() {
	driver.quit();
	}
}
