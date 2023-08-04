package All_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class alllinksclass {
	String userProfile;
	public WebDriver driver;
	
	@Test
	public void pplinks() throws InterruptedException {
		
		try {
		String username=System.getProperty("user.name");
		System.out.println("The system user name is"  +username);
		
		userProfile= "C:\\Users\\"+username+"\\AppData\\Local\\Google\\Chrome\\User Data\\PP";

		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir="+userProfile);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	 //WebDriver driver = new ChromeDriver();
	 //System.setProperty("webdriver.chrome.driver", "E:\\sivaa\\Siva_A\\chromedriver_win32.exe");
	    driver.get("https://partners78.beta-wspbx.com/");
	    By username1=By.xpath("//input[@id='xusername']");
		By password=By.xpath("//input[@id='password']");
		By loginbutton=By.xpath("//input[@value='Login']");
	 
	    WebElement enterusername=driver.findElement(username1);
		enterusername.sendKeys("dsivaadministrator");
		
		WebElement enterpassword=driver.findElement(password);
		enterpassword.sendKeys("siva@1234");
		
		WebElement logine=driver.findElement(loginbutton);
		logine.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("ACCOUNTS")).click();		
	 
	 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	 for (WebElement link : links) {
         String url = link.getAttribute("href");
         String text=link.getText();
         System.out.println(text);
     }
		}catch(Exception e) {
	 driver.manage().deleteAllCookies();
	 driver.quit();
		}
}
}
