package firstJava.Patterns;
//Write a code to print following pattern:
/*                    *            
                    * * *          
                  * * * * *        
                * * * * * * *      
              * * * * * * * * *    
 
*/
public class UpwardHillPattern {

	public static void main(String[] args) {
	    //Method-1
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
	    	for(int l=1;l<=i-1;l++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println("");
	    }
		
		//Method-2
		
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
       		   for(int k=1;k<=5;k++)
               {  
       			   if(k>=i)
      		       {
      			   System.out.print("  ");
      		       }else
      		       {
      			   System.out.print("* ");
      		       }
               }
       	       System.out.println(" ");
         } */
	  }
}
