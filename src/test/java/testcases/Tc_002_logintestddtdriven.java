package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Pageobjects.loginpage;
import Pageobjects.shomepage;
import testbase.baseclass;
import utilities.DataProviders;



public class Tc_002_logintestddtdriven extends baseclass {

	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	
	public void logintest(String mail,String pwd ,String res)
	
	{
		logger.info("Tc_002_logintest starting");
		
			loginpage hp=new loginpage(driver);
		logger.info("passing data ");
		hp.setusername(mail);
		hp.setpassword(pwd );
		hp.clicktologinbutton();
		logger.info("clicked to login butn");
		
		shomepage hp1=new shomepage(driver);

       
		if (res.equals("valid"))
		{
			if(hp1.Verifytexts()==true)
			{
				hp1.clicktouserinfo();
				hp1.clicktologoutbtn();
				Assert.assertTrue(true);
			}
				else
				{
					Assert.assertTrue(false);
				}
		}	
		
		
		

		if (res.equals("invalid"))
		{
			if(hp1.Verifytexts()==true)
			{
				
				hp1.clicktouserinfo();
				hp1.clicktologoutbtn();
				Assert.assertTrue(false);
			}
				else
				{
					
					Assert.assertTrue(true);
				}
		}	
		
		
		
		}
		
	
		
	}
		

	
	
	
	
	
	

