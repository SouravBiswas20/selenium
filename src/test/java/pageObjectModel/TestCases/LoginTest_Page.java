package pageObjectModel.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

//import pageObjectModel.pages.Login_Page;

public class LoginTest_Page extends Baseclass 

{
  @Test(priority=1)
  public void verifyUrl() 
  {
	//  Login_Page lp=new Login_Page();
	  //create every time Login_Page object for every class ,it is not good practice
	  //so,solution is :create Login_Page object in Base class ..
	  String url=lp.getUrl();
	  Assert.assertTrue(url.contains("orangehrmlive"),"url not matched!");
	  System.out.println("url is matched!"+url);
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	String acttitle=lp.getAppTitle();  
	  Assert.assertTrue(acttitle.contains("OrangeHRM"),"Title is not matched!");
	  System.out.println("Title is mached!");
	    
  }
  @Test(priority=3)
  public void verifyLogin()
  {
	 lp.doLogin("Admin","admin123"); 
	 Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login is unsuccesful");
	  System.out.println("login is succesful");
	  
	  
	  
  }
  
  
  
  
  
  
  
  
}
