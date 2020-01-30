package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case4 {
	WebDriver driver;
	//Actions actions = new Actions(driver);
	@Given("John want want to Purchase Headphones from test me app")
	public void john_want_want_to_Purchase_Headphones_from_test_me_app()
	{
		driver = utilityClass.getDriver("chrome");
	   
	}
	//Actions actions = new Actions(driver);
	@When("John Enter URL of Testme app")
	public void john_Enter_URL_of_Testme_app()
	{
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 
	}

	@Then("Testme app will open")
	public void testme_app_will_open()
	{
		 driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("John will click on all categories")
	public void john_will_click_on_all_categories()
	{
		Actions actions = new Actions(driver);
		   actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All')]"))).click().perform();
		   
	}

	@Then("appropriate result should be display by testme app")
	public void appropriate_result_should_be_display_by_testme_app() 
	{Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
		  
	}

	@When("john Select product from dropdown list")
	public void john_Select_product_from_dropdown_list() 
	{Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Head')]"))).click().perform();
		  
	}

	

	@When("John click on add to cart button")
	public void john_click_on_add_to_cart_button() 
	{
		Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"))).click().perform();
		 }

	@Then("Login page should open")
	public void login_page_should_open()
	{
	    Assert.assertEquals("Login",driver.getTitle());
	}

	@When("John Login Using his credentials")
	public void john_Login_Using_his_credentials() 
	{
		 WebElement email=driver.findElement(By.name("userName"));
	     email.clear();
	     email.sendKeys("Lalitha");
	     WebElement password=driver.findElement(By.name("password"));
	     password.clear();
	     password.sendKeys("Password123");
	     
	     WebElement loginclick=driver.findElement(By.name("Login"));
	     loginclick.click();
	}

	@Then("John will search for the headphones in all categories")
	public void john_will_search_for_the_headphones_in_all_categories()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All')]"))).click().perform();
	}

	@Then("John will select product")
	public void john_will_select_product() 
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Head')]"))).click().perform();
	}

	@Then("John will click on add to cart")
	public void john_will_click_on_add_to_cart() 
	{Actions actions = new Actions(driver);
	 actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"))).click().perform();
	}

	@Then("John will click on cart Link which is on a page")
	public void john_will_click_on_cart_Link_which_is_on_a_page() 
	{Actions actions = new Actions(driver);
	 actions.moveToElement(driver.findElement(By.xpath("//a[@href='displayCart.htm']"))).click().perform();
	}

	
	@When("John will complete payment Process")
	public void john_will_complete_payment_Process()
	{Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("//a[@href='checkout.htm']"))).click().perform();
		   actions.moveToElement(driver.findElement(By.xpath("//input[@value='Proceed to Pay']"))).click().perform();
		   
		   actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Andhra')]"))).click().perform();
		   driver.findElement(By.id("btn")).click();
	}

}
