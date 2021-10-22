package firstJava.Patterns;
/*
                                                  1 1 1 1 1 
                                                    2 2 2 2 
                                                      3 3 3 
                                                        4 4 
                                                          5 

 */
public class NumberPatternRow {

	public static void main(String[] args) {
		
		for(int i=1,p=1;i<=5;i++,p++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(p+" ");
			}
			System.out.println("");
		}
	}

}
