package Easy;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		int sum=0;
		int originalnumber = num;
		int length = (num+"").length();
		while(num>0)
		{
			int reminder = num%10;
			sum = (int) (sum+(reminder*Math.pow(10, length-1)));
			num = num/10;
			length = length-1;
		}
		if(sum == originalnumber)
		{
			System.out.println("This is a palindrom number");
		} else {
			System.out.println("This is not a palindrom number");
		}

	}

}
