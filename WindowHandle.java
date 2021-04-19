package browserWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
	@Test
	public void windowHandle() {
		System.out.println("chrome browser");
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//bg//browserDrivers//chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/guru99home/");
		  String parentWindow = driver.getWindowHandle();
		  System.out.println(parentWindow);
		  driver.switchTo().frame("a077aa5e");
		  System.out.println("Switching on Frame");
		  driver.findElement(By.xpath("/html/body/a")).click();
		  driver.switchTo().defaultContent();
		  
          Set<String> handles = driver.getWindowHandles();
          Iterator<String> itr = handles.iterator();
          while(itr.hasNext()){
        	  String childWindow = itr.next();
        	  if(!childWindow.equals(parentWindow)){
        		  driver.switchTo().window(childWindow);
        		  System.out.println("Switched to Child Window");
        		  //String titleChild = driver.getTitle();
        		  //if(titleChild.contains("Facebook")){
        		  //	  
        		  //}
        		  //System.out.println(titleChild);
        	  }
          }
          
          driver.close();
          driver.switchTo().window(parentWindow);
          System.out.println("Switched to Parent Window");
          driver.close();   
	}

}
