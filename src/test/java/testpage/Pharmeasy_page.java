package testpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testbase.Pharmeasy_base;

public class Pharmeasy_page extends Pharmeasy_base {
	
	
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus;
	
	@FindBy(xpath="//img[@class='_2xpm0']")
	WebElement Logoplus;
	
	@FindBy(xpath="//div[@class='_3n74z']")
	WebElement Exclusive ;
	
	@FindBy(xpath="//span[text()='Apply Coupon']")
	WebElement Applycoupon ;
	
	@FindBy(xpath="//input[@id='mobileNoInput']")
	WebElement Mobileno ;
	
	@FindBy(xpath="//button[@id='mobileNoSubmitBtn']")
	WebElement Sendotp ;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit ;
	
	@FindBy(xpath="//div[@class='_3muwI']")
	WebElement Plan ;
	
	@FindBy(xpath="//div[@class='MAmI3 _2_jEW']")
	WebElement Plusmembership;
	
	@FindBy(xpath="//div[text()='Apply']")
	WebElement Apply;
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
	WebElement Addcart;
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus_s;
	
	@FindBy(xpath="//div[@class='_2aIr3']")
	WebElement Not_sure;
	
	@FindBy(xpath="//span[text()='What are the benefits of PharmEasy Plus?']")
	WebElement q1;
	
	@FindBy(xpath="//span[text()='What is the validity of the cashback?']")
	WebElement q4;
	
	@FindBy(xpath="//span[text()='Are there any products where plus benefits are not eligible?']")
	WebElement q6;
	
	@FindBy(xpath="//span[text()='Jsidjsa']")
	WebElement user;
	
	@FindBy(xpath="//a[text()='Save for Later']")
	WebElement save;
	
	@FindBy(xpath="//a[text()='Wallet']")
	WebElement wallet;
	
	@FindBy(xpath="//div[@class='TopSection_container__3Lzw2']")
	WebElement  Balance;
	
	@FindBy(xpath="//div[@class='WalletTransactionsHistory_containerInner__DA0aK']")
	WebElement  Cashback;
	
	@FindBy(xpath="//div[text()='How it works']")
	WebElement  Work;
	
	@FindBy(xpath="//div[text()='Frequently Asked Questions']")
	WebElement q;
	
	@FindBy(xpath="//a[@id='6']")
	WebElement value_store;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[2]")
	WebElement Everherb;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[4]")
	WebElement Pharmeasy;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[6]")
	WebElement Price1;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[8]")
	WebElement Price2;
	
	@FindBy(xpath="(//span[text()='Clear All'])[1]")
	WebElement Clear_all;
	
	@FindBy(xpath="//div[text()='Popularity']")
	WebElement Popularity;
	
	@FindBy(xpath="//div[text()='Everherb Giloy Tulsi Juice - Strengthens...']")
	WebElement Giloy;
	
	@FindBy(xpath="//span[text()='Aloe Vera']")
	WebElement Aloevera;
	
	@FindBy(xpath="(//div[text()='Get up to Rs.250 cashback Via CRED Pay UPI'])[1]")
	WebElement Offers;
	
	@FindBy(xpath="//div[@class='OfferDetailsDrawer_overflowContainer__ER8Ej']")
	WebElement Offers_data;
	
	@FindBy(xpath="//li[text()='Discount']")
	WebElement Discount;
	
	@FindBy(xpath="(//div[@class='ProductDescription_descriptionsWrapper__p_lEp'])[1]")
	WebElement Description;
	
	@FindBy(xpath="(//span[text()='Company'])[2]")
	WebElement Company;
	
	@FindBy(xpath="(//div[@id='pageLink-Company-0-0'])[2]")
	WebElement Aboutus;
	
	@FindBy(xpath="//button[text()='Order medicines & healthcare products online']")
	WebElement Ordermedicine;
	
	@FindBy(xpath="//button[text()='Book diagnostic tests online']")
	WebElement Bookdiagnostic;
	
	@FindBy(xpath="//button[text()='Authoritative & Trustworthy Content']")
	WebElement Authoritative;
	
	@FindBy(xpath="//div[text()='Core Values']")
	WebElement Corevalue;
	
	@FindBy(xpath="(//p[@class='AboutUs_descriptions__u5BXE'])[1]")
	WebElement Datacorevalue;
	
	@FindBy(xpath="//a[text()='Careers']")
	WebElement Careers;
	
	@FindBy(xpath="//div[@class='why-join-pharmeasy container-inner-margin']")
	WebElement Join;
	
	@FindBy(xpath="(//span[@class='employee-intro'])[1]")
	WebElement Saumil;
	
	@FindBy(xpath="(//span[text()='Start Applying'])[2]")
	WebElement Start_applying;
	
	@FindBy(xpath="//a[text()='Blog']")
	WebElement Blog;
	
