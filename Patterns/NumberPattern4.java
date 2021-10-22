package firstJava.Patterns;
//Write a code to print following pattern:
		/*
                     02 03 04 05 06 
                     03 04 05 06 07 
                     04 05 06 07 08 
                     05 06 07 08 09 
                     06 07 08 09 10 
         

   */
public class NumberPattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
        {
       	 for(int j=1;j<=5;j++)
       	 {
       		 System.out.format("%02d ",(i+j));
       	 }
       	 System.out.println("");
        }

	}

}
