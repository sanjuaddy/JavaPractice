package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SingleMouseEvent {
	WebDriver driver;
  @Test
  public void singleEvent() {
	  
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  WebElement ele = driver.findElement(By.linkText("Gmail"));
	  Actions a = new Actions(driver);
	  Action act = a.moveToElement(ele).build();
	  act.perform();
	  
  }
}
