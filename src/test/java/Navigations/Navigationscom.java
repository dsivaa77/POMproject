package Navigations;

import org.openqa.selenium.chrome.ChromeDriver;


import Objects.locators;

public class Navigationscom extends locators{
	
	public void back() {
		if(driver != null) {
			driver.navigate().back();
		}
		else {
			System.out.println("Driver is null. Make sure it is properly initialized.");
		}
	}
	public void forward() {
		driver.navigate().forward();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void tourl() {
		driver.navigate().to(quoteurl);
	}





}

