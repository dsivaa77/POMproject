package TestSuite;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class pp_home_page extends login_page{
	
	@Test
	public void pp_home_settings() {
		WebElement pphomesettings=driver.findElement(ppsettings);
		pphomesettings.click();
		
	}
	@Test
	public void pp_home_settings_back() {
		navigationscommands.back();
	}
	@Test
	public void pp_home_csdlogin() {
		WebElement csdlogine=driver.findElement(ppcsdlogin);
		csdlogine.click();
	}
	@Test
	public void pp_home_csdlogin_back() {
			navigationscommands.back();
		}
	@Test
	public void pp_home_uploadlogo() {
		WebElement uploadlogo=driver.findElement(ppuploadlogo);
		uploadlogo.click();
	}
	@Test
	public void pp_home_webstore() {
		WebElement webstorerul1=driver.findElement(ppwebstorelink);
		webstorerul1.click();
	}
	@Test
	public void pp_home_wholesale() {
		WebElement wholesale=driver.findElement(ppwholesaleprogram);
		wholesale.click();
	}
	@Test
	public void pp_home_blockedaccounts() {
		WebElement blockedaccount=driver.findElement(ppblockedaccounts);
		blockedaccount.click();
	}
	

}
