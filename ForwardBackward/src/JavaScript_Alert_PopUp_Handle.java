import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Alert_PopUp_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
	     
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Navigate to the URL
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Click on Sign-in Button
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		//Switch the control on pop up window
		 Alert alert = driver.switchTo().alert();
		 
		 //Print the Text from pop up window
		 System.out.println( "Pop up window Text :" +alert.getText());
		 
		 //Click on ok button
		   alert.accept();
		   
		 //Click on cancel button
		  // alert.dismiss();

		
	}

}
