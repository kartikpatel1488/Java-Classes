package Calculator;

public class Calculator {
	/*
	 * Function will do the basic mathematics operations and return result in the double data type
	 * @param num1 as Double
	 * @param num2 as Double
	 * @param mathOp as Character
	 */
	public double operationResult(double num1, double num2, char mathOp) {
		double result = 0;
		switch (mathOp) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
	
			default:
				break;
		}
		return result;
			
	}

}
