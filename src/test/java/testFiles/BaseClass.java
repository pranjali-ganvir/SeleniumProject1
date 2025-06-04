package testFiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	EdgeDriver driver;

@BeforeMethod
  public void loginAmazon() throws InterruptedException
  {
     driver = new EdgeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Reporter.log("Browser is successfully launched");
  }
	
  @AfterMethod 
	  public void logoutAmazon() 
	  { 
		  driver.close();
		  Reporter.log("Browser is successfully closed");
	  }
}