	@FindBy(xpath="//a[text()='Shop At PharmEasy']")
	WebElement Shop;
	
	@FindBy(xpath="//span[text()='Hello, Log in']")
	WebElement sign_in;
	
	@FindBy(xpath="//input[@placeholder='Enter your phone number']")
	WebElement mobile;
	
	@FindBy(xpath="//span[text()='Send OTP']")
	WebElement otp;
	
	@FindBy(xpath="//span[text()='Continue']")
	WebElement  Continue;
	
	@FindBy(xpath="(//a[@class='c-iWbDBM c-iWbDBM-idhzjXW-css'])[1]")
	WebElement User;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//div[@id='discoverOfferings-3']")
	WebElement Health_care;
	
	@FindBy(xpath="//h2[text()='Top Products']")
	WebElement Top_products;
	
	@FindBy(xpath="//div[text()='Diabetic Care']")
	WebElement Diabetic_care;
	
	@FindBy(xpath="//div[text()='Pharmeasy']")
	WebElement Pharm_easy;
	
	@FindBy(xpath="//div[text()='Everherb']")
	WebElement Ever_herb;
	
	@FindBy(xpath="//div[@class='MuiFormControl-root Select_formControlContainer__QWbdr']")
	WebElement Popularity_e;
	
	@FindBy(xpath="//a[text()='All Categories']")
	WebElement All_categories;
	
	@FindBy(xpath="//img[@alt='Most Loved Brands']")
	WebElement Loved_brands;
	
	@FindBy(xpath="//div[text()='Popularity']")
	WebElement Loved_brandspopulairty;
	
	@FindBy(xpath="//img[@alt='Personal Care']")
	WebElement Personal_care;
	
	@FindBy(xpath="//div[@class='Sorter_sorterSelect__zfb9T']")
	WebElement Popularity_pc;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[3]")
	WebElement Applicanes;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[5]")
	WebElement Oral_care;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[8]")
	WebElement Brand_pc;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[10]")
	WebElement Brand_anchor;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[14]")
	WebElement Price_pc;
	
	@FindBy(xpath="//h2[text()='Fitness Supplements']")
	WebElement Fitness;
	
	@FindBy(xpath="(//div[text()='View More'])[1]")
	WebElement view_more;
	
	@FindBy(xpath="(//div[text()='Protein Supplements'])[2]")
	WebElement specialitysupplemnets;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement Apply_s;
	
	@FindBy(xpath="(//div[text()='View More'])[2]")
	WebElement Viewmore_brand;
	
	@FindBy(xpath="(//div[text()='Bon Iso Whey'])")
	WebElement Bon;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement Applybrand;
	
	@FindBy(xpath="//span[text()='Medicine']")
	WebElement Medicine;
	
	@FindBy(xpath="//a[text()='Healthcare']")
	WebElement Healthcare;
	
	@FindBy(xpath="//span[text()='Lab Tests']")
	WebElement LabTests;
	
	@FindBy(xpath="//a[@class='Navbar_offers__4jaMq']/span[text()='Offers']")
	WebElement Offers_h;
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus_h;
	
	@FindBy(xpath="//span[text()='Health Blogs']")
	WebElement Health_blogs;
	
	@FindBy(xpath="//input[@id='topBarInput']")
	WebElement searchbar;
	
	@FindBy(xpath="//input[@placeholder='Search medicines/Healthcare products ']")
	WebElement search_medicine;
	
	@FindBy(xpath="//h1[text()='Benadryl Cough Formula Bottle Of 150ml Syrup']")
	WebElement bendaryl150ml;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement add_cart;
	
	@FindBy(xpath="//li[@data-value='1']")
	WebElement quantity_1;
	
	@FindBy(xpath="//div[text()='Cofsils Orange Lozenges Strip Of 10']")
	WebElement Cofsils;
	
	@FindBy(xpath="//span[text()='Ginger Lemon']")
	WebElement Ginger_lemon;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement add_cart1;
	
	@FindBy(xpath="//li[@data-value='3']")
	WebElement Cofsils_3;
	
	@FindBy(xpath="//div[@id='MainBanner-1']")
	WebElement Banner1;
	
	@FindBy(xpath="//div[@id=\"MainBanner-2\"]")
	WebElement Banner2;
	
	@FindBy(xpath="//img[@alt='Health Checkups']")
	WebElement Full_bodycheckup;
	
	@FindBy(xpath="//img[@alt='Vitamins_PharmaHP']")
	WebElement Vitamins;
	
	@FindBy(xpath="//img[@alt='Diabetes Tests_PharmaHP']")
	WebElement Diabetes;
	
	@FindBy(xpath="//img[@alt='Thyroid_PharmaHP']")
	WebElement Thyroid;
	
	@FindBy(xpath="//img[@alt='Women Care_PharmaHP']")
	WebElement Women_care;
	
