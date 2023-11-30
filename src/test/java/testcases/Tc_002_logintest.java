package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import Pageobjects.loginpage;
import Pageobjects.shomepage;
import testbase.baseclass;



public class Tc_002_logintest extends baseclass {

	
	@Test(groups = {"sanity","master"})
	
	public void logintest()
	
	{
		logger.info("Tc_002_logintest starting");
		try
		{
			loginpage hp=new loginpage(driver);
		logger.info("passing data ");
		hp.setusername(bundle.getString("email"));
		hp.setpassword(bundle.getString("password"));
		hp.clicktologinbutton();
		logger.info("clicked to login butn");
		
		shomepage hp1=new shomepage(driver);

         Assert.assertEquals(hp1.Verifytexts(), true);
		
			logger.info("*** verified texts");	
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Tc_002_logintest finished");
	}
	
	
	
	
	
	
	
}
