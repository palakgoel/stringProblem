package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import stringProblem.StringProblem;

public class StringTest {
  
	private StringProblem testObject = new StringProblem();
	private String expectedString;
	
	
  @Test(description="to test iterative method")
  public void testIterateAndRemoveChar() {
	 
	  expectedString = testObject.iterateAndRemoveChar("this is a test string", 't');
	  Assert.assertEquals("his is a es sring",expectedString);
	  
  }
  
  @Test(description="to test default  String method")
  public void testOneLineRemoveCharMethod() {
	  
	  
	  
	  expectedString = testObject.oneLineRemoveChar("this is a test string", 's');
	  Assert.assertEquals("thi i a tet tring",expectedString);
	  
  }
  
  @Test(description="to test iterative method for EmptySpace")
  public void testIterateAndRemoveChar_EmptySpacePassed()
  {
	  
	  expectedString = testObject.iterateAndRemoveChar("this is a test string", ' ');
	  Assert.assertEquals("thisisateststring",expectedString);
	  
  }
  
  @Test(description="to test iterative method for EmptySpace")
  public void testOneLineRemoveCharMethod_EmptySpacePassed()
  {
	  
	  expectedString = testObject.oneLineRemoveChar("this is a test string", ' ');
	  Assert.assertEquals("thisisateststring",expectedString);
	  
  }

  @Test(description="to test iterative method for special character")
  public void testIterateAndRemoveChar_SpecialCharacter() {
	 
	  expectedString = testObject.iterateAndRemoveChar("this is a te$t $tring", '$');
	  Assert.assertEquals("this is a tet tring",expectedString);
	  
  }
  
  @Test(description="to test oneLine method for special character")
  public void testOneLineRemoveCharMethod_SpecialCharacter() {
	 
	  expectedString = testObject.oneLineRemoveChar("this is a te$t $tring", '$');
	  Assert.assertEquals("this is a tet tring",expectedString);
	  
  }



  @Test(description="to test iterative method for null")
  public void testIterateAndRemoveChar_Null() {
	 
	  expectedString = testObject.iterateAndRemoveChar(null, 't');
	  Assert.assertEquals("this is a tet tring",expectedString);
	  
  }



















}
