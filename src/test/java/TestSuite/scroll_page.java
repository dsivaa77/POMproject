package TestSuite;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class scroll_page {
	
	
	@Test
	public void scrollpage() {
		
	JavascriptExecutor driver = null;
			//Scroll down the webpage
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
}
}
