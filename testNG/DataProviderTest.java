package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  //@Test(dataProvider = "dp")
  @Test(dataProvider = "Data")
  public void demoData(Integer n, String s) {
	  
	  System.out.println("String is : "+s+" and"+" Integer is : "+n);
  }

  //Object is the superclass of all classes and objects in Java.
  //First dimension represents the number of times test method needs to be invoked.
  //Second dimension size represents the array of objects that must be compatible with test method parameter types.
  
  @DataProvider(name="Data")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "f" }
    };
  }
}
