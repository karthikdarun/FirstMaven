package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Karthik Raja']") WebElement username_text;
	@FindBy(xpath="//*[@id=\"mount_0_0\"]/div/div/div[1]/div[2]/div[4]/div/span/div/div/img") WebElement account_button;
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
		System.out.println(userText);
		return userText;	
	}

}
