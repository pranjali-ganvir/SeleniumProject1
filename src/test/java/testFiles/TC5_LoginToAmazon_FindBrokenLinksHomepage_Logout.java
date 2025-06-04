package testFiles;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sourceFiles.Amazon_HomePage;
import sourceFiles.Amazon_LoginPage;

public class TC5_LoginToAmazon_FindBrokenLinksHomepage_Logout extends BaseClass{

	@Test
	public void brokenLinks() throws InterruptedException, IOException
	{

		Amazon_HomePage d1 = new Amazon_HomePage(driver);
		d1.clickOnAccountListHover(driver);
		Thread.sleep(3000);
		
		Amazon_LoginPage d2 = new Amazon_LoginPage(driver);
        d2.enterUsername();
		Thread.sleep(3000);
        d2.enterPassword();
		Thread.sleep(3000);

	      d1.brokenLinks();
        d1.clickOnSignout(driver);
    	Thread.sleep(3000);

        }
     
	
}
