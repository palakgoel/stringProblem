package stringProblem;
import java.util.Scanner;


public class StringProblem {

    public  String iterateAndRemoveChar(String stringUnderTest,char charToRemove)
	 {
		 // check if the String under test is empty
		if (checkStringIsNull(stringUnderTest)) {
			  throw  new NullPointerException ();
			}
		
		// temporary String to hold replaced String
		StringBuilder tempString = new StringBuilder();
		
		// Iterating over the whole String under test to remove character
		for (int i = 0; i < stringUnderTest.length(); i++ )
		{
			if(stringUnderTest.charAt(i) ==charToRemove )
			     continue;
			else
			     tempString.append(stringUnderTest.charAt(i));
		}	
		// return 
		return tempString.toString();
		
	}
	
    public  String oneLineRemoveChar(String stringUnderTest,char charToRemove)
	{
		String tempString;
		int ascii = (int) charToRemove;
		
		// check if the String is empty
		if (checkStringIsNull(stringUnderTest)) {
			  throw  new NullPointerException ();
			}
		
		// check if the Character which is to be replaced is a special character
		if(ascii >=33 && ascii <= 47)
			tempString =	stringUnderTest.replaceAll("\\"+charToRemove+"", "");
		else
			 tempString = stringUnderTest.replaceAll(charToRemove+"", "");
		
		//return
		return tempString.toString();
		
	}
	
	// method to check if String under test is null
	private boolean checkStringIsNull(String stringUnderTest)
	{
		return (stringUnderTest==null)?true:false;
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	

