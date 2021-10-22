package firstJava.Patterns;
//Write a code to print following pattern:(same column decreasing triangle )
/*
                    1 2 3 4 5 
                    1 2 3 4 
                    1 2 3 
                    1 2 
                    1 
 
*/

public class NumberPatternColumn {
	public static void main(String[] args) {
		//Method-1
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i,p=1;j<=5;j++,p++)
			{
				System.out.print(p +" ");
			}
			System.out.println("");
		}
	
			
	  //Method-2
		
	  /*for(int i=1;i<=5;i++)
        {
       	 for(int j=1;j<=5-i+1;j++)
       	 {
       		 System.out.print(j+" ");
       	 }
       	 System.out.println("");
        }*/

	}

}
