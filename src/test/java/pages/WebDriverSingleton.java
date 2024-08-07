package pages;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
	    private static WebDriver driver;

	    public WebDriverSingleton() {
	        // Private constructor to prevent instantiation
	    }

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            // Initialize the WebDriver (e.g., ChromeDriver, FirefoxDriver, etc.)
	            // Example: Using ChromeDriver
	        	driver = new ChromeDriver();
	    		System.getProperty("webdriver.chrome.driver", "src/test/java/alv/resources/chromedriver.exe");
	    		driver.manage().window().maximize();
	    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    		
	        }
	        return driver;
	    
	}

}
