package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class BasicXpathForQAELearn extends BaseTestForQAELearn{

	@BeforeMethod
	public void opendaraz() {
		openApplication();
		
}
	@Test
	public void basicXpath() {
		driver.findElement(By.xpath("//div[@class='block align-right']/a[3]")).click();
		driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Salman");
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys("ahgvHo");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		
		
	}
	@Test
	public void basicXpath1() {
		WebElement text= driver.findElement(By.xpath("//h5[contains(text(),'1000+ VID')]"));	
		System.out.println(text+ "text is : ");
	}
	
	@Test
	public void basicXpath2() {
		driver.findElement(By.xpath("//a[text()='Nazrul Koyel']")).click();	
		
	}
	@Test
	public void basicXpath3() {
		WebElement text1= driver.findElement(By.xpath("//h6[text()='Become a TAX Preparer']"));	
		 System.out.println(text1+ "text is : ");
	}
	
	@Test
	public void basicXpath4() {
		WebElement text2=driver.findElement(By.xpath("//button[starts-with(@class,'rex-bottom-m')]"));	
		 System.out.println(text2+ "text is : ");
	}
	
	@Test
	public void basicXpath6() {
		WebElement text3=driver.findElement(By.xpath("//*[contains(@class,'-medium rex-btn-icon search')]"));	
		 System.out.println(text3+ "text is : ");
	}
	
	@AfterMethod
	public void closedaraz() {
		closeApplication();
	}
	
}
