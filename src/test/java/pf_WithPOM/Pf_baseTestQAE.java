package pf_WithPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pf_baseTestQAE {

	WebDriver driver;
	String Browser ="Chrome";
	
	
	public void openApplication() {
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else {System.out.println("we do not support this browser");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qaelearn.com/");
		
		
	}
	
	
	public void closeApplication() {
		driver.quit();
	}
}
