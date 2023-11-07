package ModularDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductsPage {
	WebDriver driver;

	@Test

	public void productpagesearch() throws InterruptedException {
		nopcommerceLogin  nop=new nopcommerceLogin();
		driver=nop.launch();
		nop.Login();
		nop.click();


		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]/following-sibling::p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/ProductTags\"]/descendant::p")).click();
		driver.findElement(By.id("SearchTagName")).sendKeys("computer");
		driver.findElement(By.id("search-product-tags")).click();
		
		nop.logout();
		Thread.sleep(2000);
		nop.close();
	}
}
