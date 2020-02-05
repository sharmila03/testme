package strrdeff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Loginclass {
	WebDriver driver;
	@When("user Launches into browser and  navigates into testme app")
	public void user_Launches_into_browser_and_navigates_into_testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	@When("user clicks the sigin button")
	public void user_clicks_the_sigin_button() {
	    driver.findElement(By.linkText("SignIn")).click();
	    
	}
	
	@When("User Enter the valid username as {string} as un")
	public void user_Enter_the_valid_username_as_as_un(String user) {
		 driver.findElement(By.name("userName")).sendKeys(user);

	}
	
	@When("User Enter the valid Password as {string} as pwd")
	public void user_Enter_the_valid_Password_as_as_pwd(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("click on the Login button")
	public void click_on_the_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("validates that the user Login into a valid data")
	public void validates_that_the_user_Login_into_a_valid_data() {
		Assert.assertEquals(driver.getTitle(),"Home");
	}

	@Then("user clicks the logout button")
	public void user_clicks_the_logout_button() {
	    driver.findElement(By.linkText("SignOut")).click();
	}

	
}
