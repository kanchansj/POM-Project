package com.atipune.pom.testpages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atipune.pom.pages.MyAccountsPage;

public class MyAccountsPageTests extends TestBase {
 
	MyAccountsPage myaccountpage;
	public MyAccountsPageTests(){
		super();
	}
	
	@BeforeClass
	public void Setup()
	{
		initDriver();
		myaccountpage=new MyAccountsPage(driver);
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void verifyloginToMyAccount()
	{
		myaccountpage.loginToMyAccount("aspiretraininginstitute2","Atipune!242427");
		String actualtitle="My Account – Automation Practice Site";
		String expectedtitle=myaccountpage.getPageTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test(priority=2)
	public void verfiyLogoutToMyAccount()
	{
		myaccountpage.logoutFromMyAccount();
		String actualText="Login";
		String expectedText=myaccountpage.getLoginText();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
