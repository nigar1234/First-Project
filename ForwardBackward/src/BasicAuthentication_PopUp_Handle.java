import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication_PopUp_Handle {

	public static void main(String[] args) {
		//Set System Property	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
		
		//Instantiate a Browser
		WebDriver driver = new ChromeDriver();
		
		//http://username:password@Test.com---Syntex, because we can not inspect username and password from the pop up window
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
				
		
		String pageMessage= driver.findElement(By.cssSelector("p")).getText();
		System.out.println( "After login get the Page message :" +pageMessage);
			

	}

}
