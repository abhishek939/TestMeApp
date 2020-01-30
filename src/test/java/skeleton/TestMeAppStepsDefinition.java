package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginObjects;
import skeleton.utilityClass;

public class TestMeAppStepsDefinition 
{
	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_the_login_page() 
	{
		driver = utilityClass.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, LoginObjects.class);
	}

	@When("user enter the credentials")
	public void user_enter_the_credentials() 
	{   
		WebElement login = driver.findElement(By.linkText("SignIn"));
		login.click();

		WebElement name = driver.findElement(By.name("userName"));
		name.clear();
		name.sendKeys("Lalitha");

		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Password123");

		WebElement loginclick = driver.findElement(By.name("Login"));
		loginclick.click();

	}

	@Then("user is on the home page")
	public void user_is_on_the_home_page()
	{  
		Assert.assertEquals("Home",driver.getTitle());
		
	}
/*----------------------------------------------------------------------------------------------------*/	
	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String userName) 
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		WebElement login = driver.findElement(By.linkText("SignIn"));
		login.click();

		/*WebElement name = driver.findElement(By.name("userName"));
		name.clear();
		name.sendKeys(userName);*/
		
		LoginObjects.userName.sendKeys(userName);
		
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String passw) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		/*WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys(passw);*/
		
		LoginObjects.password.sendKeys(passw);
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user can do successfull login")
	public void user_can_do_successfull_login() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		WebElement loginclick = driver.findElement(By.name("Login"));
		loginclick.click();
		Assert.assertEquals("Home",driver.getTitle());
	}
	
	
	
}
