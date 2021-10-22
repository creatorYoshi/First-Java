package firstJava.Patterns;
//Write a code to print following pattern:(Decreasing Triangle)
/*                    * * * * * 
                        * * * * 
                          * * * 
                            * * 
                              * 
*/
public class DecreasingHillPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)          //it will print one increasing and one decreasing triangle
		{
			for(int j=1;j<=i;j++)      //(increasing space triangle)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=5;j++)      //(decreasing star triangle)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		/*for(int i=1;i<=5;i++)
        {
       	 for(int j=1;j<=5;j++)
       	 {
       		 if(j>=i)
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
