package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PoliczSlowa1 {

	public static void main(String[] args) {
		File plik = new File("pan-tadeusz.txt");
		Map<String, Integer> slowa = new HashMap<>();

		try (Scanner sc = new Scanner(plik)) {
			// domyslnym delimiterem jest ciag bialych znakow \\s
			// to zle rozwiazanie bo znaki interpunkcyjne sie doklejaja do slow
			// poza tym licza sie tez znaki interpunkcyjne otoczone spacjami

			// dlatego mozna podac zbior znakow ktore sa separatorami
			// Plus na koncu jest wazny bo oznacza ze ciag takich znakow to delimiter
			// sc.useDelimiter("[\\s,.!?()...]+");

			// podejście 2: używamy "Unicode character classes" i mówimy "separatorem jest
			// każdy znak, który nie jest literą"
			sc.useDelimiter("[^\\p{L}]+");
			while (sc.hasNext()) {
				
				String slowo = sc.next();

				if (!slowa.containsKey(slowo)) {
					// to slowo jeszcze nie wystepowalo
					slowa.put(slowo, 1);
				} else {
					// to slowo juz wystepowalo zwiekszamy zapamietana wartosc
					int ileBylo = slowa.get(slowo);
					slowa.put(slowo, ileBylo + 1);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Entry<String, Integer> entry : slowa.entrySet()) {
			System.out.println(entry);
		}

	}

}
