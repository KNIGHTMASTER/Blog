import java.util.Scanner;

public class InfixToPrefix{
	
	static Scanner scan;
	static char[] operator;
	static char[] operand;
	static int operatorPos = -1;
	static int operandPos = -1;
	static int infixLength = 0;
	
	public static void main( String [] args ){
		scan = new Scanner( System.in );
		System.out.println ( "Input Infix Expression : " );
		String data = scan.nextLine().trim();
		data = data.replaceAll("\\s+", "");
		System.out.println( "Infix Notation = "+data );
		infixLength = data.length();
		System.out.println( "Convert to Prefix = " + doConversion( data ) );
	}
	
	public static String doConversion( String infix ){		
		operator = new char[infixLength];
		operand = new char[infixLength];
		for ( int a=0; a<infixLength; a++ ){
			char temp = infix.charAt(a);
			if( temp=='(' ){
				//Do Nothing
			}else if ( temp==')' ){
				pushOperand( popOperator() );
			}else if ( isOperator( temp )==true ){
				pushOperator( temp );
			}else if( ! isOperator( temp ) && temp!=')' && temp!='(' ){
				pushOperand( temp );
			}
		}
				
		return String.valueOf( operand );
	}
	
	public static String buildResult( char[] data ){
		String result = "";
		for ( int a=0; a<data.length; a++ ){
			result += data;
		}
		return result;
	}
	
	public static void pushOperator( char value ){
		operatorPos++;
		if ( operatorPos<infixLength ){
			operator[operatorPos] = value;			
		}else{
			System.out.println( "Operator Stack is Full " );
		}
	}
	
	public static char popOperator(){
		char result = 0;
		if ( operatorPos>-1 ){
			result = operator[operatorPos];
			operatorPos--;
		}else{
			System.out.println( "Operator Stack is Empty" );
		}		
		return result;
	}
	
	public static void pushOperand( char value ){
		operandPos++;
		if ( operandPos<infixLength ){			
			operand[operandPos] = value;			
		}else{
			System.out.println( "Operand Stack is Full " );
		}
	}
	
	public static char popOperand(){
		char result = 0;
		if ( operandPos>-1 ){
			result = operand[operandPos];
			operandPos--;
		}else{
			System.out.println( "Operand Stack is Empty" );
		}
		return result;
	}
	
	public static boolean isOperator( char operator ){
		if( operator=='+' || operator=='-'  || operator=='*' || operator=='/' || operator=='V' ){
			return true;
		}else{
			return false;
		}
	}
	
	public static int getLevelOperator( char operator ){
		int level = 0;
		if ( operator=='V' ){
			level = 1;
		}else if ( operator=='*' || operator=='/' ){
			level = 2;
		}else if ( operator=='+' || operator=='-' ){
			level = 3;
		}else{
			level = 4;
		}
		return level;
	}

	
	enum Operator{
		MULTIPLY("*"),
		SUBSTRACT("-"),
		PLUS("+"),
		DIVIDE("*"),
		SQUARE_ROOT("V");

		private String internalRepresentation;
		
		private Operator(String operator){
			this.internalRepresentation = operator;
		}
		
        public String toString() {
            return internalRepresentation;
        }
	}
}