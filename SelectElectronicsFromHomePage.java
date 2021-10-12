package POM_SC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectElectronicsFromHomePage {
	
	WebDriver driver;
	
	

	//By electronics=By.xpath("//div[text()='Electronics']");
	
	Actions builder;
	
	public SelectElectronicsFromHomePage(WebDriver driver) {
		this.driver=driver;
	}

	public SelectElectronicsFromHomePage selectElectronic() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement ElectronicsElement = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		builder=new Actions(driver);
		builder.moveToElement(ElectronicsElement).perform();
		
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']")).click();
		return this;
		
	}

}
