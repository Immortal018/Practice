package practice01;

public class Palindrome {

	public static void main(String[] args) {
		int num=164563;
		int org_num=num;
		int rev=0;
		while (num!=0) {
			rev=rev*10 + num%10;
			num=num /10;
			
			
		}
		System.out.println(rev);
		
		if(org_num==rev) {
			
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	
		
		

	}

}
