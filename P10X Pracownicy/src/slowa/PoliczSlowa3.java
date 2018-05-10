package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PoliczSlowa3 {

	public static void main(String[] args) {
		File plik = new File("pan-tadeusz.txt");
		// zmieniam z hashmap na treemap i slowa sa posortowane prawie alfabetycznie (unicode)
		Map<String, Integer> slowa = new TreeMap<>();
		// TreeMap z Collatorem bedzie ukladal alfabetycznie ale bedzie dzialal duzo
		// wolniej
		//Map<String, Integer> slowa = new TreeMap<>(Collator.getInstance());
		// LinkedHashMap polaczenie HashMapy (szybko wyszukuje) + zapamietuje kolejnosc
		// w jakiej slowa byly dodawane
		// Map<String, Integer> slowa = new LinkedHashMap<>();
		
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
		
		//sortowanie po ilosci slow
		//trzeba skonwertowac mape na liste bo mapy nie da sie posortowac. To nie my ustalamy kolejnosc danych w mapie
		// tworzę listę par (klucz, wartość), czyli listę entries
        List<Entry<String, Integer>> lista = new ArrayList<>(slowa.entrySet());
        
        // sortuję po wartościach
        lista.sort((e1, e2) -> e1.getValue() - e2.getValue());
        // inny zapis:
        // lista.sort(Entry.comparingByValue());
        
        System.out.println("Słowa:");
        for(Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Różnych słów: " + slowa.size());
		}

	}
