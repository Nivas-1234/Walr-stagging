package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.loginpage;
import Pageobjects.shomepage;
import testbase.baseclass;

public class TC_005_Createprojecttes extends baseclass{
	
	@Test(groups= {"master","regression"})
	
	public void Createprojecttest()
	{
		logger.info("****TC_005_Createprojecttes startting***");
		
		try
		{
		loginpage lp=new loginpage(driver);
		logger.info("****passed data****");
		lp.setusername("nivas.gawade@walr.com");
		lp.setpassword("12345678");
		lp.clicktologinbutton();
		logger.info("****clicked to login button***");
		shomepage myhome=new shomepage(driver);
				
		myhome.createnewproject();
		logger.info("***clicked to createproject btn***");
		myhome.setprojectname(randomstring());
		logger.info("****passing projectname****");
		myhome.clicktonextbtn();
		logger.info("***clicked to next button*****");
		myhome.clicktonextbtn();
		logger.info("***clicked to next button*****");
		myhome.clicktoncreateproject();
		logger.info("***clicked tocreate project button*****");
		
		Assert.assertEquals(myhome.verifypname(), true);
		
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.error("failed testcase");
		}
		
		logger.info("****TC_005_Createprojecttes finished***");
	}
	
	
	
	

}
