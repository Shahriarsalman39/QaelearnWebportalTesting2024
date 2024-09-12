package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait {

	WebDriver driver;
	
	public void loginTest() {
		driver = new ChromeDriver();
		
		//driver.get()== is fully loaded with pageLoadTimeout(Duration.ofSeconds(10));
		//so u do not have to write
		driver.manage().window().maximize();
		driver.get("https://qaelearn.com/");
		
		
		//Implicit wait for loading page
		driver.manage().window().maximize();
		driver.navigate().to("https://qaelearn.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		//Implicit wait for findelement method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='recipient-name']"));
		
		
		//Implicit wait for Scripting
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
	}
}
