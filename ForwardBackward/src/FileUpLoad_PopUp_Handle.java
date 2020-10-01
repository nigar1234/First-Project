import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoad_PopUp_Handle {

	//Ok, Yes, No, Browse, Attach ,alert popup
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
	     
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Navigate to the URL
		driver.get("https://html.com/input-type-file/");
		
		//Capture the xpath of the browse button and send keys by taking the path of the file
		//File path--Right click on the file->general->Location->then file name capture
		//Cannot use switch, because sellenium cannot handle window popup
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\qatester\\Desktop\\TC110.txt");
		

	}

}
