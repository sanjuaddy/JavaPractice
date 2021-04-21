package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultipleMouseEvent {
	WebDriver driver;
  @Test
  public void multipleEvent() {
	  
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  WebElement gsrch = driver.findElement(By.name("q"));
	  Actions a = new Actions(driver);
	  Action act = a.moveToElement(gsrch).click(gsrch).sendKeys(gsrch, "Pune").doubleClick().contextClick().build();
	  act.perform();
	  
  }
}
