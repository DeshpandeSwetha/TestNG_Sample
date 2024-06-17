package com.openSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openSite 
{
    static WebDriver driver;
	public static void main(String[] args) 
	{
	   driver = new ChromeDriver();
	   driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
       driver.manage().window().maximize();
       String title = driver.getTitle();
       System.out.println("Title:" +title);
       driver.findElement(By.xpath("//a[@id='ui-id-3']//span[1]")).click();
       String title1 = driver.getTitle();
       System.out.println("Title:" +title1);
       driver.findElement(By.xpath("//main[@id='maincontent']//ul[1]//li[5]//a[1]")).click();
       String title2 = driver.getTitle();
       System.out.println("Title:" +title2);
       driver.navigate().back();
	}

}
