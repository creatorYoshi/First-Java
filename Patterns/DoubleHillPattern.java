package firstJava.Patterns;
//Write a code to print following pattern:(Double hill)
/*
          *                 * 
        * * *             * * * 
      * * * * *         * * * * * 
    * * * * * * *     * * * * * * * 
  * * * * * * * * * * * * * * * * * * 
       
 */
public class DoubleHillPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
                System.out.print("  ");
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("* ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("* ");
			}
			for(int m=i;m<=4;m++) 
			{
				System.out.print("  ");
			}
			for(int n=i;n<=4;n++) 
			{
				System.out.print("  ");
			}//
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("* ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
