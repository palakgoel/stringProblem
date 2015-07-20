package stringProblem;
import java.util.Scanner;


public class StringProblem {

	

	
	public  String iterateAndRemoveChar(String stringUnderTest,char charToRemove)
	{
		
		
		System.out.println("This is an iterative approach to remove characters");
		
		
		StringBuilder tempString = new StringBuilder();
		
		for (int i = 0; i < stringUnderTest.length(); i++ )
		{
			
			if(stringUnderTest.charAt(i) ==charToRemove )
			  continue;
			else
			 tempString.append(stringUnderTest.charAt(i));
			
		}
		
		
		
		return tempString.toString();
		
	}
	public  String oneLineRemoveChar(String stringUnderTest,char charToRemove)
	{
		
		System.out.println("\n\nIn this method we will use default String methods to remove Characters");
		
		
		String tempString = stringUnderTest.replaceAll(charToRemove+"", "");
		System.out.println("Here is the final String: " + tempString);		
		
		return tempString.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
