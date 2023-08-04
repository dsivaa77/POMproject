package TestSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import Browsers.Browsers_login;
import Navigations.Navigationscom;
import Objects.locators;

public class login_page extends Navigationscom{
	
	Navigationscom navigationscommands=new Navigationscom();
	
	@Test
	public void login_page() {
		WebElement enterusername=driver.findElement(username);
		enterusername.sendKeys("dsivaadministrator");
		
		WebElement enterpassword=driver.findElement(password);
		enterpassword.sendKeys("siva@1234");
		
		WebElement logine=driver.findElement(loginbutton);
		logine.click();
		
		System.out.println("Partner portal logged in successfully");
	}
	
	

	
}



