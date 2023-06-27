package testmethod;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_footer1 extends Pharmeasy_base{
	
	Pharmeasy_page pharmeasy_footer;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_footer=new Pharmeasy_page();
	}
	
	@Test(priority=1)
	public void Featured_categories()
	{
		pharmeasy_footer.Featured_categories();
	}
	
	@Test(priority=2)
	public void Topproducts() throws InterruptedException
	{
		pharmeasy_footer.Topproducts();
	}
	
	@Test(priority=3)
	public void  Homet() throws InterruptedException
	{
		pharmeasy_footer. Homet();
	}
	
	@Test(priority=4)
	public void  Megasale() throws InterruptedException
	{
		pharmeasy_footer.Megasale();
	}
	
	@Test(priority=5)
	public void Healthfood() throws InterruptedException
	{
		pharmeasy_footer.Healthfood();
	}
	
	@Test(priority=6)
	public void Homecare() throws InterruptedException
	{
		pharmeasy_footer.Homecare();
	}
	
	@Test(priority=7)
	public void Mothercare() throws InterruptedException
	{
		pharmeasy_footer.Mothercare();
	}
	
	@Test(priority=8)
	public void Diabeticcare() throws InterruptedException
	{
		pharmeasy_footer.Diabeticcare();
	}
	
	@Test(priority=9)
	public void Accessories() throws InterruptedException
	{
		pharmeasy_footer.Accessories();
	}
	
	@Test(priority=10)
	public void Ayurvediccare() throws InterruptedException
	{
		pharmeasy_footer.Ayurvediccare();
	}

	@Test(priority=11)
	public void Elderlycare() throws InterruptedException
	{
		pharmeasy_footer.Elderlycare();
	}
	
	@Test(priority=12)
	public void Need_help()
	{
		pharmeasy_footer.Need_help();
	}
	
	@Test(priority=13)
	public void Browseall_medicine() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicine();
	}
	
	@Test(priority=14)
	public void Browseall_medicineB() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicineB();
	}
	
	@Test(priority=15)
	public void Browseall_medicineC() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicineC();
	}
	@Test(priority=16)
	public void Browseall_medicineK() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicineK();
	}
	@Test(priority=17)
	public void Browseall_medicineR() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicineR();
	}
	@Test(priority=18)
	public void Browseall_medicineX() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicineX();
	}
	
	@Test(priority=19)
	public void Browseall_medicineLast() throws InterruptedException
	{
		pharmeasy_footer.Browseall_medicineLast();
	}
	
	@Test(priority=20)
	public void Browseall_molecules() throws InterruptedException
	{
		pharmeasy_footer.Browseall_molecules();
	}
	
	@Test(priority=21)
	public void Browseall_moleculesE() throws InterruptedException
	{
		pharmeasy_footer.Browseall_moleculesE();
	}
	
	@Test(priority=22)
	public void Browseall_moleculesH() throws InterruptedException
	{
		pharmeasy_footer.Browseall_moleculesH();
	}
	
	@Test(priority=23)
	public void Browseall_moleculesM() throws InterruptedException
	{
		pharmeasy_footer.Browseall_moleculesM();
	}
	
	@Test(priority=24)
	public void Browseall_moleculesS() throws InterruptedException
	{
		pharmeasy_footer.Browseall_moleculesS();
	}
	
	
	@Test(priority=25)
	public void Browseall_cities() throws InterruptedException
	{
		pharmeasy_footer.Browseall_cities();
	}
	
	@Test(priority=26)
	public void Mumbai() throws InterruptedException
	{
		pharmeasy_footer.Mumbai();
	}
	
	@Test(priority=27)
	public void Delhi() throws InterruptedException
	{
		pharmeasy_footer.Delhi();
	}
	
	@Test(priority=28)
	public void Chennai() throws InterruptedException
	{
		pharmeasy_footer.Chennai();
	}
	
	@Test(priority=29)
	public void Nagpur() throws InterruptedException
	{
		pharmeasy_footer.Nagpur();
	}
	
	@Test(priority=30)
	public void Browseall_stories() throws InterruptedException
	{
		pharmeasy_footer.Browseall_stories();
	}
	
	@Test(priority=31)
	public void Store_near() throws InterruptedException
	{
		pharmeasy_footer.Shop_near();
	}
	
	@Test(priority=32,enabled=false)
	public void Filter_city() throws InterruptedException
	{
		pharmeasy_footer.Filter_city();
	}
	
	
	@Test(priority=32,enabled=false)
	public void View_map() throws InterruptedException
	{
		pharmeasy_footer.View_map();
	}
	
	@Test(priority=33)
	public void Policy_info()
	{
		pharmeasy_footer.Policy_info();
	}
	
	
	@Test(priority=34)
	public void Editorial_policy() throws InterruptedException
	{
		pharmeasy_footer.Editorial_policy();
	}
	
	@Test(priority=35)
	public void Editorial_policydata() throws InterruptedException
	{
		pharmeasy_footer.Editorial_policydata();
	}
	
	@Test(priority=36)
	public void Editorial_policyframework() throws InterruptedException
	{
		pharmeasy_footer.Editorial_policyframework();
	}
	
	@Test(priority=37)
	public void Privacy_policy() throws InterruptedException
	{
		pharmeasy_footer.Privacy_policy();
	}
	
	@Test(priority=38)
	public void Privacy_policyterms() throws InterruptedException
	{
		pharmeasy_footer.Privacy_policyterms();
	}
	
	
	@Test(priority=39)
	public void Pharmeasy_move() throws InterruptedException
	{
		pharmeasy_footer.Pharmeasy_move();
	}
	
	
//	@Test(priority=33)
//	public void Directions() throws InterruptedException
//	{
//		pharmeasy_footer.Directions();
//	}
//	
//	
	@AfterSuite
	public void close()
	{
		terminate();
	}

}
