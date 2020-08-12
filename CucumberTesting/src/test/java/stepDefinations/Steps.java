package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("deprecation")
public class Steps {
	
	WebDriver driver = null;
	

	@Given("^I launch Chrome Browser$")
	public void i_launch_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../CucumberTesting/drivers/chromedriver.exe");
		driver= new ChromeDriver();	
	    
	}

	@When("^I open google home page$")
	public void i_open_google_home_page() throws Throwable {
		String url = "https://www.google.com";
		driver.get(url);
	    
	}

	@Then("^Google Page is displayed$")
	public void google_Page_is_displayed() throws Throwable {
		String ExpectedRes = "Google";
		String Actual = driver.getTitle();
		Assert.assertEquals(ExpectedRes, Actual); 
	}

	@Then("^Search button is present$")
	public void search_button_is_present() throws Throwable {
		
	   
	}


}
