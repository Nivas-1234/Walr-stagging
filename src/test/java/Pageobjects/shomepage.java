package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shomepage extends basepage {

	



	
	public shomepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}




	@FindBy(xpath="//h3[contains(.,' Nivas')]")WebElement texthomepage;
	@FindBy(xpath="//span[@class='user-info']")WebElement userinfo_btn;
	@FindBy(xpath="//button[normalize-space()='Logout']")WebElement logout_btn;
	
	@FindBy(xpath="//div[@class='rounded-circle d-flex justify-content-center align-items-center text-primary circle create-new']")WebElement createproject_btn;
	@FindBy(css="body > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > fieldset:nth-child(1) > div:nth-child(1) > span:nth-child(1) > input:nth-child(1)")
	WebElement project_input;
	@FindBy(xpath="//button[normalize-space()='Next']")WebElement next_btn;
	@FindBy(xpath="//input[@value='Create'][1]")WebElement create_btn;
	
	@FindBy(xpath="//div[@class='d-flex flex-column justify-content-center']//h2")
	WebElement pname;
	
	public boolean Verifytexts()
	{
		try
		{
		return texthomepage.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}

	}
	
	public void clicktouserinfo()
	{
		userinfo_btn.click();
		
	}
	
	public void clicktologoutbtn()
	{
		logout_btn.click();
		
	}
	
	
	public void createnewproject()
	{
		createproject_btn.click();	
	}
	
	
	public void setprojectname(String pname)
	{
		project_input.sendKeys(pname);
	}
	
	public void clicktonextbtn()
	{
		next_btn.click();
		
	}
	
	public void clicktoncreateproject()
	{
		create_btn.click();
		
	}
	
	
	public boolean verifypname()
	{
		try
		{
			return pname.isDisplayed();
		}
		catch(Exception e)
		{
			
		}
		return false;
		
	}
}
