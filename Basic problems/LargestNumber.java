package firstJava;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// Take 2 numbers as input and print the largest number.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a);
		}else if(a<b)
		{
			System.out.println(b);
		}
	
	}

}
