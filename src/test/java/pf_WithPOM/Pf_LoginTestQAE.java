package pf_WithPOM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pf_LoginTestQAE extends Pf_baseTestQAE{

	Pf_LoginPageQAE lp;
	
	@BeforeMethod
	public void openQaeAPP() {
		openApplication();
	}
	
	@Test
	public void validLoginTest() {
		lp = new Pf_LoginPageQAE(driver);
		lp.lButton2();
		lp.username5("Salman");
		lp.password6("salkj");
		lp.login();
	}
	
	@Test
	public void InvalidLoginTest() {
		lp = new Pf_LoginPageQAE(driver);
		lp.lButton2();
		lp.username5("Salmanshahriar");
		lp.password6("jku879");
		lp.login();
	}
	
	
	
	@AfterMethod
	public void closeQaeApp() {
		closeApplication();
		
	}

}
