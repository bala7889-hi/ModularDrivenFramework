package ModularDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class nopcommerceLogin {
         WebDriver driver;
         
         @BeforeTest()
         public WebDriver launch() {
        	 driver = new ChromeDriver();
        	 driver.get("https://admin-demo.nopcommerce.com/admin/");
        	 driver.manage().window().maximize();
        	 return driver;
         }
         
         @Test()
         public void Login() {
        	 driver.findElement(By.id("Email")).clear();
             driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
             
             driver.findElement(By.id("Password")).clear();
             driver.findElement(By.id("Password")).sendKeys("admin");
         }
         
         @Test(dependsOnMethods="Login")
         public void click() {
        	 driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
         }
         
         @Test(dependsOnMethods={"Login","click"})
         public void logout() throws InterruptedException {
        	 Thread.sleep(4000);
        	 driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
         }
         
         @AfterTest
         public void close() {
        	 driver.close();
         }
}
