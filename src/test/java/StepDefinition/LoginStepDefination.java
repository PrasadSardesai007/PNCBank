package StepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EnrollmentPage;
import pages.LoginnPage;
import pages.WebDriverSingleton;

public class LoginStepDefination {
	// public WebDriver driver;
	public LoginnPage loginPageObj;
	private WebDriver driver;

	public LoginStepDefination() {

		// WebDriverSingleton WebDriverSingleton = new WebDriverSingleton();
		this.driver = WebDriverSingleton.getDriver();
	}

	String appUrl = "https://www.pnc.com";

	@Given("User Launches the PNC Bank application")
	public void user_launch_pnc_bank_application() {
		// driver = SetUpDriver();
		loginPageObj = new LoginnPage();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPageObj.clickOnPersonalTab();

	}

	@When("User clicks on the Sign On button")
	public void user_click_on_sign_on_button() {
		loginPageObj.clickOnSignOnBtn();
	}

	@And("User enters username and password")
	public void user_enters_username_and_password() {
		loginPageObj.enterUserID("sardesp");
		loginPageObj.enterPassword("Vbfg@12536");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPageObj.clickOnLogInBtn();
	}

	@Then("Shows warning or error on UI")
	public void shows_warning_or_error_on_ui() {
		List<String> lst = new ArrayList<String>();

		String warning = "It looks like you're experiencing problems logging in";
		System.out.println(loginPageObj.getWarningMsg());
		lst.add(loginPageObj.getWarningMsg());

		assertTrue("Unable to validate warning Message", lst.get(0).contains(warning));

	}

	@When("User clicks on the Enroll In Online Banking button")
	public void user_clicks_on_the_enroll_in_online_banking_button() throws InterruptedException {
		
		
		loginPageObj.clickOnenrollInOnlineBanking();

	}

}
