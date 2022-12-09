package demoselenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class demoTest {
	WebDriver driver;
	
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
  }


  @Test
  public void main() {
    //throw new RuntimeException("Test not implemented");
	  
	  //TEST CASE 1
	WebElement loginbtn = driver.findElement(By.linkText("Log in"));
	loginbtn.click();
    //driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("Email")).sendKeys("email@demo.test");
    driver.findElement(By.id("Password")).sendKeys("abcd123");
    driver.findElement(By.xpath("//*[@value='Log in']")).click();
    //driver.findElement(By.linkText("Log out")).click();
    
    //TEST CASE 2
    driver.findElement(By.linkText("Apparel & Shoes")).click();
    driver.findElement(By.linkText("Casual Golf Belt")).click();
    driver.findElement(By.id("addtocart_40_EnteredQuantity")).clear();
    driver.findElement(By.id("addtocart_40_EnteredQuantity")).sendKeys("10");
   // WebElement quantity =driver.findElement(By.xpath("//input[@class='qty-input valid']"));    //quantity.sendKeys("10");
    //driver.findElement(By.xpath("//input[@class='qty-input valid']")).sendKeys("10");
    //driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-40\"]")).click();
    
    driver.findElement(By.id("add-to-cart-button-40")).click();
    driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
    
    
    //TEST CASE 3
    driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
    driver.findElement(By.id("termsofservice")).click();
    driver.findElement(By.id("checkout")).isDisplayed();
    driver.findElement(By.id("checkout")).click();
    
    
    //TEST CASE 4
    
    //Address
    //driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")).sendKeys("India");
    //driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bangalore");
    //driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Bellandur Outer Ring Road");
    //driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560031");
    //driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(" 00 11 22 33 44 55");
    //driver.findElement(By.id("billing-new-address-form")).sendKeys("New Address");
    //WebElement newadd =driver.findElement(By.id("billing-new-address-form"));
    //Select newadd1 =new Select(newadd);
    //newadd1.selectByVisibleText("New Address");
    
    driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
    driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
    driver.findElement(By.id("shippingoption_0")).click();
    driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
    driver.findElement(By.id("paymentmethod_2")).click();
    driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
    driver.findElement(By.id("CreditCardType")).sendKeys("visa");
    driver.findElement(By.id("CardholderName")).sendKeys("Barbara Gordon");
    driver.findElement(By.id("CardNumber")).sendKeys("4485564059489345");
    driver.findElement(By.id("ExpireMonth")).sendKeys("04");
    driver.findElement(By.id("ExpireYear")).sendKeys("2020");
    driver.findElement(By.id("CardCode")).sendKeys("123");
    driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
    driver.findElement(By.xpath("//input[@value='Confirm']")).click();
    
    
    //TEST CASE 5
    if(driver.getPageSource().contains("Your order has been successfully processed!"));
    driver.findElement(By.linkText("Log out")).click();
    driver.close();
    
    
    
    
    
    
    }
}
