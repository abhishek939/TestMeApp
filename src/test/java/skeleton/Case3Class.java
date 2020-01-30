package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case3Class 
{
	 WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page()
	{
	   /* // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();*/
		driver = utilityClass.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Signup = driver.findElement(By.partialLinkText("SignIn"));
		Signup.click();
		
		WebElement email = driver.findElement(By.name("userName"));
		email.clear();
		email.sendKeys("Lalitha");

		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Password123");
		
		WebElement loginclick = driver.findElement(By.name("Login"));
		loginclick.click();
	}

	@When("user enter the {string} in search")
	public void user_enter_the_in_search(String string) {
		
		WebElement search = driver.findElement(By.id("myInput"));
		search.clear();
		search.sendKeys(string);
		
		
	}

	@When("user selects the name in dropdown")
	public void user_selects_the_name_in_dropdown() 
	{		
		//WebElement dd = driver.findElement(By.id("myInputautocomplete-list"));
		//WebElement dc = driver.findElement(By.partialLinkText("Headphone"));
		//dc.click();
	}

	@When("user clicks on find details")
	public void user_clicks_on_find_details() 
	{
		WebElement fd = driver.findElement(By.xpath("//input[@value='FIND DETAILS']"));
		fd.click();
	}

	@When("user clicks on addtocart")
	public void user_clicks_on_addtocart() 
	{
		WebElement adc = driver.findElement(By.linkText("Add to cart"));
		adc.click();
	}

	@Then("product should be added to the cart")
	public void product_should_be_added_to_the_cart()
	{
	   Assert.assertEquals("Search", driver.getTitle());
	}


}
