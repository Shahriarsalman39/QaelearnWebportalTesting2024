package syncronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestQaE {

	WebDriver driver;
	
	String Browser ="Firefox";
	
	
	public void openApplication() {
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}else if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("we do not support this :");
		}
		driver.get("https://qaelearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	
	public void Closepplication() {
		if(driver!= null) {
			driver.quit();
		}
	}
	
	
}
