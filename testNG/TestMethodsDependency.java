package testNG;

import org.testng.annotations.Test;

public class TestMethodsDependency {
  
	 @Test(dependsOnMethods={"frames"})
	  public void alerts() {
		  System.out.println("Alerts");
	  }
	  
	  @Test()
	  public void frames() {
		  System.out.println("Frames");
	  }
	  
	  @Test(dependsOnMethods={"dropDown", "browserWindow"})
	  public void takeScreenshot() {
		  System.out.println("TakeScreen");
	  }
	  
	  @Test(dependsOnMethods={"browserWindow"})
	  public void dropDown() {
		  System.out.println("DropDown");
	  }
	  
	  @Test()
	  public void browserWindow() {
		  System.out.println("BrowserWindow");
	  }
}
