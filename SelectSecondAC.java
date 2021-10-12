package POM_SC;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSecondAC {
	WebDriver driver;
	
	By second=By.xpath("(//div[@class='_4rR01T'])[2]");
	
	By pinCode=By.xpath("//input[@class='_36yFo0']");
	
	By check=By.xpath("//span[@class='_2P_LDn']");
	
	By addToCart=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
;
	By selectACSecond= By.className("_4rR01T");
	 
	By IncQuantity=By.xpath("//div[@class='_26HdzL']/following-sibling::button[1]");
	
	By Remove=By.xpath("//span[text()='Remove']");
	
	public SelectSecondAC(WebDriver driver) {
		
		this.driver=driver;
	}

	public SelectSecondAC SelectAc() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		driver.findElement(second).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> winHandle = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(winHandle.get(1));
		
		driver.findElement(pinCode).sendKeys("603210");
		
		driver.findElement(check).click();
		
		driver.findElement(addToCart).click();
		
		driver.findElement(IncQuantity).click();
		
		String discountPrice = driver.findElement(By.xpath("//div[@class='_1YVZr_']")).getText();
		
		System.out.println("THe Discount amount for the items in the cart is :" + discountPrice);
		// Printing the total Amount
		
		String amountPayable = driver.findElement(By.xpath("//div[@class='Ob17DV _3X7Jj1']//span[1]")).getText();
		
		System.out.println("TOtal Amount is : " + amountPayable);
		
		
		String orderQuantity = driver.findElement(By.xpath("//input[@class='_253qQJ']")).getAttribute("value");
		
		System.out.println("Order Quantity  :" + orderQuantity);
		// converting String value to Int
		int quantity = Integer.parseInt(orderQuantity);
		
		if (quantity > 5) {
		
			System.out.println("Cannot add more than 5 Items");
		
		}
		
		Thread.sleep(5000);
		
	//	String finalAmount = driver.findElement(By.xpath("(//div[@class='_2Tpdn3'])[2]")).getText();
		
	//	System.out.println("Final Amount Payable is : " + finalAmount);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	
		driver.findElement(Remove).click();
		
		return this;
	}

}
