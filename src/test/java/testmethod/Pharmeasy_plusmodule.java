package testmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_plusmodule extends Pharmeasy_base{
	
	Pharmeasy_page pharmeasy_offermodule;
	static ExtentTest log ;
	static ExtentReports report ;
	
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		pharmeasy_offermodule=new Pharmeasy_page();
	}
	
	
		

	@Test(priority=1)
	public void Plus() throws InterruptedException
	{
		pharmeasy_offermodule.plus();
	}
	
	@Test(priority=2)
	public void Logo()
	{
		pharmeasy_offermodule.Logo();
	}
	
	@Test(priority=3)
	public void Exclusive() throws InterruptedException
	{
		pharmeasy_offermodule.Exlusive();
	}
	
	@Test(priority=4)
	public void Coupon() throws InterruptedException
	{
		pharmeasy_offermodule.Apply_coupon();
	}	
	@Test(priority=5)
	public void Login() throws InterruptedException
	{
		
		pharmeasy_offermodule.Login();
	
	}
	
	@Test(priority=6)
	public void Plan() throws InterruptedException
	{
		
		pharmeasy_offermodule.Plan();
		
	}
	
	
	@Test(priority=7)
	public void Plan_membership() throws InterruptedException
	{
		
		pharmeasy_offermodule.PharmEasy_plus();
		
	}
	
	
	@Test(priority=8)
	public void  Add_cart() throws InterruptedException
	{
		
		pharmeasy_offermodule.Apply_click();
	
	}
	
	@Test(priority=9)
	public void  Plus_reback() throws InterruptedException
	{
		
		pharmeasy_offermodule.Plus_S();
		
	}
	
	
	@Test(priority=10)
	public void  Spending() throws InterruptedException
	{
		
		pharmeasy_offermodule.Spending();
		
	}
	
	
	@Test(priority=11)
	public void  Sure() throws InterruptedException
	{
		
		pharmeasy_offermodule.Still_sure();
	
	}
	
	
	@Test(priority=12)
	public void  User() throws InterruptedException
	{
		
		pharmeasy_offermodule.User();
		
	}
	
	
	@Test(priority=13)
	public void  Wallet() throws InterruptedException
	{
		
		pharmeasy_offermodule.Wallet();
	
	}
	
	
	@Test(priority=14)
	public void  Work() throws InterruptedException
	{
		
		pharmeasy_offermodule.Works();
		
	}
	
//	@AfterMethod
//	public void getResult(ITestResult result) throws IOException
//	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			TakesScreenshot tc=(TakesScreenshot)driver;
//			File target =tc.getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(target,new File(result.getName()+".png"));
//			
//			log.log(LogStatus.FAIL, "Test Case failed"+result.getName());
//			log.log(LogStatus.FAIL, "Test Case failed"+result.getThrowable());
//		}
//		else if(result.getStatus()==ITestResult.SKIP)
//		{
//			log.log(LogStatus.SKIP, "Test Case failed"+result.getName());
//			log.log(LogStatus.SKIP, "Test Case failed"+result.getThrowable());
//		}
//	}
	
	@AfterSuite
	void EndTest()
	{
//		report.endTest(log);	
//		report.flush();
		terminate();
	
	}
}
