package pom.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.pages.FBHomePage;
import pom.pages.FBLoginPage;

public class FBLoginTest extends BaseTest{
	
	
	@Test
	public void facebookTest()
	{
		FBLoginPage loginpage = PageFactory.initElements(driver, FBLoginPage.class);
		loginpage.loginToFB("kraja137@yahoo.com", "needamangalam");
		FBHomePage homepage = PageFactory.initElements(driver, FBHomePage.class);
		assertTrue(homepage.verifyLoggedInUsername().trim().equalsIgnoreCase("Karthik Raja"));
		homepage.logout();
	}
	

}