	@FindBy(xpath="//img[@alt='Covid Care Tests_PharmaHP']")
	WebElement covid ;
	
	@FindBy(xpath="//img[@alt='Fever Infection_PharmaHP']")
	WebElement Fever;
	
	@FindBy(xpath="(//span[text()='Skin Care'])[3]")
	WebElement Skincare;
	
	@FindBy(xpath="(//img[@class='_3kMAw pe-lazy'])[1]")
	WebElement Nivea;
	
	@FindBy(xpath="//div[text()='Nivea Oil Control Charcoal Face Wash - 50 G']")
	WebElement Niveaoil;
	
	@FindBy(xpath="//div[@class='LoginDrawerV2_svgBlock__tjec2']")
	WebElement logincross;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home;
	
	@FindBy(xpath="(//span[text()='Featured Categories'])[2]")
	WebElement Featured_categories;
	
	@FindBy(xpath="(//div[text()='Top Products'])[2]")
	WebElement Topproducts;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Homet;
	
	@FindBy(xpath="(//div[text()='Mega Clearance Sale'])[2]")
	WebElement Megasale;
	
	@FindBy(xpath="(//div[text()='Health Food and Drinks'])[2]")
	WebElement Healthfood;
	
	@FindBy(xpath="(//div[text()='Home Care'])[2]")
	WebElement Homecare;
	
	@FindBy(xpath="(//div[text()='Mother and Baby Care'])[2]")
	WebElement Mothercare;
	
	@FindBy(xpath="(//div[text()='Diabetic Care'])[2]")
	WebElement Diabeticcare;
	
	@FindBy(xpath="(//div[text()='Accessories & Wearables'])[2]")
	WebElement Accessories;
	
	@FindBy(xpath="(//div[text()='Ayurvedic Care'])[2]")
	WebElement Ayurvediccare;
	
	
	@FindBy(xpath="(//div[text()='Elderly Care'])[2]")
	WebElement Elderlycare;
	

	@FindBy(xpath="(//span[text()='Need Help'])[2]")
	WebElement Needhelp;
	
	@FindBy(xpath="(//div[text()='Browse All Medicines'])[2]")
	WebElement Browseall_medicine;
	
	@FindBy(xpath="//p[text()='B']")
	WebElement Browseall_medicineB;
	
	@FindBy(xpath="//p[text()='C']")
	WebElement Browseall_medicineC;
	
	@FindBy(xpath="//p[text()='K']")
	WebElement Browseall_medicineK;
	
	@FindBy(xpath="//p[text()='R']")
	WebElement Browseall_medicineR;
	
	@FindBy(xpath="//p[text()='X']")
	WebElement Browseall_medicineX;
	
	@FindBy(xpath="//p[text()='#']")
	WebElement Browseall_medicinelast;
	
	@FindBy(xpath="//div[@class='BrowseList_medicineBrowseListContainer__C3x0y']")
	WebElement Browseall_medicinedata;
	
	@FindBy(xpath="//a[text()='Browse All Molecules']")
	WebElement Browseall_molecules;
	
	@FindBy(xpath="//p[text()='E']")
	WebElement Browseall_moleculesE;
	
	@FindBy(xpath="//p[text()='H']")
	WebElement Browseall_moleculesH;
	
	@FindBy(xpath="//p[text()='M']")
	WebElement Browseall_moleculesM;
	
	@FindBy(xpath="//p[text()='S']")
	WebElement Browseall_moleculesS;
	
	@FindBy(xpath="//div[@class='BrowseList_medicineBrowseListContainer__C3x0y']")
	WebElement Browseall_moleculesdata;
	
	@FindBy(xpath="//a[text()='Browse All Cities']")
	WebElement Browseall_cities;
	
	@FindBy(xpath="//div[text()='Mumbai']")
	WebElement Mumbai;
	
	@FindBy(xpath="//a[text()='All Cities']")
	WebElement Allcities;
	
	@FindBy(xpath="//div[text()='Delhi']")
	WebElement Delhi;
	
	@FindBy(xpath="//div[text()='Chennai']")
	WebElement Chennai;
	
	@FindBy(xpath="//div[text()='Nagpur']")
	WebElement Nagpur;
	
	@FindBy(xpath="//a[text()='Browse All Stores']")
	WebElement Browseall_stories;
	
	@FindBy(xpath="//div[@class='mWS4n']")
	WebElement Store_near;
	
	@FindBy(xpath="//div[text()='Filter by City']")
	WebElement Filter_city;
	
	@FindBy(xpath="(//a[@class='vvdHI'])[1]")
	WebElement View_map;
	
	@FindBy(xpath="//div[text()='Directions']")
	WebElement Directions;
	
	@FindBy(xpath="//input[@placeholder='Choose starting point, or click on the map...']")
	WebElement Startingpoint;
	
