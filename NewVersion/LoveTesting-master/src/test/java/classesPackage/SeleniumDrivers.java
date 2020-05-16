package classesPackage;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SeleniumDrivers {
  @Test
  public void GetURL(){
	 
	  //WebDriverManager.chromedriver().setup();
	  WebDriverManager.firefoxdriver().setup();
	  //WebDriver driver = new ChromeDriver();
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.barn2door.com/");
	  
	  driver.getTitle();
	  driver.getCurrentUrl();
	 	
  }
  public void testEqual() {
	  
	  String expVal="A";
	  String actVal="B";
	  Assert.assertEquals(expVal, actVal);
	  
  }
}
