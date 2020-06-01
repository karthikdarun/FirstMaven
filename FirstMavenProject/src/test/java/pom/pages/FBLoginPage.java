package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBLoginPage {
	
	WebDriver driver;
	
	@FindBy(name="email") WebElement username;
	@FindBy(id="pass") WebElement Password;
	@FindBy(id="loginbutton") WebElement login_button;

	
	public  FBLoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
public void loginToFB(String uname, String pass)
{
	username.sendKeys(uname);
	Password.sendKeys(pass);
	login_button.click();
}



}