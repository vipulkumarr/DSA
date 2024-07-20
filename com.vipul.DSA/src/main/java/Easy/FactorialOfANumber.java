package Easy;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter number");
		 int num = scan.nextInt();
		 int factorial =num;
		 if(num ==0 || num ==1)
		 {
			 System.out.println("factorial is 1");
		 } else {
			 for(int i=num-1;i>=2;i--)
			 {
				 factorial = factorial*i;
			 }
			 
			 System.out.println("factorial is "+factorial);
		 }
		 

	}

}
