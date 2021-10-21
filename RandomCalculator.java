package firstJava;

import java.util.Scanner;

public class RandomCalculator {

	public static void main(String[] args) {
          // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("Enter operation to be done");
		String operation=sc.next();
	
		if(operation.equalsIgnoreCase("+"))
		{
			System.out.println("Sum is "+(a+b));	
		}else if(operation.equalsIgnoreCase("*"))
		{
			System.out.println("Product is "+(a*b));
		}else if(operation.equalsIgnoreCase("/"))
		{
			System.out.println("Remainder is "+(a/b));
		}else if(operation.equalsIgnoreCase("-"))
		{
			System.out.println("Difference is "+(a-b));
		}

	}

}
