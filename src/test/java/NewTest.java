import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.githu.com/");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  @Test
  public void f() {
	  //driver.findElement(By.xpath("//*[@id=\"inquiry\"]/fieldset/div[1]/div/div/input")).sendKeys("Vaishnavi");
	  //driver.findElement(By.xpath("//*[@id=\"inquiry\"]/fieldset/div[2]/div/div/input")).sendKeys("vaishnavi.gottumukalla@gmail.com");
	  //driver.findElement(By.xpath("//*[@id=\"inquiry\"]/fieldset/div[3]/div/div/input")).sendKeys("8801058977");
	  
	  
	
  }

}
