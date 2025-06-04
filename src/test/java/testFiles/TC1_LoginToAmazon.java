package testFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import sourceFiles.Amazon_HomePage;
import sourceFiles.Amazon_LoginPage;
import sourceFiles.Amazon_ProductPage1;
import sourceFiles.Amazon_SearchResultPage;

public class TC1_LoginToAmazon  extends BaseClass{

	@Test
	public void loginToAmazon() throws InterruptedException
	{
		Amazon_HomePage d1 = new Amazon_HomePage(driver);
		d1.clickOnAccountListHover(driver);
		Thread.sleep(3000);
		
		Amazon_LoginPage d2 = new Amazon_LoginPage(driver);
        d2.enterUsername();
		Thread.sleep(3000);
        d2.enterPassword();
		Thread.sleep(3000);

	
        d1.clickOnSignout(driver);
        }
}
