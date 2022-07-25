package ExampleDemo.com.FirstMvnDemo;

import java.util.Scanner;

import Calculator.Calculator;


public class App 
{
	static String contOperation = "";
    public static void main( String[] args )
    {
    	Calculator Cal = new Calculator();
    	Scanner in = new Scanner(System.in);
    	
    	do {
    		
    		double firstValue,secondValue,result = 0;
        	char mathOperation;
        	
        	if (contOperation.equals("") ) {
        		System.out.println("Welcome to the basic math calculator!!!");
        	}
    		
    		System.out.print("Enter your first Value ==> ");
    		firstValue = in.nextDouble();
    		System.out.println();
    		
    		System.out.print("Enter your second Value ==> ");
    		secondValue = in.nextDouble();
    		System.out.println();
    		
    		System.out.print("Enter your choice of operation ==> ");
    		mathOperation = in.next().charAt(0);
    		System.out.println();
    		
    		result = Cal.operationResult(firstValue, secondValue, mathOperation);
    		System.out.println("Answer for you is ==> " + result);
    		
    		System.out.print("Do you want to do another operation press y or Y for continue ==> " );
    		contOperation = in.next();
    		if (contOperation.equals("y") || contOperation.equals("Y")) {
    			for (int i = 1; i <= 5 ; i++) {
    				System.out.println();
    				
    			}
    		} else {
    			System.out.println("Thank you for using custom calculator :)");
    		}
    		
    		
    	} while (contOperation.equals("y") || contOperation.equals("Y"));
    	
  
    }
}
