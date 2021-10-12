package POM_SC;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class FlipKartLogin {
	WebDriver driver;
	
	By titleText =By.className("_36KMOx");
	
	By username = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	
	By password=By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	
	By login=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	public void setUserName(String strUserName){

        driver.findElement(username).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

         driver.findElement(password).sendKeys(strPassword);

    }
    
    public FlipKartLogin clickLogin(){

        driver.findElement(login).click();
        
       return this;

}
	
	public FlipKartLogin(WebDriver driver){

        this.driver = driver;

    }
	public String getLoginTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(titleText).getText();

	}
	public void loginToFlipKart(String strUserName, String strPasword) {
		// TODO Auto-generated method stub
		 //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();  
	}

}
