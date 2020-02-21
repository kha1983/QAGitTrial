package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
		WebDriver driver;
		
		public LoginPage(WebDriver driver)     {
			this.driver=driver;
			
		}
		
			// Element Library
			@FindBy(how = How.ID, using = "user_login")
			WebElement UserName_Field;
			
			@FindBy(how = How.NAME, using = "pwd")
			WebElement Password_Field;
			
			@FindBy(how = How.ID, using = "wp-submit")
			WebElement LogInButton_Field;
			
			
			// Methods to interact with the elements
			public void login()                {
			UserName_Field.sendKeys("opensourcecms");
			
			Password_Field.sendKeys("opensourcecms");
			
			LogInButton_Field.click();
		
			}
			public String getPageTitle()    {
				return driver.getTitle();
			
	}

}
