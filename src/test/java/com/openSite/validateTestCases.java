package com.openSite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class validateTestCases 
{
	WebDriver driver;
  @Test(priority=0)
  public void validateLumaSiite() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
      driver.manage().window().maximize();
      String title = driver.getTitle();
      Assert.assertEquals(title, "HomePage");
      System.out.println("Title:" +title); 
  }
  
  @Test(priority=-2,invocationCount=4,dependsOnMethods = {"validateLumaSiite"})
  public void validateWhatsNewLink() 
  {
	  driver.findElement(By.xpath("//a[@id='ui-id-3']//span[1]")).click();
      String title1 = driver.getTitle();
      Assert.assertEquals(title1, "What's New");
      System.out.println("Title:" +title1); 
  }
  
  @Test(priority=4,dependsOnMethods = {"validateLumaSiite","validateWhatsNewLink"},enabled=false)
  public void validatePantsLink() 
  {
	  driver.findElement(By.xpath("//main[@id='maincontent']//ul[1]//li[5]//a[1]")).click();
      String title2 = driver.getTitle();
      Assert.assertEquals(title2, "Pants-Bottoms-Women");
      System.out.println("Title:" +title2);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Inside beforeMethod"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Inside afterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Inside beforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Inside afterClass");
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Inside beforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Inside afterTest");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Inside beforeSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Inside afterSuite");
  }

}
