package testNG;

import org.testng.annotations.Test;

public class TestGrouping {
  
	  @Test(groups={"smoke"})
	  public void alerts() {
		  System.out.println("Alerts");
	  }
	  
	  @Test(groups={"sanity"})
	  public void frames() {
		  System.out.println("Frames");
	  }
	  
	  @Test(dependsOnGroups={"smoke"})
	  public void takeScreenshot() {
		  System.out.println("TakeScreen");
	  }
	  
	  @Test(dependsOnGroups={"sanity"})
	  public void dropDown() {
		  System.out.println("DropDown");
	  }
	  
	  @Test(dependsOnGroups={"smoke","sanity"})
	  public void browserWindow() {
		  System.out.println("BrowserWindow");
	  }
}
