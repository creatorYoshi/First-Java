package firstJava;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of P,T and R");
		int P= sc.nextInt();
		int T= sc.nextInt();
		int R= sc.nextInt();
		
		System.out.println("Simple Interest is "+((P*R*T)/100));
	}

}
