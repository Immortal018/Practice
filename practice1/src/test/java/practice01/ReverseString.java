package practice01;

public class ReverseString {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		String org=s;
		
		
		  int si=s.length();
		  System.out.println(si);
		  char c[]=s.toCharArray();
		 
		  for (int i =s.length()-1; i>=0; i--) {
			  
			 rev= rev+ c[i];
			  
		  }
		  System.out.println(rev);
		  if(org.equals(rev)) {
			  
			  System.out.println("palindrome");
		  }else {
			  System.out.println("not palindrome");
		  }
		  
		 
		
		
			/*
			 * StringBuffer sb=new StringBuffer(s); System.out.println(sb.reverse());
			 * 
			 * StringBuilder ss=new StringBuilder(s); System.out.println(ss.reverse());
			 * 
			 */
		
		
		
	}
}

