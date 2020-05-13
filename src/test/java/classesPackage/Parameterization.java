package classesPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters({"URL", "APIKey/username"})
	@Test
  public void RunParameterizaion(String urlName, String key) {
		System.out.println( "Is Barn2Door URL openning? " + urlName);
		System.out.println("Is the key printing? " + key);
  }
	
	@Test(dataProvider="getData")
	public void regForm(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	// to provide data to our methods simply put @DataProvider
	@DataProvider
	public Object[][] getData() {
		
		// 1st combination - username and pass - good credit history 
		// 2nd - username pass - no credit history
		// 3rd - fraudelent credit history 
		
		Object[][] data = new Object[3][2];
		// 1st set data 
		data[0][0] ="firstusername";
		data[0][1] ="firstpassword";
		
		// 2nd set data 
		data[1][0] ="secondusername";
		data[1][1] ="secondpassword";
		
		// 2nd set data 
		data[2][0] ="thirdusername";
		data[2][1] ="thirdpassword";
		
		return data;  
		
		
		
	}
}
