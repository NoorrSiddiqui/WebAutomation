package WebAssignmentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class ControlGroup 
{
	/**
     * All WebElements are identified by @FindBy annotation
     */
	
	WebDriver driver;
	
	@FindBy(linkText=("Controlgroup"))
	WebElement controlgroupoption;
	
	@FindBy (xpath=("/html/body/div[1]/fieldset[1]/div/label[2]/span[1]"))
	WebElement rdAutomatic1;
	
	@FindBy (xpath=("/html/body/div[1]/fieldset[1]/div/label[3]/span[1]"))
	WebElement rdinsurance1;
	
	@FindBy (xpath=("/html/body/div[1]/fieldset[2]/div/label[2]/span[1]"))
	WebElement rdAutomatic2;
	
	@FindBy (xpath=("/html/body/div[1]/fieldset[2]/div/label[3]/span[1]"))
	WebElement rdinsurance2;
	
	public ControlGroup (WebDriver driver)
	{ 
		this.driver = driver;

		//This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}
	
	//Click Control Group option from left menu
	public void clickcontrolgroupoption()
	{
		controlgroupoption.click();
		 System.out.println("Control Group option from left menu Clicked");
	}
	
	//Click on Automatic radio button from 1st group
	public void clickautomatic1()
	{
		rdAutomatic1.click();
		 System.out.println("Automatic radio button from 1st group clicked");
	}

	//Click on Insurance Checkbox from 1st group
	public void clickInsurance1()
	{
		rdinsurance1.click();
		 System.out.println("Insurance Checkbox from 1st group clicked");
	}
	
	//Click on Automatic radio button from 2nd group
	public void clickAutomatic2()
	{
		rdAutomatic2.click();
		System.out.println("Automatic radio button from 2nd group clicked");
	}
	
	//Click on Insurance Checkbox from 2nd group
		public void clickInsurance2()
		{
		rdinsurance2.click();
		System.out.println("Insurance Checkbox from 2nd group clicked");
		}

}
