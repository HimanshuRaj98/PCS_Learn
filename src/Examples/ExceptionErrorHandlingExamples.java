package Examples;

import java.util.Scanner;
/* Exception :
 * NullPointerException
 * IllegalArgumentException
 * IOException
 * ArithmeticException */

/* Errors :
 * Compile-time
 * Run-time
 * Logical  */

/*
 * throw  -  Used To Throw Exceptions
 * throws -  */
public class ExceptionErrorHandlingExamples {
	public static void main(String[] args) {
		try(Scanner Scan = new Scanner(System.in)) {
			
			//Operations Or Instruction To Be Execuated
			
			Integer num1, num2;			
			num1 = Scan.nextInt();
			num2 = Scan.nextInt();
			int result = divide(num1 , num2);
			System.out.print(result);
		}
		catch(ArithmeticException Error) {
			System.out.print("Error : Division Is Not Possible With Zero");
		}
		
	}
	public static int divide(int a , int b) {
	return a/b;
	}
}
