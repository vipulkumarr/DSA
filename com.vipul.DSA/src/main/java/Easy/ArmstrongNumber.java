//program to find armstrong number between two numbers
package Easy;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		for(int i=num1;i<=num2;i++) {
		int noofdigits=0;
		int origionalnumber = i;
		int origionalnumber2 = i;
		double sum=0;
		while(origionalnumber>0) {
			noofdigits++;
			origionalnumber=origionalnumber/10;
		}
		origionalnumber = i;
		while(origionalnumber>0) {
			int reminder = origionalnumber%10;
			sum = sum+ Math.pow(reminder, noofdigits);
			origionalnumber = origionalnumber/10;
		}
		
		if(sum==origionalnumber2) {
			System.out.print(i+" ");
		}
		
	}
	}

}
