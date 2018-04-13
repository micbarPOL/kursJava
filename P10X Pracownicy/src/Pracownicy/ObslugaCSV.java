package Pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDate;
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

			System.out.println("Zaczynam odczyt");

			while (sc.hasNextLine()) {
				String linia = sc.nextLine();

				// split zwraca w wyniku tablice stringow (mozna to sprawdzic najezdzajac mysza
				// na split)
				String[] chunk = linia.split(";");
				LocalDate data = LocalDate.parse(chunk[4]);
				BigDecimal pensja = new BigDecimal(chunk[5]);
				Pracownik pracownik = new Pracownik(Integer.parseInt(chunk[0]), chunk[1], chunk[2], chunk[3], data,
						pensja, chunk[6], chunk[7], chunk[8], chunk[9]);
				listaPracownikow.add(pracownik);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return listaPracownikow;
	}
}
