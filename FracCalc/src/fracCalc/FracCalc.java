package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args)  {
    	// TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);	
        String problem = userInput.nextLine();  
        while (!problem.contentEquals("quit")) {
            String answer = produceAnswer(problem);
        	System.out.println("Here is your answer: "+ answer);
        	problem = userInput.nextLine();
        	}
    }
       
   
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
    int firstSpace= input.indexOf(" ");
    String firstOperand= input.substring(0 , firstSpace );
    int secondSpace= input.indexOf(" ")+2;
    String secondOperand = input.substring(secondSpace+1, input.length());
    int space= secondOperand.indexOf(" ");
    int line= secondOperand.indexOf("_");
    String whole = secondOperand.substring(space, line);
    int dush= secondOperand.indexOf("/");
    String numerator = secondOperand.substring(line, dush);
    String denominator = secondOperand.substring(dush, secondOperand.length());
    System.out.println("whole: "+ whole+"numerator: "+ numerator+"denominator: "+ denominator);
    return secondOperand ;
    }
}



// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
// This function takes a String 'input' and produces the result
//
// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
//      e.g. input ==> "1/2 + 3/4"
//        
// The function should return the result of the fraction after it has been calculated
//      e.g. return ==> "1_1/4"  pg.167


