package practice01;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rr=new Random();
		int out=rr.nextInt(100);			//random number 
		double dbl=rr.nextDouble();			//random decimal
		System.out.println(out);
		System.out.println(dbl);
		System.out.println(Math.random());		//Math static random method
		
	}

}
