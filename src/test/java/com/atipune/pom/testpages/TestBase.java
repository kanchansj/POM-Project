package com.atipune.pom.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\java b\POM\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
}
