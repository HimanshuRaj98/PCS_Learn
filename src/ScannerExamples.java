import java.util.Scanner;
/*
 * nextBoolean()
 * nextByte()
 * nextLong()
 * nextShort()
 * nextDouble()
 * nextInt()
 * nextLine()
 * nextFloat()
 *   */
public class ScannerExamples {
	
	public static void main(String[] args) {
		try (
			// Input-Output Examples Using Scanner
			Scanner Scan = new Scanner(System.in)) {
			
				System.out.println("Write Your Name");
				String Name = Scan.nextLine();
			
				System.out.println("Enter The Age");
				int Age = Scan.nextInt();
			
				System.out.println("Hi!!! "+ Name + " As Your Age Is "+ Age +" Your Are Eligible For Event");
		}
	}

}
