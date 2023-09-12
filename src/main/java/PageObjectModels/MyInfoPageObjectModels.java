package PageObjectModels;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.BaseClass;

public class MyInfoPageObjectModels extends BaseClass {
	
	@Test
	public void FillPersonalDetails() throws IOException, InterruptedException {
		
initializeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo= new LoginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickOnLogin().click();
	
		
		
		
		
		
		
		
		
		
		
	}

}
