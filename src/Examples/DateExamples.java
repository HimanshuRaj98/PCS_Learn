package Examples;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		System.out.print("Current Date : " + currentDate);
		System.out.print("\n");
		System.out.print("Current Time : " + currentTime);
		System.out.print("\n");
		
		LocalDate specificDate = LocalDate.of(2023,01,10);
		LocalTime specificTime = LocalTime.of(12, 24, 50);
		
		System.out.print("Current Date : " + specificDate);
		System.out.print("\n");
		System.out.print("Current Time : " + specificTime);
	}

}
