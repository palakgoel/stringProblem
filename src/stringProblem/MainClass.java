package stringProblem;

public class MainClass {

	public static void main(String[] args) {
		
		// variable declaration
		String inputString, outputString_Iteration, outputString_OneLine;
		char charToRemove;
       
		StringProblem obj = new StringProblem();
		inputString = "This is test String";
		charToRemove = 't';
		
		//replacing a character through iteration
		outputString_Iteration  = obj.iterateAndRemoveChar(inputString,charToRemove);
		System.out.println("Here is the final String for iterateAndRemoveChar method : " + outputString_Iteration);
		
		//replacing a character through one line code
		outputString_OneLine = obj.oneLineRemoveChar(inputString,charToRemove);
		System.out.println("Here is the final String for oneLineRemoveChar method : " + outputString_OneLine);
	}
}
