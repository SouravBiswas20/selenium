package testngdemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*
 * to make test cases on sequences ,use ----->
 * priority attribute with no ..i.e.
 * priority=1
*/

public class testdemo2 {
  
@Test(priority=1)
  public void chrometest()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://staragile.melimu.com/login/index.php");
	  System.out.println("title is :"+driver.getTitle());
	  
  }
  
  @Test(priority=2)
  public void edgetest()
  {
	  
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.amazon.in/");
	  System.out.println("title is :"+driver.getTitle());
	  
  }
  @Test(priority=3)
  public void firefoxtest()
  {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/login.php");
	  System.out.println("title is :"+driver.getTitle());
	  
  }

  
  
  
  
  
  
  
  
}
