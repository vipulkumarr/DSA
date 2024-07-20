package Easy;

import java.util.Scanner;

public class NoOfevenDaysInAMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month");
		String month = scan.next();
		int noofdays=0;
		int noofevendays=0;
		switch(month) {
		case "January","March","May","July","August","October","December" -> noofdays=31;
		case "Febraury" -> noofdays = 28;
		default -> noofdays = 30;
		}
		
		for(int i=1;i<=noofdays;i++)
		{
			if(i%2==0)
			{
				noofevendays = noofevendays+1;
			}
			
		}
		
		System.out.println("No of even days are "+noofevendays);

	}

}
