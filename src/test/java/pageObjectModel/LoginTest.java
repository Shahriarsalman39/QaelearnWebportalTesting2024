package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestQAELearn {

	LoginPage lp;
	
	@BeforeMethod
	public void openQAE() {
		openApplication();
		
	}
	
	@Test
	public void validLoginTest() {
		 lp = new LoginPage(driver);
		lp.LoginButton();
		lp.UsernameTest("Shahriarsalman39");
		lp.passwordTest("Onukabbo792825@");
		
	}
	
	@Test
	public void InvalidLoginTest() {
	 lp = new LoginPage(driver);
		lp.LoginButton();
		lp.UsernameTest("ahmed45@gmail.com");
		lp.passwordTest("45278UTY&*@");
		
	}
	
	@Test
	public void LinkTest() {
	 lp = new LoginPage(driver);
	lp.GetLink();
	
	
	}
	
	@Test
	public void GetTextTest() {
	 lp = new LoginPage(driver);
	 lp.getText();
	 
	}
	
	
	
	
	@AfterMethod
	public void closeQAE() {
		closeApplication();
	}
}