	@FindBy(xpath="(//img[@class='OzmNAc'])[2]")
	WebElement Car;
	
	@FindBy(xpath="//span[@id='section-directions-trip-details-msg-0']")
	WebElement Details;
	
	@FindBy(xpath="//div[@class='cy2nRe IKMCKe']")
	WebElement Details_d;
	
	@FindBy(xpath="(//div[@class='aJVa5c'])[1]")
	WebElement Location;
	
	@FindBy(xpath="(//span[text()='Policy Info'])[2]")
	WebElement Policy_info;
	
	@FindBy(xpath="(//div[text()='Editorial Policy'])[2]")
	WebElement Editorial_policy;
	
	@FindBy(xpath="//div[@class='_31vJX']")
	WebElement Editorial_policydata;
	
	@FindBy(xpath="//div[@class='_2e35x']")
	WebElement Editorial_policyframework;
	
	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement Privacy_policy;
	
	@FindBy(xpath="//div[@class='_3tf_9']")
	WebElement Privacy_policyterms;
	
	@FindBy(xpath="//a[text()='Vulnerability Disclosure Policy']")
	WebElement Disclosurepolicy;
	
	@FindBy(xpath="(//div[text()='Vulnerability Disclosure Policy'])[1]")
	WebElement Vulnerability_Disclosurepolicy;
	
	@FindBy(xpath="(//div[@id='rulesOfEngagement'])")
	WebElement Ruleofengagement;
	
	@FindBy(xpath="(//a[@class='_3fqrE'])[1]")
	WebElement Pharmeasy_move;
	
	
	
	
	

	public Pharmeasy_page()
	{
		PageFactory.initElements(driver, this);
	}

	public void plus() throws InterruptedException
	{
		Plus.click();
		String url=driver.getCurrentUrl();
		Thread.sleep(1000);
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=homecard");
		System.out.println(url);
	}
	
	public void Logo()
	{
		boolean status= Logoplus.isDisplayed();
		System.out.println("The logo is visible= "+status);
		Assert.assertEquals(status,true);
	}
	
	public void Exlusive() throws InterruptedException
	{
		String data= Exclusive.getText();
		System.out.println("The data of get eclusive access= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=homecard");
	}
	
