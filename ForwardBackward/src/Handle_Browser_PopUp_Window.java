import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Three types of pop up
//1.Alert----JavaScrript PopUp---Alert Api (accept.dismiss)
//2.File Upload Pop Up---Browse Button,Attach File, Upload File ---type should be file,sendkeys(path)
//3. Browser Window pop up/ Advertisement Pop up---(windowHandler API--getWindowHandles())


//How to handle browser pop up window
public class Handle_Browser_PopUp_Window {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
	     
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Navigate to the Pop up Test.com URL
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		//Navigate to the xpath of third pop up.
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		// It is a set of object Collection. There are two window. Parent and Child. 
		//We will handle this two window.In set object values does not store object basis of index.
		//Windows ID are available in Set object.
		//There are two windows, so we will use getWindowHandles method.We will Iterate this Two window.
		  Set<String> handler = driver.getWindowHandles();
		
	    //Now We will use Iterator.We will not use For loop, because it is basis on index.
		  //Iterator pointing on top of the set object and we have to shift iterator from one window to another
		  Iterator<String> it = handler.iterator();
		  
		  //it.next will give you first value or parent window id
		  String parentWindowId = it.next();
		  
		  System.out.println("Parent Windoe ID :" + parentWindowId);
		  
		  //Shift IT from parent window to child window id
		   String childWindowId = it.next();
		   System.out.println("Child Window ID :" + childWindowId);
		   
		   //Switch to child window
		   driver.switchTo().window(childWindowId);
		   
		   Thread.sleep(2000);
		   
		   //Capture child window title
		   System.out.println("Child Window pop up Title :"+ driver.getTitle());
		   
		   //Close the child window
		   driver.close();
		   
		   //Come back to the main Windo/ Parent Window ID
		   driver.switchTo().window(parentWindowId);
		   
		   Thread.sleep(2000);
		   //Capture the Parent window Title
		   System.out.println("Parent Window Title :"+ driver.getTitle());
		   
		   
	}

}
