package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.WebDriverSingleton;

public class RunnerHooks {

	private WebDriver driver;
	public WebDriverWait waits;

	public RunnerHooks() {
		this.driver = WebDriverSingleton.getDriver();

	}
	
	
	@Before
	public void setUp() {

		this.driver = WebDriverSingleton.getDriver();
		

	}

	/*
	 * @After public void TearDown() {
	 * 
	 * driver.close();
	 * 
	 * 
	 * }
	 */

}
