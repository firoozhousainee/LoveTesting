package classesPackage;

import org.testng.annotations.Test;

public class TestingExample {
  @Test
  public void f() {
  }
//  @Test(description="Launches the WordPress site")
//  public void launchSite(){
//    selenium.open("");
//    selenium.waitForPageToLoad("30000");
//    assertEquals(selenium.getTitle(), "Demo | Just another WordPress site");
//  }
//    
//  @Test(description="Navigates to the admin page")
//    public void openAdminPage() {
//    selenium.open("wp-admin");
//    selenium.waitForPageToLoad("30000");
//    assertEquals(selenium.getTitle(), "Demo › Log In");
//  }
//    
//  @Test(description="Enters valid login data")
//    public void loginAsAdmin() {
//    selenium.type("user_login", "admin");
//    selenium.type("user_pass", "demo123");
//    selenium.click("wp-submit");
//    selenium.waitForPageToLoad("30000");
//    assertTrue(selenium.isTextPresent("Howdy, admin"));
//  }
//    
//  @Test(description="Navigates to the New Post screen")
//  public void navigateNewPost() {
//    selenium.click("//a[contains(text(),'Posts')]/following::a[contains(text(),'Add New')][1]");
//    selenium.waitForPageToLoad("30000");
//    assertTrue(selenium.isTextPresent("Add New Post"));
//  }
//    
//  @Test(description="Writes the new post")
//  public void writeBlogPost() {
//    selenium.type("title", "New Blog Post");
//    selenium.click("edButtonHTML");
//    selenium.type("content", "This is a new post");
//    //TODO:Assert
//  }
//    
//  @Test(description="Publishes the post")
//  public void publishBlogPost() {
//    selenium.click("submitdiv");
//    selenium.click("publish");
//    selenium.waitForPageToLoad("30000");
//    assertTrue(selenium.isTextPresent("Post published."));
//  }
//    
//  @Test(description="Verifies the post")
//  public void verifyBlogPost() {
//    selenium.click("//a[contains(text(),'Posts') and contains(@class,'wp-first-item')]");
//    selenium.waitForPageToLoad("30000");
//    assertTrue(selenium.isElementPresent("//a[text()='New Blog Post']"));
//  }
//    
//  @Test(description="Logs out")
//  public void logout() {
//    selenium.click("//a[text()='Log Out']");
//    //TODO:Assert
//  }

}
