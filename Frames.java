package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
  @Test
  public void frames() {
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  driver.switchTo().frame("a077aa5e");
	  System.out.println("Switching on Frame");
	  driver.findElement(By.xpath("/html/body/a")).click();
	  driver.switchTo().defaultContent();
  }
}
