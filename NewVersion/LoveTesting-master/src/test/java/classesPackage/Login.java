package classesPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

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
	
 
  @Test(groups= {"Smoke"})
  public void WebLoginHome() {
	  
	  // selenium code 
	  System.out.println("Web Login Home");
  }
  
  @Test(groups= {"Regression"})
  public void MobileLoginHome() {
	  
	  // Selenium code 
	  System.out.println("Mobile log in "); // to exclude  this method from running, go to testng.xml and use methods and exclude keyword
  }
  @Test(dependsOnMethods= {"MobileLoginHome", "LoginAPIHome" })  // to make sure to run login first then logout test case (interdependencies) 
  public void MobileLogOut() {
	  
	  // Selenium code 
	  System.out.println("Mobile log out ");
  }
  @Test(groups= {"Smoke"}) // to add certain test cases in smoke tests
  public void LoginAPIHome() {
	  
	  // Rest API automation
	  System.out.println("API LoginHome");
  }
  @AfterSuite
  public void AfterTest() {
	  
	  // selenium code 
	  System.out.println("Close the Open broswers");
  }
  // @Test(enabled=false)   // to escape this test case. In case that we know there is a bug here and already reported 
  
  @Test
  public void DisputeSubmit() {
	  
	  // selenium code 
	  System.out.println("Submitting dispute or claim");
  }
  
  @Test(timeOut = 4000)  
  public void CrwolinHomePage() {
	  
	  // selenium code 
	  System.out.println("Wait 40 seconds before failing ...");
  }
  
}
