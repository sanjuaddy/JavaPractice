package testNG;

import org.testng.annotations.Test;

public class PriorityRun {
	
  @Test(priority=1)
  public void alerts() {
	  System.out.println("Alerts");
  }
  
  @Test(priority=2)
  public void frames() {
	  System.out.println("Frames");
  }
  
  @Test(priority=3)
  public void takeScreenshot() {
	  System.out.println("TakeScreen");
  }
  
  @Test(priority=4)
  public void dropDown() {
	  System.out.println("DropDown");
  }
  
  @Test(priority=5)
  public void browserWindow() {
	  System.out.println("BrowserWindow");
  }
}
