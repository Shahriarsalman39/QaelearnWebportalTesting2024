package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public void LoginButton() {
		driver.findElement(By.xpath("//div[@class='block align-right']/a[3]")).click();
	}
	
	
	public WebElement UsernameTest(String userName) {
		WebElement username1= driver.findElement(By.xpath("//input[@id='recipient-name']"));
		username1.sendKeys(userName);
		return null;
		
		}
	
	public WebElement passwordTest(String pass1) {
		WebElement pass= driver.findElement(By.xpath("//input[starts-with(@id,'pas')]"));
		pass.sendKeys(pass1);
		return pass;
		
	}
	
	public void GetLink() {
		driver.findElement(By.xpath("//a[text()='Nazrul Koyel']")).click();
	}
	
	
	public void getText() {
	WebElement gtext=	driver.findElement(By.xpath("//h6[text()='Become a TAX Preparer']"));
		System.out.println("The text is :"+" "+gtext);
	}
	
	
	
}
