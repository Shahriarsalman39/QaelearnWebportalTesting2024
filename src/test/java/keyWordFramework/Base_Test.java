package keyWordFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Test {

	WebDriver driver;
	Test_reader tr;
	
	
	public void openApplication() {
		tr= new Test_reader();
		String Browser= tr.readBrowser();
		
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
		//String QAEurL= tr.readUrl();
		driver.get(tr.readUrl());
		
		
	}
	
	
	public void closeApplication() {
		driver.quit();
	}
}
