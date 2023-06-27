package testmethod;

import java.io.IOException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_signin  extends Pharmeasy_base{

	Pharmeasy_page pharmeasy_sigin;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_sigin=new Pharmeasy_page();
	}
	
	@Test(priority=1)
	public void Sign_in()
	{
		pharmeasy_sigin.Sign_in();
	}
	
	@Test(priority=2)
	public void Mobile()
	{
		pharmeasy_sigin.Mobile();
	}
	
	@Test(priority=3)
	public void OTP() throws InterruptedException
	{
		pharmeasy_sigin.OTP();
	}
	
	@Test(priority=4)
	public void Continue() throws InterruptedException
	{
		pharmeasy_sigin.Continue();
	}
	
	@Test(priority=5)
	public void User() throws InterruptedException
	{
		pharmeasy_sigin.User1();
	}
	
	@Test(priority=6)
	public void Logout() throws InterruptedException
	{
		pharmeasy_sigin.Logout();
	}
}
