package firstJava.Patterns;
//Write a code to print following pattern:(Increasing Triangle)
/*
                      * 
                      * * 
                      * * * 
                      * * * * 
                      * * * * * 
*/
public class IncreasingHillPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)       //this will print spaces along with stars
		{
		    for(int j=1;j<=i;j++)
		    {
		    	System.out.print("* ");
		    }
		    for(int k=i;k<=5;k++)
		    {
		    	System.out.print("  ");
		    }
		    System.out.println("");
		}
		
		/*for(int i=1;i<=5;i++)      //this won't print space
        {
       	 for(int j=1;j<=i;j++)
       	 {
       		 System.out.print("* ");
       	 }
       	 System.out.println("");
        }*/

	}

}
