package stringProblem;

import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		String inputString, outputString_Iteration, outputString_OneLine;
		char charToRemove;
       
		
		Scanner user_input = new Scanner( System.in );
		
		System.out.print("Enter the string - ");
		inputString = user_input.nextLine();
		System.out.print("Enter the character you want to remove - ");
		charToRemove = user_input.nextLine().charAt(0);
		
		
		
		StringProblem obj = new StringProblem();
		outputString_Iteration  = obj.iterateAndRemoveChar(inputString,charToRemove);
		System.out.println("Here is the final String: " + outputString_Iteration);
		
		outputString_OneLine = obj.oneLineRemoveChar(inputString,charToRemove);
		System.out.println("Here is the final String: " + outputString_OneLine);
	}
	
	
	
	
	
}
