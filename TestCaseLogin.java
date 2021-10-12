package POM_SC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestCaseLogin {
	
	ChromeDriver driver;
	
	FlipKartLogin objLogin;
	
	FlipKartHomePage objHome;
	
	SelectElectronicsFromHomePage elecObj;
	
	Select_InverterAC inverterAC;
	
	SelectSecondAC selectsec;
	
	
	

	@BeforeTest

    public void setup(){

		WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        
        driver.get("http://www.flipkart.com");

}
	
	@Test(priority=0)
	public void Login()
	{
		objLogin = new FlipKartLogin(driver);
		
		String loginPageTitle = objLogin.getLoginTitle();
		System.out.println(loginPageTitle);
		
		//Assert.assertTrue(loginPageTitle.toLowerCase().contains("Login"));
		objLogin.loginToFlipKart("9994562520", "jananee1990");
		
		
	}
	
	@Test(priority=1)
	public void HomePage()
	{
		objHome=new FlipKartHomePage(driver);
		
		objHome.getURL();
		
		
			
		
	}
	
	@Test(priority=2)
	public void ClickElectronics() throws InterruptedException
	{
		elecObj=new SelectElectronicsFromHomePage(driver);
		
		elecObj.selectElectronic();
	}
	
	@Test(priority=3, enabled=true)
	
	public void SelectInverterAC() throws InterruptedException
	{
		inverterAC=new Select_InverterAC(driver);
		
		inverterAC.select();	
		
	}
	
	@Test(priority=4)
	public void Selectsecond() throws InterruptedException// throws InterruptedException
	{
		selectsec=new SelectSecondAC(driver);
		
		selectsec.SelectAc();
		
	}
	
	@AfterTest
	public void postConditions()
	{
		driver.quit();
	}
	
	
}
