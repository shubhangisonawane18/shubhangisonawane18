package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoPageObjects {
	public WebDriver driver;
	
	
	
	private By myInfo= By.xpath("//span[@normalise-space()='My Info']");
	
	
		
		

		public WebElement clickonMyInfo(){
			return driver.findElement(myInfo);
		}



		


		
	}

}
