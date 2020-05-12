package classesPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class A {
  @Test
  public void f() {
	  
	  System.out.println("This is a sample test.");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("before suite execute ...");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite executre this one ...");
  }
  @Test
  public void OnlyRunMe() {
	  System.out.println("I need to run only this method from this class. I am using 'Include' method");
  }

}
