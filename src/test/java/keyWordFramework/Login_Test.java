package keyWordFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test extends Base_Test{

	Login_page lp;
	Test_reader tr;
	
	@BeforeMethod(groups= {"Smoke","Regression","Functional"})
	public void openQaeAPP() {
		openApplication();
	}
	
	@Test(groups= {"Smoke","Regression","Functional"})
	public void validLoginTest() {
		lp = new Login_page(driver);
		tr=new Test_reader();
		lp.lButton2();
		lp.username5(tr.readUsername());
		lp.password6(tr.readPassword());
		lp.login();
	}
	
	@Test(groups= {"Smoke","Functional"})
	public void InvalidLoginTest() {
		lp = new Login_page(driver);
		tr=new Test_reader();
		lp.lButton2();
		lp.username5(tr.readUsername());
		lp.password6(tr.readPassword());
		lp.login();
	}
	
	
	@Test(groups= {"Regression","Functional"})
	public void InvalidLoginTest2() {
		lp = new Login_page(driver);
		tr=new Test_reader();
		lp.lButton2();
		lp.username5(tr.readUsername());
		lp.password6(tr.readPassword());
		lp.login();
	}
	
	
	
	@AfterMethod(groups= {"Smoke","Regression","Functional"})
	public void closeQaeApp() {
		closeApplication();
		
	}

}
