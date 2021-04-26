package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SequenceAnnotations {
  @Test
  public void testMethod() {
	  System.out.println("Executing @Test");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Executing @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Executing @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Executing @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Executing @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Executing @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Executing @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Executing @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Executing @AfterSuite");
  }

}
