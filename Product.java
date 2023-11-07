package ModularDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Product {
	WebDriver driver;
	
	@Test
	public void clickonProduct() throws InterruptedException {
		nopcommerceLogin  nop=new nopcommerceLogin();
		driver=nop.launch();
		nop.Login();
		nop.click();
		
		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]/following-sibling::p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class=\"nav-icon far fa-dot-circle\"]/following-sibling::p")).click();
		driver.findElement(By.id("SearchProductName")).sendKeys("Build your own computer");
		driver.findElement(By.id("search-products")).click();
		
		nop.logout();
		nop.close();
	}
	
}
