package firstJava.Patterns;
//Butterfly pattern
/*
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 

 */
public class ButterflyPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=i;k<=4;k++)
			{
				System.out.print("  ");
			}
			for(int l=i;l<=4;l++)
			{
				System.out.print("  ");
			}
			for(int m=1;m<=i;m++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("  ");
			}
			for(int l=i;l<=5;l++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
