package com.qa.tests;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	//author sonu
	
	Logger log =Logger.getLogger(LoginPageTest.class);
	LoginPage loginPage;
	HomePage homePage;
	
	
	
	public LoginPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	
	public void setup()
	{
		log.info("*******************test cases execution starts*************************");
		
		initilization();
		loginPage=new LoginPage();
	
	}
	@Test  (priority=1) 
	public void loginpagetitletest()
	{
		log.info("");
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		
	}
	
	@Test (priority=2)
	public void crmimagetest()
	{
		boolean flag=loginPage.validatecrmlogo();
		Assert.assertTrue(flag);
		
	}
	@Test (priority=3)
	public void loginTest()
	{
		
		
		
		
		
		
	}
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
