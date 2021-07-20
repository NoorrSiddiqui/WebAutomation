package WebAssignmentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Droppable 
{
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
	
	WebDriver driver;
	
	@FindBy(linkText=("Droppable"))
	WebElement DroppableOption;
	
	@FindBy(xpath=("//*[@id=\"draggable\"]"))
	WebElement Dragfrom;
	
	@FindBy(xpath=("//*[@id=\"droppable\"]"))
	WebElement Dragto;
	
	public Droppable (WebDriver driver)
	{ 
	 this.driver = driver;

     //This initElements method will create all WebElements

     PageFactory.initElements(driver, this);
	}
	
	//Click on droppable option from left menu
	public void clickdroppableoption()
	{
		 DroppableOption.click();
		 System.out.println("Droppable option from left menu Clicked");
	}
	
	//Drag ‘Drag me to my target’ component to ‘Drop here’ component 
		public void dragme()
		{
			Actions act=new Actions(driver);
	        act.dragAndDrop(Dragfrom, Dragto).perform();
	        System.out.println("Drag and Drop is Done");
		}
}