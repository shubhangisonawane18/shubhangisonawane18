package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;

	public void initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Jagta\\eclipse-workspace\\5thJune2023TestNGFrameworkDemo\\src\\main\\java\\Resources\\data.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("Firebox")) {
			driver = new FirefoxDriver();

		}

		else {
			System.out.println("please choose valid browser");

		}

	}

}
