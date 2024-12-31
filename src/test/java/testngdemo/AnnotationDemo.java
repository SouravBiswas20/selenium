package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test
  public void registertest() 
  {
	  System.out.println("This is register test");
  }
  @Test
  public void logintest() 
  {
	  System.out.println("This is login test");
  }
  
  @Test
  public void logouttest() 
  {
	  System.out.println("This is logout test");
  }
  
  @BeforeMethod
  public void bmethod() {
	  
	 System.out.println("BeforeMethod executes before every test case!"); 
  }
  
  @AfterMethod
  public void amethod() {
	  
	  System.out.println("AfterMethod will execute after every test case!");
  }
  
  @BeforeClass
  public void bclass() {
	  
	  System.out.println("BeforeClass execute befor only first test case!");
  }
  
  @AfterClass
  public void aclass() {
	  
	  System.out.println("AfterClass execute after only last test case!");
  }
  
  @BeforeTest
  public void btest() {
	  
	  System.out.println("BeforeTest will run before class/all classes!");
  }
  
  @AfterTest
  public void atest() {
	  
	  System.out.println("AfterTest will run after class/all classes!");
  }
  
  @BeforeSuite
  public void bsuite() {
	  
	  System.out.println("BeforeSuite will run before Test!");
  }
  
  
  @AfterSuite
  public void asuite() {
	  
	  System.out.println("AfterSuite will run after Test!");
  }
  
  
  
  
  
}
