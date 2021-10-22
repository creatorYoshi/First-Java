package firstJava.Patterns;
//Write a code to print following pattern:
/*
            01 
            02 03 
            04 05 06 
            07 08 09 10 
            11 12 13 14 15   

*/

public class NumberPattern6 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=5;i++)
        {
       	 for(int j=1;j<=i;j++)
       	 {
       		 ++count;
       		 System.out.format("%02d ",count);
       	 }
       	 System.out.println("");
        }

	}

}
