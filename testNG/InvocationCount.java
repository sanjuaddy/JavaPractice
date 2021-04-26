package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCount {
  
	 @Test(invocationCount=50, invocationTimeOut=1)
	  public void alerts() {
		  System.out.println("Alerts");
	  }
	  
	  @Test()
	  public void frames() {
		  System.out.println("Frames");
	  }
	  
	  @Test(enabled=false)
	  public void takeScreenshot() {
		  System.out.println("TakeScreen");
	  }
}
