package firstJava.Patterns;
//Write a code to print following pattern: (Same column increasing triangle)
/*
              1 
              1 2 
              1 2 3 
              1 2 3 4 
              1 2 3 4 5  

*/

public class NumberPatternColumn2 {

	public static void main(String[] args) {
		//Method-1
		for(int i=1;i<=5;i++)
		{
			for(int j=1,p=1;j<=i;j++,p++)
			{
				System.out.print(p+" ");
			}
			System.out.println(" ");
		}
		
		
		
		//Method-2
		
		/*for(int i=1;i<=5;i++)
        {
       	 for(int j=1;j<=i;j++)
       	 {
       		 System.out.print(j+" ");
       	 }
       	 System.out.println("");
        }*/

	}

}
