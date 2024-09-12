package syncronization;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTest extends BaseTestQaE{

	
	ExplicitWait exw;
	
	@BeforeMethod
	public void openapp(){
		openApplication();
	}
	
	//@Test
	public void logintest1() {
		driver.findElement(By.xpath("//a[text()='Nazrul Koyel']")).click();
		
	}
	
	
	@Test
	public void ValidLoginTest(){
		openApplication();
        exw= new ExplicitWait(driver);
		exw.ClickLogin1();
		exw.username1("Shahriarsalman39@gmail.com");
		exw.password1("258@#*JK");
		exw.Login1();
		
	}
	
	@Test
	public void InValidLoginTest(){
		openApplication();
        exw= new ExplicitWait(driver);
		exw.ClickLogin1();
		exw.username1("ahmenrf@gmail.com");
		exw.password1("dfhief#");
		exw.Login1();
		
	}
	@AfterMethod
	public void Closeapp(){
		Closepplication();
	}
	
}
