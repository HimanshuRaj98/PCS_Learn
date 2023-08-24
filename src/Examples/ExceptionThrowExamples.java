package Examples;

import java.util.Scanner;

public class ExceptionThrowExamples {

	public static void main(String[] args) {
		// Exceptions And Errors Are Different
		try(Scanner Scan = new Scanner(System.in) ) {
			System.out.print("Enter Your Age:\n");
			Integer Age = Scan.nextInt();
			validateAge(Age);
		}
		catch(IllegalArgumentException Error) {
			System.out.print("Error:" + Error.getMessage());
		}
	}
	public static void validateAge(int age) {
		if(age<18)
			throw new IllegalArgumentException("Age Must Be 18+");
		else 
			System.out.print("Age Is Valid");
	}

}
