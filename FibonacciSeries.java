package firstJava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		              // To calculate Fibonacci Series up to n numbers.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of terms");
		int n= sc.nextInt();
		
		int firstTerm=0;
		int secondTerm=1;
		System.out.print(firstTerm +","+secondTerm+",");
		for(int i=0;i<=n;i++)
		{
			int nextTerm= firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			System.out.print(nextTerm +",");
		}
        
	}

}
