import Enums.Days;
import Enums.Levels;
//Enumerations

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Levels enumLevel =  Levels.LOW;
		System.out.print(enumLevel);
		
		Days enumToday =  Days.SUNDAY;
		System.out.print("\n");
		
		switch(enumToday) {
		case MONDAY:
			System.out.print("TODAY IS MONDAY");
			break;
		case TUESDAY:
			System.out.print("TODAY IS TUESDAY");
			break;
		case WEDNESDAY:
			System.out.print("TODAY IS WEDNESDAY");
			break;
		case THURSDAY:
			System.out.print("TODAY IS THURS");
			break;
		case FRIDAY:
			System.out.print("TODAY IS FRIDAY");
			break;
		case SATURDAY:
			System.out.print("TODAY IS SATURDAY");
			break;
		case SUNDAY:
			System.out.print("TODAY IS SUNDAY");
			break;	
		}
		
		if(enumToday == Days.SATURDAY || enumToday == Days.SUNDAY ) {
			System.out.print("\nIts A Weekend !!");
		}
	}

}
