package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginTest {
	WebDriver driver = Hooks.driver;

	@Given("I go to login the Swag Labs webpage")
	public void i_go_to_login_the_Swag_Labs_webpage() {
		driver.get("https://www.saucedemo.com/");
	   
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String Usernames) {
		
		WebElement Username = driver.findElement(By.name("user-name"));
		Username.sendKeys(Usernames);
		
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String Passwords) {
		
		WebElement Password = driver.findElement(By.id("password"));
		
		Password.sendKeys(Passwords);
		
	}

	@When("I click ob login button")
	public void i_click_ob_login_button() {
		WebElement Loginbutton = driver.findElement(By.name("login-button"));
		Loginbutton.click();
		
	}

	@Then("I shoud land on home page {string}")
	public void i_shoud_land_on_home_page(String ExpURL) {
	    
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, ExpURL);
	}


	@Then("I shoud get the error message is {string}")
	public void i_shoud_get_the_error_message_is(String EXPerrorMSG) {
		
		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String Actual_error = error.getText();
		Assert.assertEquals(Actual_error, EXPerrorMSG);
		
	    
	}

}
