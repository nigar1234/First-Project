import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
	     
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement tergetElement = driver.findElement(By.id("droppable"));
		
		//Implicit Wait
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
		Actions action = new Actions(driver);
		
		action.clickAndHold(sourceElement).moveToElement(tergetElement).release().build().perform();
		
	
	}

}
