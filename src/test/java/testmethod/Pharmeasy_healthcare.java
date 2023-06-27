package testmethod;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_healthcare extends Pharmeasy_base {
	Pharmeasy_page pharmeasy_healthcare;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_healthcare=new Pharmeasy_page();
	}
	
	@Test(priority=1)
	public void Healthcare() throws InterruptedException
	{
		pharmeasy_healthcare.Healthcare_module();
	}
	
	@Test(priority=2)
	public void Top_products() throws InterruptedException
	{
		pharmeasy_healthcare.Topcare_Healthcare_module();
	}
	
	@Test(priority=3)
	public void Diabetic() throws InterruptedException
	{
		pharmeasy_healthcare.Diabetic_Healthcare_module();
	}
	
	@Test(priority=4)
	public void Ever_herb() throws InterruptedException
	{
		pharmeasy_healthcare.Everherb_Healthcare_module();
	}
	
	@Test(priority=5)
	public void Pharm_easyhealthcare() throws InterruptedException
	{
		pharmeasy_healthcare.Pharmeasy_Healthcare_module();
	}

	@Test(priority=6)
	public void Popularity_healthcare() throws InterruptedException
	{
		pharmeasy_healthcare.Popularity_Healthcare_module();
	}

	@Test(priority=7)
	public void Allcategories_healthcare() throws InterruptedException
	{
		pharmeasy_healthcare.All_categories_Healthcare_module();
	}
	
	@Test(priority=8)
	public void Mostloved_healthcare() throws InterruptedException
	{
		pharmeasy_healthcare.Mostloved_Healthcare_module();
	}
	
	@Test(priority=9)
	public void Mostlovedpopularity_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare. Mostlovedpopularity_Healthcare_module();
	}
	
	@Test(priority=10)
	public void All_categoriesback_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.All_categoriesback_Healthcare_module();
	}
	
	@Test(priority=11)
	public void Personalcare_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Personalcare_Healthcare_module();
	}
	
	@Test(priority=12)
	public void Appliacnes_Personalcare_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Appliacnes_Personalcare_Healthcare_module();
	}

	@Test(priority=13)
	public void Oralcare_Personalcare_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Oralcare_Personalcare_Healthcare_module();
	}
	
	@Test(priority=14)
	public void Brand_Personalcare_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Brand_Personalcare_Healthcare_module();
	}
	
	@Test(priority=15)
	public void Popularitypc_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Popularitypc_Healthcare_module();
	}
	
	@Test(priority=16)
	public void All_categoriesReback_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.All_categoriesReback_Healthcare_module();
	}
	
	@Test(priority=17)
	public void Fitness_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Fitness_Healthcare_module();
	}
	
	@Test(priority=18)
	public void Viewmore_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Viewmore_Healthcare_module();
	}
	
	@Test(priority=19)
	public void Specialitysupplements_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Specialitysupplements_Healthcare_module();
	}
	
	@Test(priority=20)
	public void Apply_Healthcare_module() throws InterruptedException
	{
		pharmeasy_healthcare.Apply_Healthcare_module();
	}
	
	
	@Test(priority=21)
	public void Brand_fitness() throws InterruptedException
	{
		pharmeasy_healthcare.Brand_fitness();
		
	}
	
	@Test(priority=22)
	public void BrandBon_fitness() throws InterruptedException
	{
		pharmeasy_healthcare.BrandBon_fitness();
		
	}
	
	@Test(priority=23)
	public void Apply_fitness() throws InterruptedException
	{
		pharmeasy_healthcare.Apply_fitness();
		
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
