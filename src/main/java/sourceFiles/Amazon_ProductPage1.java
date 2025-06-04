package sourceFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_ProductPage1{
	EdgeDriver driver;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement AddToWishlist;
	
	//click on add to cart

	@FindBy(id="add-to-cart-button")
	WebElement AddToCart;
	
	public void clickOnAddToWishlist(EdgeDriver driver2) throws InterruptedException
	{
		AddToWishlist.click();
		Thread.sleep(5000);
	}
	public void clickOnAddToCart(EdgeDriver driver2) throws InterruptedException
	{
		AddToCart.click();
		Thread.sleep(5000);
	}
	
	public Amazon_ProductPage1(EdgeDriver driver2)
	{
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}
}
/*
 * @FindBy(partialLinkText="View Your List") WebElement viewYourList;
 * 
 * @FindBy(partialLinkText= "Add to Cart") WebElement addToCart;
 * 
 * @FindBy(xpath="//span[text()='View Cart']") WebElement viewCart;
 */