package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInputin2DArray {

	public static void main(String[] args) {
		int[][] a = new int[3][];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter length of column in "+(i+1) +" row");
			int row = scan.nextInt();
			a[i] = new int[row];
			for(int j=0;j<row;j++)
			{
				System.out.println("Enter number");
				a[i][j] = scan.nextInt();
			}
		}
		
		for(int [] x : a)
		{
			System.out.println(Arrays.toString(x));
		}
		

	}

}
