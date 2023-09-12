package TestCases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;


public class MyInfoTestCases extends BaseClass{
	
	@Test
	public void FillPersonalDetails(WebDriver driver) throws InterruptedException, IOException {
		
initializeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo= new LoginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickOnLogin().click();
 myInfoPageObjects mpo=  new  myInfoPageObjects();
 
mpo.c
	
	
}
