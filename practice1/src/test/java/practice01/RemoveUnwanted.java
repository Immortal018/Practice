package practice01;

public class RemoveUnwanted {

	public static void main(String[] args) {
		String s="!@#$&^Hey yo()12234 SUP";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
