package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
  @Test
  public void webTableHandling() {
	  
	  System.out.println("chrome browser");
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/batting");
	  driver.findElement(By.xpath("//a[text()='ODI']")).click();
	  List<WebElement> playerRows = driver.findElements(By.xpath("//div[contains(@ng-show,'odis')]/div")); //0
	  int rows = playerRows.size();
	  System.out.println(rows);
	  for(int i=0; i<rows; i++){
		  int k = i + 2;
		  List<WebElement> playerCols = playerRows.get(k).findElements(By.xpath("//div[contains(@ng-show,'odis')]/div["+k+"]/div"));
		  int cols = playerCols.size();
		  System.out.println(cols);
		  for(int j=0; j<cols;j++){
			  int l = j + 1;
			  String value = playerCols.get(j).findElement(By.xpath("//div[contains(@ng-show,'odis')]/div["+k+"]/div["+l+"]")).getText();
			  System.out.println(value);
			  /*if(value.trim().contains("Virat")){
				  String position = playerCols.get(j).findElement(By.xpath("//div[contains(@ng-show,'odis')]/div["+k+"]/div[1]")).getText();
				  String rating = playerCols.get(j).findElement(By.xpath("//div[contains(@ng-show,'odis')]/div["+k+"]/div[3]")).getText();
				  System.out.println(position +"------"+ rating);
				  break;
			  }*/
			  l = 0;
		  }
		  k = 0;
	  }
  }
}
