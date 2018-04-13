package Pracownicy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class SredniaPensjaProgramistow {

	public static void main(String[] args) {

		BigDecimal sumaPensji = new BigDecimal(0);
		BigDecimal srednia = new BigDecimal(0);

		// tworze liste pracownikow na ktora wpisuje liste pracownikow stworzona przez
		// klase ObslugaCSV
		List<Pracownik> lista = ObslugaCSV.odczytajZPliku("pracownicy.csv");

		int sumaPracownikow = 0;

		for (Pracownik pracownik : lista) {

			// Stringow nie mozna porownywac uzywajac "=="! wiec trzeba uzyc metody equals
			if (pracownik.getStanowisko().equals("Programmer")) {
				sumaPracownikow++;
				sumaPensji = sumaPensji.add(pracownik.getPensja());
			}
		}

		// dzielenie big decimali nie przyjmuje inta jako dzielnik wiec trzeba sparsowac
		// do bigdecimala
		if (sumaPracownikow != 0) {
			srednia = sumaPensji.divide(BigDecimal.valueOf(sumaPracownikow), 2, RoundingMode.HALF_DOWN);
			System.out.println("Srednia pensja programistow to: " + srednia);
		}

		else {
			System.out.println("Nie ma takich pracownikow");
		}

	}

}
