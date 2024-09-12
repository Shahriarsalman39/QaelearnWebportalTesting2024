package syncronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	WebDriver driver;
	WebDriverWait w;
	
	public ExplicitWait(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy (xpath="//div[@class='block align-right']/a[3]") public WebElement CLicklogin;
	@FindBy (xpath="//input[@id='recipient-name']") public WebElement  uName;
	@FindBy (xpath="//input[starts-with(@id,'pas')]") public WebElement paSS;
	@FindBy (xpath="//*[text()='Login']") public WebElement loGin;
	
	
	
	
	public void ClickLogin1() {
		CLicklogin.click();
	}
	
	
	public WebElement username1(String enterUsername) {
		w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(uName));
		uName.sendKeys(enterUsername);
		return uName;
		
	}
	
	
	public WebElement password1(String enterPassword) {
		w= new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(paSS));
		paSS.sendKeys(enterPassword);
		return paSS;
		
	}
	
	
	public void Login1() {
		w=new WebDriverWait(driver, Duration.ofSeconds(12));
		w.until(ExpectedConditions.elementToBeClickable(loGin)).click();
	}
	
}
