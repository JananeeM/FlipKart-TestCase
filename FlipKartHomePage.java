package POM_SC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class FlipKartHomePage {
	
	WebDriver driver;
	
	Actions builder;
	
	By titleText =By.id("container");
	

	public FlipKartHomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	


	public FlipKartHomePage getURL() {
		// TODO Auto-generated method stub
		//return driver.getCurrentUrl(); 
		System.out.println("Title  "+driver.getCurrentUrl());
		
		return this;
		
		
		
	}

}
