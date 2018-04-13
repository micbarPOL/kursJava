package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PodzielNaSlowa1 {

	public static void main(String[] args) {
		File plik = new File("pan-tadeusz.txt");
		int ileSlow = 0;
		try(Scanner sc = new Scanner(plik)){
			while(sc.hasNext()) {
				ileSlow++;
				String slowo = sc.next();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ileSlow);

	}

}
