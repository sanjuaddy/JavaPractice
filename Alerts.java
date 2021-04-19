package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	WebDriver driver;
  @Test
  public void alerts() throws InterruptedException {
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/V4/index.php");
	  driver.findElement(By.name("uid")).sendKeys("xyz");
	  driver.findElement(By.name("password")).sendKeys("zyx");
	  driver.findElement(By.name("btnLogin")).click();
	  String alertText = driver.switchTo().alert().getText();
	  System.out.println(alertText);
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  driver.close();//closes only current focussed open session
	  //driver.quit(); //closes all the open browser sessions present currently
  }
}
