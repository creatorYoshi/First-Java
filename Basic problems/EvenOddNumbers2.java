package firstJava;
import java.util.*;
public class EvenOddNumbers2 {

	public static void main(String[] args) {
		// Write a program to print whether a number is even or odd, also take input.
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
   
     if(n%2==0)
    {
    	System.out.println("It is an even number");
    }else
    {
    	System.out.println("It is an odd number");
    }
	}

}
