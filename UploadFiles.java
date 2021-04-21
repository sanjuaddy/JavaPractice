package uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFiles {
	WebDriver driver;
  @Test
  public void uploadFile() {
	  
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/upload/");
	  WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
	  uploadElement.sendKeys("C:\\cclean.log");
	  driver.findElement(By.id("terms")).click();
	  driver.findElement(By.name("send")).click();
  }
}
