package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends basepage{

	public loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	
	// webelements
	

	@FindBy(xpath="//img[@class='auth0-lock-header-logo']")WebElement logo;
	
	@FindBy(xpath="//input[@id='1-email']")WebElement Txt_username;
	
	@FindBy(xpath="//input[@id='1-password']")WebElement Txt_password;
	
	@FindBy(xpath="//span[@class='auth0-label-submit']")WebElement lgn_btn;
	@FindBy(xpath="//a[@class='auth0-lock-alternative-link']")WebElement forgotlink_btn;
	@FindBy(xpath="//div[@title='Reset your password']")WebElement reset_title;
	
	@FindBy(xpath="//span[@class='auth0-label-submit']")WebElement sendmail_btn;
	@FindBy(xpath="//div[@class='auth0-global-message auth0-global-message-success']")WebElement cnf_msg;
	@FindBy(xpath="//input[@id='1-email']")WebElement reset_emailinput;
	
	// actions methods
	
	public boolean verifylogoonloginpage()
	 {   try {
		return logo.isDisplayed();
	 }
	 catch(Exception e)
	 {
		 return false ;
	 }
	 }
	
	
	 public void setusername(String name)
	 {	 
		 Txt_username.sendKeys(name);
	 }

	 public void setusername1()
	 {	 
		 Txt_username.clear();
	 }
	 
	public void setpassword(String pwd)
	{
		Txt_password.sendKeys(pwd);
	}
	 
	public void clicktologinbutton()
	{
		lgn_btn.click();
	}
	
	
	
	public void clicktoresetpwdbtn()
	{
		forgotlink_btn.click();
	}
	
	public boolean verfityresettitle()
	{
		try
		{
			return reset_title.isDisplayed()	;
		}
		catch(Exception e)
		{
			
		}
		return false;
	}
	
	
	  public void clicktosendemailbtn()
	  {
		sendmail_btn.click();
	  }
	
	  public boolean verifyresettexts()
	  {
		  try
		  {
			  return cnf_msg.isDisplayed();
		  }
		  catch(Exception e)
		  {
			  return false;
		  }
		
	  }
	  
	  
	  public void setresetpwdmail(String mail)
	  {
		  reset_emailinput.sendKeys(mail);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
