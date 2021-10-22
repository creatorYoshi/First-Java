package firstJava;

import java.util.Scanner;

public class CurrencyCalculator {

	public static void main(String[] args) {
              //Input currency in rupees and output in USD.		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter currency in rupees");
		int amount= sc.nextInt();
		
		System.out.println("Currency in USD is "+(amount*0.013));
		
	}

}
