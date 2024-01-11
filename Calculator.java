public class Calculator {

	String operator;
	int num1;
	int num2;
	
	public void calculate() {
		
		switch ( operator ) {
		
			case "Add" :
				System.out.println( "Addition :: " + (num1 + num2) );
			break;

			case "Sub" :
				System.out.println( "Subtraction :: " + (num1 - num2) );
			break;

			case "Mul" :
				System.out.println( "Multiplication :: " + (num1 * num2) );
			break;

			case "Div" :
				System.out.println( "Division :: " + (num1 / num2) );
			break;
			
			default :
				System.out.println( "not a valid operator" );

		}

	}
	
	public Calculator( String operation, int  firstOperand, int secondOperand ) {
		
		operator = operation;
		num1 = firstOperand;
		num2 = secondOperand;
		
	}
	
	
	public static void main( String[] args ) { 
	
	    Calculator cal = new Calculator( args[0], Integer.parseInt( args[1] ), Integer.parseInt( args[2] ) );
		cal.calculate();
		
	}



}
