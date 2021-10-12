package POM_SC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_InverterAC {
	
	WebDriver driver;
	
	Actions builder;
	
	//By acInverter=By.xpath("//a[@title='Inverter AC']");
	
	
	
	public Select_InverterAC(WebDriver driver) {
		this.driver=driver;
	}

	public Select_InverterAC select() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement InvAc = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		
		builder=new Actions(driver);
		builder.moveToElement(InvAc).perform();
		
		driver.findElement(By.xpath("//a[@title='Inverter AC']")).click();
		
		//driver.findElement(By.xpath("//div[@class='_3dY_ZR']//button[2]")).click();
		
		return this;
		
	}

}
