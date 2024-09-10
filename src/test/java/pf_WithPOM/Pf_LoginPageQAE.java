package pf_WithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pf_LoginPageQAE {

	WebDriver driver;


	public Pf_LoginPageQAE(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy (xpath="//div[@class='block align-right']/a[3]") public WebElement lbutton;
	@FindBy (xpath="//input[@id='recipient-name']") public WebElement uName;
	@FindBy (xpath="//input[starts-with(@id,'pas')]") public WebElement paSS;
	
	public void lButton2() {
		lbutton.click();
		
	}
	
	public WebElement username5(String UserName) {
		uName.sendKeys(UserName);
		return uName;
	}
	
	
	public WebElement password6 (String password1) {
		paSS.sendKeys(password1);
		return paSS;
		
	}
	@FindBy (xpath="//span[text()='Login']") public WebElement login1;
	public void login() {
		login1.click();
	}
}
