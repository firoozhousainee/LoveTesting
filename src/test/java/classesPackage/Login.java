package classesPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
	  public void LaunchApplication() {
		  
		  // selenium code 
		  System.out.println("First, launch the URL, Barn2Door");
		  
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
  @AfterTest
  public void AfterTest() {
	  
	  // selenium code 
	  System.out.println("Close the Open broswers");
  }
  
}
