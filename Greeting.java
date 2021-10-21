package firstJava;
import java.util.*;
public class Greeting {

	public static void main(String[] args) {
		// Take name as input and print a greeting message for that name.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();
        
        System.out.println("Hello "+name);

	}

}
