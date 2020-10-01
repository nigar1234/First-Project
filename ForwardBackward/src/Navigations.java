import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
     
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	//Navigate to the Google URL
	driver.get("http://www.google.com");
	
	//Navigate to the Amazon website
	driver.navigate().to("http://www.amazon.com");
	
	//Back button simulator
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	//Forward buttons simulator
	driver.navigate().forward();
	
	//Back button simulator
	driver.navigate().back();
	
	//Forward
	driver.navigate().forward();
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	
	
	}

}


//******************************************
//*************************************
//****************************************