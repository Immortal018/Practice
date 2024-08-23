package practice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("F:\\Java\\writeFile\\web.txt");
		BufferedWriter br=new BufferedWriter(fw);
		br.write("Selenium java");
		br.write("12334");
		System.out.println("finished");
		br.close();

	}

}
