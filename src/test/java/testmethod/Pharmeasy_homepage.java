package testmethod;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_homepage extends Pharmeasy_base{

	Pharmeasy_page pharmeasy_homepage;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_homepage=new Pharmeasy_page();
	}
	
	@Test(priority=1)
	public void Medicine() throws InterruptedException
	{
		pharmeasy_homepage.Medicine();
	}
	
	@Test(priority=2)
	public void Health_care() throws InterruptedException
	{
		pharmeasy_homepage.Health_care();
	}
	
	@Test(priority=3,enabled=false)
	public void LabTests() throws InterruptedException
	{
		pharmeasy_homepage.LabTests();
	}
	
	@Test(priority=4)
	public void Offers_h() throws InterruptedException
	{
		pharmeasy_homepage. Offers_h();
	}
	
	@Test(priority=5)
	public void Plus_h() throws InterruptedException
	{
		pharmeasy_homepage.Plus_h();
	}
	
	@Test(priority=6)
	public void Health_blog() throws InterruptedException
	{
		pharmeasy_homepage.Health_blog();
	}
	
	@Test(priority=7)
	public void  Search_medicine() throws InterruptedException
	{
		pharmeasy_homepage. Search_medicine();
	}
	
	@Test(priority=8)
	public void Benadryl_search() throws InterruptedException
	{
		pharmeasy_homepage.Benadryl_search();
	}
	
	@Test(priority=9)
	public void Add_cart() throws InterruptedException
	{
		pharmeasy_homepage.Add_cart();
	}
	
	@Test(priority=10)
	public void Quantity() throws InterruptedException
	{
		pharmeasy_homepage.Quantity();
	}
	
	@Test(priority=11)
	public void Cofsils() throws InterruptedException
	{
		pharmeasy_homepage.Cofsils();
	}
	
	@Test(priority=12)
	public void Flavour() throws InterruptedException
	{
		pharmeasy_homepage.Flavour();
	}
	
	@Test(priority=13)
	public void Add_cartCofsils() throws InterruptedException
	{
		pharmeasy_homepage.Add_cartCofsils();
	}
	
	@Test(priority=14)
	public void Quantity_Cofsils() throws InterruptedException
	{
		pharmeasy_homepage.Quantity_Cofsils();
	}
	
	@Test(priority=15)
	public void Home_pages() throws InterruptedException
	{
		pharmeasy_homepage.Home_page();
	}
	
	@Test(priority=16)
	public void Main_banner1() throws InterruptedException
	{
		pharmeasy_homepage.Main_banner1();
	}
	
	@Test(priority=17)
	public void Full_Bodycheckups() throws InterruptedException
	{
		pharmeasy_homepage.Full_Bodycheckups();
	}
	
	@Test(priority=18)
	public void Vitamins() throws InterruptedException
	{
		pharmeasy_homepage.Vitamins();
	}
	
	@Test(priority=19)
	public void Diabetes() throws InterruptedException
	{
		pharmeasy_homepage.Diabetes();
	}
	
	@Test(priority=20)
	public void Thyroid() throws InterruptedException
	{
		pharmeasy_homepage.Thyroid();
	}
	
	@Test(priority=21)
	public void Women_care() throws InterruptedException
	{
		pharmeasy_homepage.Women_care();
	}
	
	@Test(priority=22)
	public void Covid_care() throws InterruptedException
	{
		pharmeasy_homepage.Covid_care();
	}
	
	@Test(priority=23)
	public void Fever_infection() throws InterruptedException
	{
		pharmeasy_homepage.Fever_infection();
	}
	
	
	@Test(priority=24)
	public void Skincare() throws InterruptedException
	{
		pharmeasy_homepage.Skincare();
	}
	
	@Test(priority=25)
	public void Nivea() throws InterruptedException
	{
		pharmeasy_homepage.Nivea();
	}
	
	
	
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
