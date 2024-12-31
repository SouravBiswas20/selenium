package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {
  @Test
  public void HardAssertion() {
	  
	  String act="Hi I am billa";
	//  String exp1="Hi I am billa";
	  String exp2="Hi I am sourav";
	  
	//  Assert.assertEquals(act,exp2,"String are not equal");
	 // System.out.println("string are equal");
	  
	 
	  
//	  Assert.assertEquals(act,exp1,"String are not equal");
//	  System.out.println("String are equal");
	  
	  
	  
//  Assert.assertTrue(act.equals(exp1),"string are not equal");
	//  System.out.println("String are equal");
	  
	// Assert.assertTrue(act.equals(exp2),"String are not equal");
	 // System.out.println("String are equal");
	  
	  
	// Assert.assertFalse(act.equals(exp1),"String are equal");
	 // System.out.println("String are  not equal");
	  
	  
	  Assert.assertFalse(act.equals(exp2),"string are  equal");
	  System.out.println("string are not equal");
	  
	  System.out.println("hard assertion completed!!!!");
	  
	  
  }
}
