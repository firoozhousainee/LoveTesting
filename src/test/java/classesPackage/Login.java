package classesPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeSuite
	  public void LaunchBrowser() {
		  
		  // selenium code 
		  System.out.println("First, launch the Browser");
		  
	  }
	
	@BeforeMethod
	  public void LaunchApplication() {
		  
		  // selenium code 
		  System.out.println("First, launch the application, Barn2Door");
		  
	  }
	@BeforeClass
	  public void Login() {
		  
		  // selenium code 
		  System.out.println("Before executing the class, execute this ...");
		  
	  }
	
  @Test
  public void WebLoginHome() {
	  
	  // selenium code 
	  System.out.println("Web Login Home");
  }
  
  @Test
  public void MobileLoginHome() {
	  
	  // Selenium code 
	  System.out.println("Mobilelogin "); // to exclude  this method from running, go to testng.xml and use methods and exclude keyword
  }
  @Test
  public void MobileLoginOut() {
	  
	  // Selenium code 
	  System.out.println("Mobile log out ");
  }
  @Test
  
  public void LoginAPIHome() {
	  
	  // Rest API automation
	  System.out.println("API LoginHome");
  }
  @AfterSuite
  public void AfterTest() {
	  
	  // selenium code 
	  System.out.println("Close the Open broswers");
  }
  
}
