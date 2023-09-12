package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;

public class LoginTestCase extends BaseClass{
	
	@Test
	public void VerifyValidLogin() throws IOException, InterruptedException {
		initializeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo= new LoginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickOnLogin().click();
	
	}
	
	@Test
	public void VerifyInValidLogin() throws IOException, InterruptedException {
		initializeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo= new LoginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin345");
		lpo.enterPassword().sendKeys("admin123345");
		lpo.clickOnLogin().click();


}
}