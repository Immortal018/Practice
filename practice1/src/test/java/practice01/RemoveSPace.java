package practice01;

public class RemoveSPace {
public static void main(String[] args) {
	
	String s="Java is		aawesome";
	s=s.replaceAll("\\s"," ");
	System.out.println(s);
}
}
