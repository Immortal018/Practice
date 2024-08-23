package practice01;

public class CountWords {

	public static void main(String[] args) {
		String s="welcome to home";
		String a[]=s.split(" ");
		System.out.println(a.length);
		
		//count the words and letters of sentence;
		
		String s1= "Vignesh is awesome";
		String a1[]=s.split(" ");
		int sum=0;
		for (int i = 0; i < a1.length; i++) {
			
			
			int si=a1[i].length();
			sum=sum+si;
			
			
		}System.out.println(sum);

	}

}
