package practice01;

public class CountOccurenceOfChar {
	
	public static int occur(String character) {
		
		String s= "World is awesome";
		int total=s.length();
		int widoute=s.replace(character,"").length();
		int res=total-widoute;
		return res;
	}

	public static void main(String[] args) {
		
		int si=occur("a");
		System.out.println(si);

	}

}
