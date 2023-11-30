package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.loginpage;
import testbase.baseclass;

public class TC_003_Resetpwdtest extends baseclass {
	
	
	@Test(groups= {"master","regression"})
	public void Testresetpassword()
	{
		logger.info("****TC_003_Resetpwdtest starting");
		try {
		loginpage lp=new loginpage(driver);
		
		lp.clicktoresetpwdbtn();
		logger.info("***clicked to resetbtn");
		
		Assert.assertEquals(lp.verfityresettitle(), true);
		logger.info("***verified title***");
		
		logger.info("***passing value***");
		lp.setresetpwdmail("nivas.gawade@walr.com");
		lp.clicktosendemailbtn();
		logger.info("clicked to send email btn");
		Assert.assertEquals(lp.verifyresettexts(), true);
		logger.info("***verified texts***");
		}
		catch(Exception e)
		{
			logger.error("***test failed***");
			Assert.fail();
		}
		
		
		
		logger.info("****TC_003_Resetpwdtest finihed****");
	}
	
	
	

}
