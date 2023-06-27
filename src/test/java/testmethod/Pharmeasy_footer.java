package testmethod;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_footer extends Pharmeasy_base {
	
	Pharmeasy_page pharmeasy_footer;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		pharmeasy_footer=new Pharmeasy_page();
	}
	
	@Test(priority=1)
	public void Company()
	{
		pharmeasy_footer.Company();
	}
	
	@Test(priority=2)
	public void About_us() throws InterruptedException
	{
		pharmeasy_footer.About_us();
	}
	

	@Test(priority=3)
	public void Order_medicine()throws InterruptedException
	{
		pharmeasy_footer.Order_medicine();
	}
	
	@Test(priority=4)
	public void Book_diagnostic()throws InterruptedException
	{
		pharmeasy_footer.Book_diagnostic();
	}
	
	@Test(priority=5)
	public void Authoriative()throws InterruptedException
	{
		pharmeasy_footer.Authoritative();
	}
	
	
	@Test(priority=7)
	public void Core_value()throws InterruptedException
	{
		pharmeasy_footer.Core_value();
	}
	
	@Test(priority=8)
	public void Data_Core_value()throws InterruptedException
	{
		pharmeasy_footer.Data_corevalue();
	}
	
	
	@Test(priority=8)
	public void Blogs() throws InterruptedException
	{
		pharmeasy_footer.Blog();
		
	}
	@Test(priority=9)
	public void  Carrer()throws InterruptedException
	{
		pharmeasy_footer.Carrer();
		
	}
	
	
	
	@AfterMethod
	public void Screenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./Scrrenshot/footer.png"));
			
			System.out.println("Screen shot taken successfully");			
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}

}
