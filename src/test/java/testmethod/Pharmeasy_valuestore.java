package testmethod;


import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_valuestore  extends Pharmeasy_base{
	Pharmeasy_page pharmeasy_valuestore;
	
	
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		pharmeasy_valuestore=new Pharmeasy_page();
	}
	
	
	@Test(priority=1)
	public void ValueStore() throws InterruptedException
	{
		pharmeasy_valuestore.Value_store();
	}
	
	
	@Test(priority=2)
	public void Brand() throws InterruptedException
	{
		pharmeasy_valuestore.Brand_Search();
	}
	
	@Test(priority=3)
	public void Brand_Everherb() throws InterruptedException
	{
		pharmeasy_valuestore.Pharmeasy();
		
	}
	
	@Test(priority=4)
	public void Price() throws InterruptedException
	{
		pharmeasy_valuestore.Price();
		
	}
	
	@Test(priority=5)
	public void Clear_all() throws InterruptedException
	{
		pharmeasy_valuestore.Clear();
	}
	
	@Test(priority=6)
	public void Popularity() throws InterruptedException
	{
		
		pharmeasy_valuestore.Poplualrity();
	}
	
	@Test(priority=7)
	public void Giloy() throws InterruptedException
	{
		pharmeasy_valuestore.Giloy();
	}
	
	@Test(priority=8)
	public void Aloe_vera() throws InterruptedException
	{
		pharmeasy_valuestore.Aloevera();
	}
	
	@Test(priority=9)
	public void Offers() throws InterruptedException
	{
		pharmeasy_valuestore.Offers();
		
	}
	
	
	@Test(priority=10)
	public void Description() throws InterruptedException
	{
		pharmeasy_valuestore.Description();
		
	}
	
	
//	@AfterMethod
//	public void getResult(ITestResult result) throws IOException
//	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			TakesScreenshot tc=(TakesScreenshot)driver;
//			//File target =tc.getScreenshotAs(OutputType.FILE);
//			//FileHandler.copy(target,new File(result.getName()+".png"));
//			//FileUtils.copyFile(tc,new File("C:\\Users\\isrivastava\\eclipse-workspace\\Pharmeasy_module\\Report\\Valuestore_testexecution.png"));
//			String path="C:\\Users\\isrivastava\\eclipse-workspace\\Pharmeasy_module\\Report\\attach.png";
//			FileUtils.copyFile(tc.getScreenshotAs(OutputType.FILE),new File(path));
//			
//			log.addScreenCapture("./Report\\Valuestore_testexecutionReport.html");
//			log.log(LogStatus.FAIL, "Test Case failed"+result.getName());
//			log.log(LogStatus.FAIL, "Test Case failed"+result.getThrowable());
//		}
//		else if(result.getStatus()==ITestResult.SKIP)
//		{
//			log.log(LogStatus.SKIP, "Test Case failed"+result.getName());
//			log.log(LogStatus.SKIP, "Test Case failed"+result.getThrowable());
//		}
//	}
//	
	@AfterSuite
	void EndTest()
	{
		
		terminate();
	
	}
	
	
}
