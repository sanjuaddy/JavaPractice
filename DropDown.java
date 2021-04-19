package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
  @Test
  public void dropdown() throws InterruptedException {
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  Select st = new Select(driver.findElement(By.id("awf_field-91977689")));
	  st.selectByValue("saphr");
	  Thread.sleep(2000);
	  st.selectByVisibleText("SAP FICO");
	  Thread.sleep(2000);
	  st.selectByIndex(10);
	  driver.close();
  }
}
