package testFiles;

import org.testng.annotations.Test;

import sourceFiles.Amazon_AddAddressPage;
import sourceFiles.Amazon_HomePage;
import sourceFiles.Amazon_LoginPage;
import sourceFiles.Amazon_ProductPage1;
import sourceFiles.Amazon_SearchResultPage;

public class TC4_LoginToAmazon_AddNewAddress_Logout extends BaseClass {
	@Test
	public void loginToAmazonAddNewAddressLogout() throws InterruptedException
	{
	Amazon_HomePage d1 = new Amazon_HomePage(driver);
	d1.clickOnAccountListHover(driver);
	Thread.sleep(3000);
	
	Amazon_LoginPage d2 = new Amazon_LoginPage(driver);
    d2.enterUsername();
	Thread.sleep(3000);
    d2.enterPassword();
     
    //click on address link
     d1.deliverTo(driver);
 	Thread.sleep(5000);

    
    Amazon_AddAddressPage pg = new Amazon_AddAddressPage(driver);
    pg.fillAddressDetails(driver);
 	Thread.sleep(5000);

 	
    d1.clickOnSignout(driver);
	Thread.sleep(3000);

    }
}