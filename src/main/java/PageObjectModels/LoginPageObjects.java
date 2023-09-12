package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
	
	private By username= By.xpath("//input[@name='username']");
	private By password= By.xpath("//input[@name='password']");
	private By login= By.xpath("//button[@type='submit']");
	
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}



	public WebElement enterUsername(){
		return driver.findElement(username);
	}



	public  WebElement enterPassword(){
		return driver.findElement(password);

}

	public WebElement clickOnLogin(){
		return driver.findElement(login);
	}


}