	public void Apply_coupon() throws InterruptedException
	{
		Applycoupon.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Login() throws InterruptedException
	{
		Mobileno.sendKeys("8533904286");
		Thread.sleep(1000);
		Sendotp.click();
		Thread.sleep(20000);
		Submit.click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Plan() throws InterruptedException
	{
		String plan_view=Plan.getText();
		System.out.println("The plan will be = "+plan_view);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void PharmEasy_plus() throws InterruptedException
	{
		String plan_text=Plusmembership.getText();
		System.out.println("The plan will be = "+plan_text);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Apply_click() throws InterruptedException
	{
		Apply.click();
		Thread.sleep(1000);
		Addcart.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/cart");
	}
	
	public void Plus_S() throws InterruptedException
	{
		Plus_s.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=header");
	}
	
	public void Spending()
	{
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//div[@class='_19mNE']"));
		ac.dragAndDropBy(w1,2000,3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=header");
	}
	
	public void Still_sure() throws InterruptedException	
	{
		String plan_text=Not_sure.getText();
		System.out.println("The plan will be = "+plan_text);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Frequent() throws InterruptedException
	{
		q1.click();
		Thread.sleep(1000);
		q4.click();
		Thread.sleep(1000);
		q6.click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void User() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		save.click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	public void Wallet() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		wallet.click();
		Thread.sleep(1000);
		String viewbalance=Balance.getText();
		System.out.println("The viewed balance= "+viewbalance);
		Thread.sleep(1000);
		String balance=Cashback.getText();
		System.out.println("The viewed balance= "+balance);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Wallets - pharmeasy.in");
	}
	
	public void Works() throws InterruptedException
	{
		Work.click();
		Thread.sleep(1000);
		q.click();
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Wallets - pharmeasy.in");
	}
	
	public void Value_store() throws InterruptedException
	{
		value_store.click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy Value Store Online & Get Upto 60% OFF at PharmEasy");
	}
	
	
	public void Brand_Search() throws InterruptedException
	{
		search.sendKeys("Everherb");
		Thread.sleep(1000);
		Everherb.click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy Value Store Online & Get Upto 60% OFF at PharmEasy");
	}
	
	public void Pharmeasy() throws InterruptedException
	{
		Pharmeasy.click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy Value Store Online & Get Upto 60% OFF at PharmEasy");
	}
	
	public void Price() throws InterruptedException
	{
		Price1.click();
		Thread.sleep(1000);
		Price2.click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy Value Store Online & Get Upto 60% OFF at PharmEasy");
		
	}
	
	public void Clear() throws InterruptedException
	{
		Clear_all.click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy Value Store Online & Get Upto 60% OFF at PharmEasy");
	}
	
	public void Poplualrity() throws InterruptedException
	{
		Popularity.click();
		Thread.sleep(1000);
		Discount.click();
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Discount']"));
		ac.moveToElement(w1);
		w1.click();
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy Value Store Online & Get Upto 60% OFF at PharmEasy");
		
	}
	
	public void Giloy() throws InterruptedException
	{
		Giloy.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/health-care/products/everherb-giloy-tulsi-juice---strengthens-body-defence-system---natural-immunity-booster---1-litre-501053");
	}
	
	public void Aloevera() throws InterruptedException
	{
		Aloevera.click();
		Thread.sleep(1000);
		//String url=driver.getCurrentUrl();
		//Assert.assertEquals(url,"https://pharmeasy.in/health-care/products/everherb-giloy-tulsi-juice---strengthens-body-defence-system---natural-immunity-booster---1-litre-501053");
	}
	
	
	public void Offers() throws InterruptedException
	{
		Offers.click();
		Thread.sleep(1000);
		String offer_data=Offers_data.getText();
		System.out.println("The offer data= "+offer_data);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Buy EVERHERB (BY PHARMEASY) ALOE VERA JUICE WITH PULP - REJUVENATES SKIN & HAIR - 1 LITRE BOTTLE Online & Get Upto 60% OFF at PharmEasy");
		driver.navigate().refresh();
	}
	
	public void Description() throws InterruptedException
	{
		 String text= Description.getText();
		 System.out.println("The text will be ="+text);
		 Thread.sleep(1000);
		 String title=driver.getTitle();
		Assert.assertEquals(title,"Buy EVERHERB (BY PHARMEASY) ALOE VERA JUICE WITH PULP - REJUVENATES SKIN & HAIR - 1 LITRE BOTTLE Online & Get Upto 60% OFF at PharmEasy");
		 
	}
	
	public void Company()
	{
		Boolean status=Company.isDisplayed();
		System.out.println("The  heading is displayed = "+status);
		Assert.assertEquals(true, status);
	}
	
	public void About_us() throws InterruptedException
	{
		Aboutus.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/about-us");
	}
	
	public void Order_medicine() throws InterruptedException
	{
		Ordermedicine.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"About Us | PharmEasy");
	}
	public void Book_diagnostic() throws InterruptedException
	{
		Bookdiagnostic.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"About Us | PharmEasy");
	}
	
	public void Authoritative() throws InterruptedException
	{
		Authoritative.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"About Us | PharmEasy");
	}
	
	public void Core_value() throws InterruptedException
	{
		Corevalue.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/about-us");
	}
	
	public void Data_corevalue() throws InterruptedException
	{
		String data=Datacorevalue.getText();
		System.out.println("The core values are="+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/about-us");
	}
	
	public void Carrer() throws InterruptedException
	{
		Careers.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/about-us");
		driver.navigate().to("https://pharmeasy.in/");
	}
	
	public void Join() throws InterruptedException
	{
		String join=Join.getText();
		System.out.println("Why join us ?= "+join);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void Interview() throws InterruptedException
	{
		String join=Saumil.getText();
		System.out.println("Interview of Saumil ="+join);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void Start_applying() throws InterruptedException
	{
		Start_applying.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void Blog() throws InterruptedException
	{
		Blog.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/about-us");
	}
	
	public void Shop() throws InterruptedException
	{
		Shop.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	

	public void Sign_in()
	{
		sign_in.click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	
	public void Mobile()
	{
		mobile.sendKeys("8533904286");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	
	public void OTP() throws InterruptedException
	{
		otp.click();
		Thread.sleep(20000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	
	public void Continue() throws InterruptedException
	{
		Thread.sleep(5000);
		Continue.click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	public void User1() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	public void Logout() throws InterruptedException
	{
		Logout.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	
	public void Healthcare_module() throws InterruptedException
	{
		
		Health_care.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/health-care?src=homecard";
		assertEquals(actual,url);
	}
	
	
	
	public void Topcare_Healthcare_module() throws InterruptedException
	{
		
		Top_products.click();
		Thread.sleep(1000);
		 String url=driver.getTitle();
		String actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	
	public void Diabetic_Healthcare_module() throws InterruptedException
	{
		
		Diabetic_care.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	
	public void Everherb_Healthcare_module() throws InterruptedException
	{
		
		Ever_herb.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	
	public void Pharmeasy_Healthcare_module() throws InterruptedException
	{
		
		Pharm_easy.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Popularity_Healthcare_module() throws InterruptedException
	{
		
		Popularity_e.click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Price low to high']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(3000);
		String url=driver.getTitle();
		String actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void All_categories_Healthcare_module() throws InterruptedException
	{
		
		All_categories.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Upto 80% OFF: Buy Healthcare & Wellness Products Online | PharmEasy";
		assertEquals(actual,url);
	}
	
		
	
	
	public void Mostloved_Healthcare_module() throws InterruptedException
	{
		
		Loved_brands.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Most Loved Brands Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}

	
	
	public void Mostlovedpopularity_Healthcare_module() throws InterruptedException
	{
		
		Loved_brandspopulairty.click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Discount']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(3000);
		String url=driver.getTitle();
		String actual="Buy Most Loved Brands Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}

	
	
	public void All_categoriesback_Healthcare_module() throws InterruptedException
	{
		
		All_categories.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Upto 80% OFF: Buy Healthcare & Wellness Products Online | PharmEasy";
		assertEquals(actual,url);
	}
	
	
	
	
	
	public void Personalcare_Healthcare_module() throws InterruptedException
	{
		
		Personal_care.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Appliacnes_Personalcare_Healthcare_module() throws InterruptedException
	{
		
		Applicanes.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Oralcare_Personalcare_Healthcare_module() throws InterruptedException
	{
		
		Oral_care.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Anchor_Personalcare_Healthcare_module() throws InterruptedException
	{
		
		Brand_pc.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Brand_Personalcare_Healthcare_module() throws InterruptedException
	{
		
		Brand_pc.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Popularitypc_Healthcare_module() throws InterruptedException
	{
		
		Popularity_pc.click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Price high to low']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(3000);
		String url=driver.getTitle();
		String actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void All_categoriesReback_Healthcare_module() throws InterruptedException
	{
		
		All_categories.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Upto 80% OFF: Buy Healthcare & Wellness Products Online | PharmEasy";
		assertEquals(actual,url);
	}
	
	public void Fitness_Healthcare_module() throws InterruptedException
	{
		
		Fitness.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	public void   Viewmore_Healthcare_module() throws InterruptedException
	{
		
		view_more.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Specialitysupplements_Healthcare_module() throws InterruptedException
	{
		
		specialitysupplemnets.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	public void Apply_Healthcare_module() throws InterruptedException
	{
		
		Apply_s.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	public void Brand_fitness() throws InterruptedException
	{
		Viewmore_brand.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	public void BrandBon_fitness() throws InterruptedException
	{
		Bon.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	public void Apply_fitness() throws InterruptedException
	{
		Apply_s.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		String actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	public void Medicine() throws InterruptedException
	{
		Medicine.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		System.out.println(url);
		Assert.assertEquals(url,"💊 Online Medicine Order - Buy Medicines Online with Discount | PharmEasy");
		
	}
	
	
	public void Health_care() throws InterruptedException
	{
		Healthcare.click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/health-care?src=header");
	}
	
	
	public void LabTests() throws InterruptedException
	{
		LabTests.click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/health-care?src=header");
		driver.findElement(By.xpath("a[text()='Order Medicines']")).click();
	}
	
	public void Offers_h() throws InterruptedException
	{
		Offers_h.click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/offers?src=header");
		driver.navigate().back();
	}
	
	
	public void Plus_h() throws InterruptedException
	{
		Plus_h.click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=header");
		driver.navigate().back();
	}
	
	
	public void Health_blog() throws InterruptedException
	{
		Health_blogs.click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/blog/?src=homecard");
		driver.navigate().back();
		
	}
	
	
	public void Search_medicine() throws InterruptedException
	{
		Medicine.click();
		search_medicine.click();
		search_medicine.sendKeys("Benadryl");
		Thread.sleep(2000);
		search_medicine.sendKeys(Keys.ENTER);
		
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Assert.assertEquals(s,"https://pharmeasy.in/search/all?name=Benadryl");
	}
	
	
	public void Benadryl_search() throws InterruptedException
	{
		bendaryl150ml.click();
		String title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Assert.assertEquals(title,"Benadryl Cough Formula Bottle Of 150ml Syrup: Uses, Side Effects, Price & Dosage | PharmEasy");
	}
	
	
	public void Add_cart() throws InterruptedException
	{
		add_cart.click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Benadryl Cough Formula Bottle Of 150ml Syrup: Uses, Side Effects, Price & Dosage | PharmEasy");
		
	}
	
	
	public void Quantity() throws InterruptedException
	{
		quantity_1.click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/benadryl-cough-formula-bottle-of-150ml-syrup-37060");
	}
	
	
	public void Cofsils() throws InterruptedException
	{
		Cofsils.click();
		Thread.sleep(2000);
		String url=driver.getTitle();
		System.out.println(url);
		Assert.assertEquals(url,"Buy COFSILS ORANGE LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
	}
	
	
	public void Flavour() throws InterruptedException
	{
		 Ginger_lemon.click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"Buy COFSILS GINGER LEMON LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
	}
	
	
	public void Add_cartCofsils() throws InterruptedException
	{
		 add_cart1.click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Buy COFSILS GINGER LEMON LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
		
	}
	
	
	public void Quantity_Cofsils() throws InterruptedException
	{
		Cofsils_3.click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Buy COFSILS GINGER LEMON LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
	}
	

	public void Home_page() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ClickableElement_clickable__ItKj2 Logo_container__F7rHL']")).click();
		String title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	
	public void Main_banner1() throws InterruptedException
	{
		Banner1.click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order?src=header");
		driver.navigate().back();
	}
	
	
	public void Full_Bodycheckups() throws InterruptedException
	{
		 Full_bodycheckup.click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		//Assert.assertEquals(url,"Book Comprehensive Full Body Checkup with Vitamin D & B12, get free Sample Collection | PharmEasy");
		driver.navigate().back();
	}
	
	
	public void Vitamins() throws InterruptedException
	{
		 Vitamins.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=34&title=Vitamins");
		driver.navigate().back();
	}
	
	
	public void Diabetes() throws InterruptedException
	{
		Diabetes.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=46&title=Diabetes");
		driver.navigate().back();
	}
	
	
	public void Thyroid() throws InterruptedException
	{
		Thyroid.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection?id=48&title=Thyroid");
		driver.navigate().back();
	}
	
	
	public void Women_care() throws InterruptedException
	{
		Women_care.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=49&title=Women%20Care");
		driver.navigate().back();
	}
	
	
	public void Covid_care() throws InterruptedException
	{
		covid .click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=45&title=Covid%20Care");
		driver.navigate().back();
	}
	
	public void Fever_infection() throws InterruptedException
	{
		Fever.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection?id=62");
		driver.navigate().back();
	}
	
	public void Skincare() throws InterruptedException
	{
		Skincare.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Lowest prices ever on Personal Care, Health and Nutrition products. Upto 50% off on best selling personal brands");
	}
	
	public void Nivea() throws InterruptedException
	{
		Nivea.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Lowest prices ever on Personal Care, Health and Nutrition products. Upto 50% off on best selling personal brands");
	}
	
	public void Niveaoil() throws InterruptedException
	{
		Niveaoil.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void Logincross() throws InterruptedException
	{
		logincross.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void Home() throws InterruptedException
	{
		Home.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void Featured_categories()
	{
		boolean status=Featured_categories.isDisplayed();
		System.out.println("The heading is diplayed ="+status);
		Assert.assertEquals(status,true);
	}
	
	public void Topproducts() throws InterruptedException
	{
		Topproducts.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/health-care/top-products-9297");
	}
	
	public void Homet() throws InterruptedException
	{
		Homet.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Megasale() throws InterruptedException
	{
		Megasale.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	
	public void Healthfood() throws InterruptedException
	{
		Healthfood.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Homecare() throws InterruptedException
	{
		Homecare.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Mothercare() throws InterruptedException
	{
		Mothercare.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Diabeticcare() throws InterruptedException
	{
		Diabeticcare.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Accessories() throws InterruptedException
	{
		Accessories.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Ayurvediccare() throws InterruptedException
	{
		Ayurvediccare.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Elderlycare() throws InterruptedException
	{
		Elderlycare.click();
		Thread.sleep(2000);
		Homet.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	public void Need_help()
	{
		boolean status=Needhelp.isDisplayed();
		System.out.println("The text Need help is diaplyed= "+status);
		Assert.assertEquals(status,true);
	}
	
	public void Browseall_medicine() throws InterruptedException
	{
		Browseall_medicine.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse");
	}
	
	public void Browseall_medicineB() throws InterruptedException
	{
		Browseall_medicineB.click();
		Thread.sleep(1000);
		String data= Browseall_medicinedata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=b&page=0");
	}
	
	public void Browseall_medicineC() throws InterruptedException
	{
		Browseall_medicineC.click();
		Thread.sleep(1000);
		String data= Browseall_medicinedata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=c&page=0");
	}
	public void Browseall_medicineK() throws InterruptedException
	{
		Browseall_medicineK.click();
		Thread.sleep(1000);
		String data= Browseall_medicinedata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=k&page=0");
	}
	public void Browseall_medicineR() throws InterruptedException
	{
		Browseall_medicineR.click();
		Thread.sleep(1000);
		String data= Browseall_medicinedata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=r&page=0");
	}
	public void Browseall_medicineX() throws InterruptedException
	{
		Browseall_medicineX.click();
		Thread.sleep(1000);
		String data= Browseall_medicinedata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=x&page=0");
	}
	public void Browseall_medicineLast() throws InterruptedException
	{
		Browseall_medicinelast.click();
		Thread.sleep(1000);
		String data= Browseall_medicinedata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=%23&page=0");
	}
	
	public void Browseall_molecules() throws InterruptedException
	{
		Browseall_molecules.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("hghj="+title);
		//Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/browse?alphabet=%23&page=0");
	}
	
	public void Browseall_moleculesE() throws InterruptedException
	{
		Browseall_moleculesE.click();
		Thread.sleep(1000);
		String data= Browseall_moleculesdata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("e="+title);
		Assert.assertEquals(title,"Molecules starting with e | PharmEasy");
	}
	
	public void Browseall_moleculesH() throws InterruptedException
	{
		Browseall_moleculesH.click();
		Thread.sleep(1000);
		String data= Browseall_moleculesdata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("h="+title);
		Assert.assertEquals(title,"Molecules starting with h | PharmEasy");
	}
	
	public void Browseall_moleculesM() throws InterruptedException
	{
		Browseall_moleculesM.click();
		Thread.sleep(1000);
		String data= Browseall_moleculesdata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("m="+title);
		Assert.assertEquals(title,"Molecules starting with m | PharmEasy");
	}
	
	public void Browseall_moleculesS() throws InterruptedException
	{
		Browseall_moleculesS.click();
		Thread.sleep(1000);
		String data= Browseall_moleculesdata.getText();
		System.out.println("The data will be= "+data);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("s="+title);
		Assert.assertEquals(title,"Molecules starting with s | PharmEasy");
	}
	
	public void Browseall_cities() throws InterruptedException
	{
		Browseall_cities.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medical Store & Pharmacy Website in India - PharmEasy.in");
	}
	
	public void Mumbai() throws InterruptedException
	{
		Mumbai.click();
		Thread.sleep(1000);
		Allcities.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medical Store & Pharmacy Website in India - PharmEasy.in");
	}
	
	public void Delhi() throws InterruptedException
	{
		Delhi.click();
		Thread.sleep(1000);
		Allcities.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medical Store & Pharmacy Website in India - PharmEasy.in");
	}
	
	public void Chennai() throws InterruptedException
	{
		Chennai.click();
		Thread.sleep(1000);
		Allcities.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medical Store & Pharmacy Website in India - PharmEasy.in");
	}
	
	public void Nagpur() throws InterruptedException
	{
		Nagpur.click();
		Thread.sleep(1000);
		Allcities.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medical Store & Pharmacy Website in India - PharmEasy.in");
	}
	
	public void Browseall_stories() throws InterruptedException
	{
		Browseall_stories.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/franchise-stores");
	}
	
	public void Shop_near() throws InterruptedException
	{
		boolean display=Store_near.isDisplayed();
		System.out.println("The box near it will displayed= "+display);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='PharmEasy Stores']")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
	
	public void Filter_city() throws InterruptedException
	{
		Filter_city.click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[@data-value='7']"));
		ac.moveToElement(w1);
		w1.click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/franchise-stores");
		
	}
	
	public void View_map() throws InterruptedException
	{
		View_map.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	
	
	public void Directions() throws InterruptedException
	{
		Directions.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	
	public void Startingpoint() throws InterruptedException
	{
		Startingpoint.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	
	public void Car() throws InterruptedException
	{
		Car.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	
	public void Details() throws InterruptedException
	{
		Details.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	
	public void Details_d() throws InterruptedException
	{
		Details_d.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	public void Location() throws InterruptedException
	{
		Location.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("view more = "+url);
	}
	
	public void Policy_info()
	{
		boolean status=Policy_info.isDisplayed();
		System.out.println("The heading is dispalyed = "+status);
		Assert.assertEquals(status,true);
	}
	
	public void Editorial_policy() throws InterruptedException
	{
		Editorial_policy.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/legal/editorial-policy");
	}
	
	public void Editorial_policydata() throws InterruptedException
	{
		String data= Editorial_policydata.getText();
		Thread.sleep(1000);
		System.out.println("The editorial policy data ="+data);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/legal/editorial-policy");
	}
	
	public void Editorial_policyframework() throws InterruptedException
	{
		String data= Editorial_policyframework.getText();
		Thread.sleep(1000);
		System.out.println("The editorial policy framework content ="+data);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/legal/editorial-policy");
	}
	
	public void Privacy_policy() throws InterruptedException
	{
		Privacy_policy.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/legal/privacy-policy");
	}
	
	public void Privacy_policyterms() throws InterruptedException
	{
		String data= Privacy_policyterms.getText();
		Thread.sleep(1000);
		System.out.println("The policy terms are ="+data);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/legal/privacy-policy");
	}
	
	public void Disclosurepolicy() throws InterruptedException
	{
		Disclosurepolicy.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void Vulnerability_Disclosurepolicy() throws InterruptedException
	{
		String data= Vulnerability_Disclosurepolicy.getText();
		Thread.sleep(1000);
		System.out.println("The Vulnerability disclosure policy  are ="+data);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void Ruleofengagement() throws InterruptedException
	{
		String data= Ruleofengagement.getText();
		Thread.sleep(1000);
		System.out.println("The rule of engagements are ="+data);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void Pharmeasy_move() throws InterruptedException
	{
		Pharmeasy_move.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/");
	}
}

