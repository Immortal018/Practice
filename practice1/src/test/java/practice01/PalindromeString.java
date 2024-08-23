package practice01;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s="madan";
		String s1=s;
		StringBuilder ss= new StringBuilder(s);	
		StringBuilder ssb=ss.reverse();
		String ssb1=ssb.toString();
		System.out.println(ssb1);
		
		if(ssb1.equals(s)) {
			System.out.println("palin");
		}else {
			System.out.println("not palin");
		}
		 
	
		
		
		
	}
	

}
