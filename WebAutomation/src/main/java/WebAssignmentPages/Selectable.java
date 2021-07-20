package WebAssignmentPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selectable 
{
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
	
	WebDriver driver;
	
	@FindBy(linkText=("Selectable"))
	WebElement selectableoption;
	
	@FindBy(tagName=("li"))
	public List<WebElement> Items;

	public Selectable (WebDriver driver)
	{ 
		this.driver = driver;

		//This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}
	
	//Click Selectable option from left menu
	public void clickselectableoption()
	{
		 selectableoption.click();
		 System.out.println("Selectable option from left menu Clicked");
	}
	
	//Select Item 1, Item 3, Item 7
	public void selectitemoptions()
	{
		// Performing actions to select items with Ctrl Key
		
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		act.keyDown(Keys.CONTROL).click(Items.get(0)).click(Items.get(2)).click(Items.get(6))
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		System.out.println("Item 1,Item 3 and Item 7 has been selected succcessfully");
	}
}
