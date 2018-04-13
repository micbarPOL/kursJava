package Pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {

	public static List<Pracownik> odczytajZPliku(String sciezka) {

		// tworze liste pracownikow do ktorej bede dorzucal pracownikow
		List<Pracownik> listaPracownikow = new ArrayList<>();

		// trzeba utworzyc obiekt klasy file bo Scanner z niego korzysta.
		// daloby sie dac parametr string do Scnaerra ale wtedy by odczytał tego stringa
		// a nie zaden plik
		File plik = new File(sciezka);

		// jesli uzywam takiego try(deklaracja scannera) to nie musze na koncu pisac
		// sc.colse(). Jesli cos by bylo zle to scanner sam sie zamknie
		try (Scanner sc = new Scanner(plik)) {
			while (sc.hasNextLine()) {
				String linia = sc.nextLine();
				
				//split zwraca w wyniku tablice stringow (mozna to sprawdzic najezdzajac mysza na split)
				String[] chunk = linia.split(";");
				System.out.println(chunk[3]);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return listaPracownikow;
	}
}
