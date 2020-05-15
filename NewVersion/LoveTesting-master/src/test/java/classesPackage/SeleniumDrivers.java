package classesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDrivers {
  @Test
  public void f() {
	 
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://WWW.ban2door.com");
	  driver.getTitle();
	  driver.getCurrentUrl();
	 
	 
	
  }
}
