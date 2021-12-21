package com.atipune.pom.testpages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atipune.pom.pages.HomePage;

public class HomePageTests extends TestBase {
	
	HomePage homepage;
	public HomePageTests(){
		super();
	}
	
	@BeforeClass
	public void Setup()
	{
		initDriver();
		homepage=new HomePage(driver);
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
	  String expectedTitle="Automation Practice Site";
	  String actualTitle=homepage.getHomePageTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
 	}
	
	@Test(priority=2)
	public void verifyNewArrivalsDisplayed() {
		boolean arrivalsActual=homepage.arrivalsisDisplayed();
		Assert.assertTrue(arrivalsActual);
 	}
	
	@Test(priority=3)
	public void verifyFirstBookTitle() {
		String expectedTitleBook="Selenium Ruby";
		String actualTitleBook=homepage.getFirstBookTitle();
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}
	
	@Test(priority=4)
	public void verifySecondBookTitle() {
		String expectedTitleBook="Thinking in HTML";
		String actualTitleBook=homepage.getSecondBookTitle();
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}
	
	@Test(priority=5)
	public void verifyThrirdBookTitle() {
		String expectedTitleBook="Mastering JavaScript";
		String actualTitleBook=homepage.getThirdBookTitle();
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
