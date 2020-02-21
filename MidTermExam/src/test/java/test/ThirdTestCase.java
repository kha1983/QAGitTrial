package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class ThirdTestCase {
	
	WebDriver driver;
	@Test
	public void ValidUserShoulBeAbleToLogIn()     {
		
		driver=BrowserFactory.startBrowser();
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.login();
		
		driver.manage().deleteAllCookies();
		
		driver.close();
		
		driver.quit();
	}

}
