package sourceFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Amazon_LoginPage {
 EdgeDriver driver;
 
		@FindBy(id="ap_email_login")
		WebElement username;

		@FindBy(id="ap_password")
		WebElement password;

		@FindBy(xpath="//input[@type='submit']")
		WebElement submit;
		
		public void enterUsername()
		{
			username.sendKeys("7720802078");
			submit.click();
		}
		public void enterPassword()
		{
			password.sendKeys("Harshal#123");
			submit.click();

		}

		public Amazon_LoginPage(EdgeDriver driver2)
		{this.driver=driver2;
			PageFactory.initElements(driver2, this);
		}
		
}
