package firstJava.Patterns;
//Write a code to print following pattern:
/*                          * 
                          * * 
                        * * * 
                      * * * * 
                    * * * * *  
*/
public class IncreasingHillPatternRight {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		
		/*for(int i=1;i<=5;i++)
        {
       	 for(int j=1;j<=5;j++)
       	 {
       		 if(i+j>5)
       		 {
       			 System.out.print("* ");
       		 }else
       		 {
       			 System.out.print("  ");
       		 }
       	 }
       	 System.out.println("");
	}*/
	}

}
