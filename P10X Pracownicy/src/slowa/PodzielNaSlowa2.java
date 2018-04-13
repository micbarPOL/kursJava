package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PodzielNaSlowa2 {

	public static void main(String[] args) {
		File plik = new File("pan-tadeusz.txt");
		int ileSlow = 0;
		try(Scanner sc = new Scanner(plik)){
			//domyslnym delimiterem jest ciag bialych znakow \\s
			//to zle rozwiazanie bo znaki interpunkcyjne sie doklejaja do slow
			//poza tym licza sie tez znaki interpunkcyjne otoczone spacjami
			
			//dlatego mozna podac zbior znakow ktore sa separatorami
			//Plus na koncu jest wazny bo oznacza ze ciag takich znakow to delimiter
			//sc.useDelimiter("[\\s,.!?()...]+");
			
			 // podejście 2: używamy "Unicode character classes" i mówimy "separatorem jest każdy znak, który nie jest literą"
            sc.useDelimiter("[^\\p{L}]+");
			while(sc.hasNext()) {
				ileSlow++;
				String slowo = sc.next();
				System.out.println(slowo);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ileSlow);

	}

}
