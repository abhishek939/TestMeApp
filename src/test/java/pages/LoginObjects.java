package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjects 
{

	/*@FindBy(how=How.NAME,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement password;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Login")
	public static WebElement login_button;*/
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="SignUp")
	public static WebElement SignUp;
	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement userName;
	
	@FindBy(how=How.NAME,using="firstName")
	public static WebElement firstName;
	
	@FindBy(how=How.NAME,using="lastName")
	public static WebElement lastName;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement password;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how=How.XPATH,using="//span[text()='Female']")
	public static WebElement Gender;
	
	@FindBy(how=How.NAME,using="emailAddress")
	public static WebElement emailAddress;
	
	@FindBy(how=How.NAME,using="mobileNumber")
	public static WebElement mobileNumber;
	
	@FindBy(how=How.NAME,using="dob")
	public static WebElement dob;
	
	@FindBy(how=How.NAME,using="address")
	public static WebElement address;
	
	@FindBy(how=How.NAME,using="securityQuestion")
	public static WebElement securityQuestion;
	
	@FindBy(how=How.NAME,using="answer")
	public static WebElement answer;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Submit")
	public static WebElement Submit;
	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement pass;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Login")
	public static WebElement LogIn;


}
