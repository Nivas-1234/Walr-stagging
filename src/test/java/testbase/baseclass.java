package testbase;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

public class baseclass {

	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle bundle;
	
	
	
	@BeforeClass(groups={"master","sanity","regression"})
	@Parameters("browser")
	public void setupapp(String br)
	{
		bundle=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		
		if(br.equals("chrome"))
		{
         driver=new ChromeDriver();
		}
		
		else if (br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(bundle.getString("appURL"));
		 driver.manage().window().maximize();
	}
	

	@AfterClass(groups= {"master","sanity","regression"})
	public void teardown()
	{
		driver.quit();
	}
	
public String randomstring()
	
	{
	String randomstring=RandomStringUtils.randomAlphabetic(5);
		
		return randomstring;
	}
	
	
	
	public String randomnumeric()
	{
	String randomstring2=RandomStringUtils.randomNumeric(5);
		return randomstring2;
	}
	
	
	
	public String randomnumericAlpha()
	{
		String alpha=	RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(5);
		return alpha+num;
	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0, 0, 0));
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			Files.copy(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}	
}
