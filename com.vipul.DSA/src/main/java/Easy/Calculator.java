package Easy;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter opeartor");
		String operator = scan.next().trim();
		while(!(operator.equals("x"))) {
		System.out.println("Enter first number");
		double num1 = scan.nextDouble();
		System.out.println("Enter second number");
		double num2 = scan.nextDouble();
		switch(operator)
		{
		case "+" -> System.out.println("Result is "+(num1+num2));
		case "-" -> System.out.println("Result is "+(num1-num2));
		case "*" -> System.out.println("Result is "+(num1*num2));
		case "/" -> {
			if(num2==0)
			{
				System.out.println("can not devide by zero");
			}else {
				System.out.println("Result is "+(num1/num2));
			}
		}
		default -> System.out.println("Enter valid operator");
		}
		System.out.println("enter opeartor");
		operator = scan.next().trim();

	}
		System.out.println("Exit");

}
}
