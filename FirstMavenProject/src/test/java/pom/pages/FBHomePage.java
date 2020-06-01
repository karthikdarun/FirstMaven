package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"mount_0_0\"]/div/div/div[2]/div[4]/div[1]/div[1]/a/span") WebElement username_text;
	@FindBy(xpath="//*[@id=\"mount_0_0\"]/div/div/div[2]/div[4]/div[1]/span/div[1]/div[1]/img") WebElement account_button;
	@FindBy(xpath="//span[text()='Log Out']") WebElement logout_button;
	
	public FBHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logout()
	{
		account_button.click();
		logout_button.click();
	}
	
	public String verifyLoggedInUsername()
	{
		
		String userText  = username_text.getText();
		return userText;	
	}

}
