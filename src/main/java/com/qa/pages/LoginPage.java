package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up'])")
	WebElement SignUp;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean validatecrmlogo()
	{
		return crmlogo.isDisplayed();
		
	}
	
	
	public HomePage login(String un,String pass)
	{
		
		username.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		return new HomePage();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

}
