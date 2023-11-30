package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;


import Pageobjects.loginpage;
import Pageobjects.shomepage;
import testbase.baseclass;

public class Tc_001_logopresence extends baseclass {

	
	
	@Test(groups= {"sanity","master"})
	public void logopresence()
	
	{
		logger.info("***Tc_001_logopresence starting");
		shomepage hp1=new shomepage(driver);
		
		
		
		try {
			
		
		loginpage hp=new loginpage(driver);
		
		Assert.assertEquals(hp.verifylogoonloginpage(), true);
		logger.info("***verfied logo present****");
		}
		catch(Exception e)
		{
			logger.error("***test failed***");
			Assert.fail();
		}
		
		logger.info("Tc_001_logopresence finished");
	}
	
	
	
	
	
	
	
}
