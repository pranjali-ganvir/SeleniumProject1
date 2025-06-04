package sourceFiles;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_HomePage {
EdgeDriver driver;

	@FindBy(partialLinkText="Account & Lists")
	WebElement accListHover;
	
	@FindBy(xpath="//span[text()='Sign in']")
	WebElement signIn;
	
	//searchproduct
	@FindBy(id="twotabsearchtextbox")
	WebElement searchProduct;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement signOut;
	
	//address add
	@FindBy(xpath="//span[@id='glow-ingress-line1']")
	WebElement addAddress;
//	
@FindBy(linkText="Add an address or pick-up point")
	WebElement addAddressLink;
	
//broken links
@FindBy(tagName="a")
WebElement brokenlinks;

	public void clickOnAccountListHover(EdgeDriver driver2)
	{
		this.driver=driver2;
		Actions a = new Actions(driver2);
		a.moveToElement(accListHover).perform();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       signIn.click();
	}
	
	public Amazon_HomePage(EdgeDriver driver)
	{
this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	public void searchTheProduct() {
		searchProduct.sendKeys("shoes" +Keys.ENTER);
	}
	
	public void clickOnSignout(EdgeDriver driver) {
		this.driver=driver;
		Actions a = new Actions(driver);
		a.moveToElement(accListHover).perform();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		signOut.click();
	}
	public void deliverTo(EdgeDriver driver) throws InterruptedException {
		this.driver=driver;
       Thread.sleep(3000);
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='glow-ingress-line1']"))).click();
		//a.moveToElement(addAddress).perform();
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add an address or pick-up point")));
	        addAddressLink.click();
	    
}

public void brokenLinks() throws IOException
{
List<WebElement> links = driver.findElements(By.tagName("a"));
int count =links.size();
System.out.println(count);
//to print all links
for(int i=0; i<count;i++) 
{
	         WebElement e1=   links.get(i);
	        String url= e1.getDomAttribute("href");
	        System.out.println(url);
	         //calling broken link method
			         verifyTheLink(url);	         
}
}
static void verifyTheLink(String link) throws IOException 
{
try {
//create url class object
URL u1 = new URL(link);
//upcast nd use url method openconnection
                     HttpURLConnection c1=  (HttpURLConnection) u1.openConnection();
       if( c1.getResponseCode()==200)
		 {
	      System.out.println("The link is valid    "  +"   " + c1.getResponseCode()  + link  + "    " +c1.getResponseMessage());
		 }
       else
       {
		      System.out.println("The link is not valid " + link +"  " +c1.getResponseMessage());
       }
}
//two exception handled below
catch(MalformedURLException e1)
{
	System.out.println("Handled the exception 1");
}
catch(ClassCastException e2)
{
	System.out.println("Handled the exception 2");
}
}

}