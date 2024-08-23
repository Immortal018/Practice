package practice01;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=20,b=10;
		
		/*int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		*/
		
		a=a+b;				//Using equation, add and minus
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		
		b=a+b-(a=b);
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
