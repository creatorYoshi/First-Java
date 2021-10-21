package firstJava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// To find Armstrong Number between two given number.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
        int m=n;
        int sum=0;
		for(int i=0;i>=0;i++)
		{
			int r=n%10;
			n/=10;
			sum=sum+r*r*r;
			
		}
		System.out.println(sum);
		//by while loop
		/*
		 while(n>0)
		 {
		    int r=n%10;
		    n/=10;
		    sum=sum+r*r*r;
		 }
		   System.out.println(sum); 
		 */
		if(sum==m)
		{
			System.out.println("It is an Armstrong number");
		}else
		{
			System.out.println("It is not an Armstrong number");
		}
	}

}
