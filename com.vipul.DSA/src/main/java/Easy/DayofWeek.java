// program to print if given day is weekday or weekend
package Easy;

import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day");
		int day = scan.nextInt();
		switch(day)
		{
		case 1,2,3,4,5 -> System.out.println("Weekday");
		case 6,7 -> System.out.println("Weekend");
		default -> System.out.println("Enter a valid day");
		}
		

	}

}
