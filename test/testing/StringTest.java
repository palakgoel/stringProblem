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
	  Assert.assertEquals(expectedString,"his is a es sring");
      }
  
  @Test(description="to test default  String method")
  public void testOneLineRemoveCharMethod() {
	  expectedString = testObject.oneLineRemoveChar("this is a test string", 's');
	  Assert.assertEquals(expectedString,"thi i a tet tring");
	  }
  
  @Test(description="to test iterative method for EmptySpace as character")
  public void testIterateAndRemoveChar_EmptySpacePassed() {
	  expectedString = testObject.iterateAndRemoveChar("this is a test string", ' ');
	  Assert.assertEquals(expectedString,"thisisateststring");
	  }
  
  @Test(description="to test iterative method for EmptySpace")
  public void testOneLineRemoveCharMethod_EmptySpacePassed() {
	  expectedString = testObject.oneLineRemoveChar("this is a test string", ' ');
	  Assert.assertEquals(expectedString,"thisisateststring");
      } 
  

  @Test(description="to test iterative method for special character")
  public void testIterateAndRemoveChar_SpecialCharacter() {
	  expectedString = testObject.iterateAndRemoveChar("this is a te$t $tring", '$');
	  Assert.assertEquals(expectedString,"this is a tet tring");
	  }
  
  @Test(description="to test oneLine method for special character")
  public void testOneLineRemoveCharMethod_SpecialCharacter() {
	  expectedString = testObject.oneLineRemoveChar("this is a te$t $tring", '$');
	  Assert.assertEquals(expectedString,"this is a tet tring");
	  }

  @Test(expectedExceptions = NullPointerException.class)
  public void testIterateAndRemoveChar_NullString() throws NullPointerException{
	 expectedString = testObject.iterateAndRemoveChar(null, 't');
	 }

  @Test(description ="to test iterative method for special numbers")
  public void testIterateAndRemoveChar_Numbers() {
	 expectedString = testObject.oneLineRemoveChar("1his is a te1t 1tring", '1');
	 Assert.assertEquals(expectedString,"his is a tet tring");
	 }
  
  @Test(description="to test oneLine method for numbers")
  public void testOneLineRemoveCharMethod_Numbers() {
	 expectedString = testObject.oneLineRemoveChar("1his is a te1t 1tring", '1');
	 Assert.assertEquals(expectedString,"his is a tet tring"); 
     }
















}
