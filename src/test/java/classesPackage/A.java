package classesPackage;

import org.testng.annotations.Test;

import org.testng.annotations.*;

public class A {
	
@Test(groups= {"Smoke"})
  public void Search() {
	  
	  System.out.println("This method will test the search feature");
  }
  
  
  @Test
  public void beforeMethod() {
	  
	 
	  System.out.println("Before method");
  }
  @Test(groups= {"Smoke"})
  public void TestScroll() {
	  System.out.println("Testing scrolling feature");
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
  @Parameters({"URL"})   // using @Parameters 
  @Test
  public void OnlyRunMe(String urlName) {
	  System.out.println(" I am using 'Include' method");
	  System.out.println("IS it printing ???????????" + urlName);
  }

}
