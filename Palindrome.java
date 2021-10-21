package firstJava;

public class Palindrome {

	public static void main(String[] args) {
		//To find out whether the given String is Palindrome or not.
		   String str= "A man, a plan ,a canal: Panama";
	       String r=str;
	       r= r.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	       System.out.println(r);
	       String rev=""; 
	       
	           for(int i=str.length()-1;i>=0;i--){
	               
	                rev=rev+str.charAt(i);
	           }
	        rev=rev.replaceAll("[^a-zA-Z0-9]","").toLowerCase();   
	        System.out.println(rev);
	        if(r.equals(rev))
	        {
	        	System.out.println("Its a palindrome");
	        }else
	        {
	        	System.out.println("Not a palindrome");
	        }
        
        

	}

}
