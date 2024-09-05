package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class XpathLoopAndDynamicXpathForQaeLearn extends BaseTestForQAELearn{

	@BeforeMethod
	public void openQAelearn() {
		openApplication();
		
}
	@Test
	public void basicXpath1() {
		driver.findElement(By.xpath("//div[@class='col-md-3 footer-section']/ul/li[3]")).click();	
		
	}
	

	@Test
	public void xpathLoop2() {
	 WebElement	text5= driver.findElement(By.xpath("//p[contains(text(),'We Shared Awesome Articles ')]"));
	System.out.println(text5+ "text is");
	}
	
	@Test
	public void xpathLoop3() {
		driver.findElement(By.xpath("//a[contains(@class,'email-a')]")).click();
		
	}
	
	@Test
	public void xpathdynamic4() {
		 WebElement	text6=driver.findElement(By.xpath("//p[text()='Starting: 19th Jan, 2019']"));
		System.out.println(text6+ "text is");
	}
	
	@Test
	public void xpathdynamic5() {
		 WebElement	text7=driver.findElement(By.xpath("//div[@class='col-md-12 col-lg-5 about-content']/p"));
		System.out.println(text7+ "text is");
	}
	@Test
	public void xpathdynamic2() {
		driver.findElement(By.xpath("//*[@class='menu']/ul/li[3]")).click();
		
	}
	
	@AfterMethod
	public void closeQaelearn() {
		closeApplication();
	}
	
}
