package practice01;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123;
		int org_num=num;
		/*
		StringBuffer rev;
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println(rev);*/
		
		
		/*StringBuilder ss=new StringBuilder();
		ss.append(num);
		StringBuilder sa=ss.reverse();
		System.out.println(sa);*/
		
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		/* System.out.println(rev); */
		if (org_num==rev) {
			System.out.println("number is palindrome");
		} else{
			System.out.println("num is not palindrome");
		}
	}

}
