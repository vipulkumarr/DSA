// program to print fibonachi series till nth element
package Easy;

import java.util.Scanner;

public class FibonachiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("Enter series length number");
		int num = scan.nextInt();
		System.out.print(a+" "+b+" ");
		int sum=0;
		for(int i=3;i<=num;i++)
		{
			sum = a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
		System.out.println();
		System.out.println(num+"th term is "+sum);

	}

}
