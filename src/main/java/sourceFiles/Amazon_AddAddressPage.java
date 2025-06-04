package sourceFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_AddAddressPage {
	EdgeDriver driver;


	@FindBy(id="ya-myab-plus-address-icon")
	WebElement addToAddress;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement fullName;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mobNo;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement flatNo;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement areaName;
	
	@FindBy(id="address-ui-widgets-landmark")
	WebElement landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement town;
	
	/*
	 * @FindBy(xpath="//span[.='Choose a state']") WebElement state;
	 */
	
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement checkbox;
	
	@FindBy(id="address-ui-widgets-form-submit-button")
	WebElement addAddress;
	
	public void fillAddressDetails(EdgeDriver driver2) throws InterruptedException
	{
		this.driver=driver2;
		addToAddress.click();
		fullName.sendKeys("Siya Sharma");
		mobNo.sendKeys("9087889990");
		pincode.sendKeys("440017");
		flatNo.sendKeys("76 ");
		areaName.sendKeys("Laghuvetan Colony");
		landmark.sendKeys("Indora");
		town.sendKeys("");
		
		WebDriverWait wait = new WebDriverWait(driver2,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Choose a state']")));
		
	/*
	 * Thread.sleep(6000); Select sc = new Select(state); sc.selectByIndex(20);
	 */
//	sc.selectByVisibleText("MAHARASHTRA");
	Thread.sleep(2000);

	wait.until(ExpectedConditions.elementToBeClickable(checkbox));
	checkbox.click();
	Thread.sleep(4000);

	addAddress.click();
	Thread.sleep(6000);

	}
	
	public Amazon_AddAddressPage(EdgeDriver driver)
	{
     this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
