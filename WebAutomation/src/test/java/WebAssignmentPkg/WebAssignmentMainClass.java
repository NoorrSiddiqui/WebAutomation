package WebAssignmentPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import WebAssignmentPages.Droppable;
import WebAssignmentPages.Selectable;
import WebAssignmentPages.ControlGroup;

public class WebAssignmentMainClass 
{
	WebDriver driver;
	Droppable objdroppable;
	Selectable objselectable;
	ControlGroup objcontrolgroup;
	
	@BeforeTest
		public void setup() 
		{
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Installations\\Softwares\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl = "https://jqueryui.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		}
	/**

     * This test go to https://jqueryui.com/

     * Click on Droppable

     * Drag and drop to the target

     */
	
	@Test(priority=0)
		public void ClickDroppable() 
		{
		
		System.out.println("Test Case 1: Started");
		//Create Droppablepage Object
		objdroppable = new Droppable(driver);

		//click to droppable option
		objdroppable.clickdroppableoption();
		
		//Switching to frame
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//Drag and drop to the target
		objdroppable.dragme();
		
		//Switching frame to default
		driver.switchTo().defaultContent();
		System.out.println("Test Case 1 'Droppable' is Completed and Passed");
		
		
		}
	
	@Test(priority=1)
		public void ClickSelectable()
		{
		
		System.out.println("Test Case 2: Started");
		// Create selectablepage Object
		objselectable = new Selectable(driver);
		
		//click to droppable option
		objselectable.clickselectableoption();
				
		//Switching to frame
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		//Selecting Items, Item 1,3 and 7
		objselectable.selectitemoptions();
		
		//Switching frame to default
		driver.switchTo().defaultContent();
		System.out.println("Test Case 2 'Selectable' is Completed and Passed");
		}
	
	@Test(priority=2)
		public void ClickControlGroup()
		{
		
		System.out.println("Test Case 3: Started");
		// Create Control Group page Object
		objcontrolgroup = new ControlGroup(driver);
		
		//click to Control Group option
		objcontrolgroup.clickcontrolgroupoption();
		
		//Switching to frame
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//Clicking on Automatic radiobuttons and Insurance Checkboxes from 1st & 2nd group
		objcontrolgroup.clickautomatic1();
		objcontrolgroup.clickInsurance2();
		objcontrolgroup.clickAutomatic2();
		objcontrolgroup.clickInsurance2();
	
		//Switching frame to default
		driver.switchTo().defaultContent();
		System.out.println("Test Case 3 'Control Group' is Completed and Passed");
		
		}

	@AfterTest
		public void afterTest() 
		{
		driver.close();
		}

}
