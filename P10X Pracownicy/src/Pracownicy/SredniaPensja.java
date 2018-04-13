package Pracownicy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class SredniaPensja {

	public static void main(String[] args) {

		BigDecimal sumaPensji = new BigDecimal(0);
		BigDecimal srednia = new BigDecimal(0);

		List<Pracownik> lista = ObslugaCSV.odczytajZPliku("pracownicy.csv");

		int sumaPracownikow = 0;

		for (Pracownik pracownik : lista) {
			sumaPracownikow++;
			sumaPensji = sumaPensji.add(pracownik.getPensja());
		}

		// dzielenie big decimali nie przyjmuje inta jako dzielnik wiec trzeba sparsowac do bigdecimala
		srednia = sumaPensji.divide(BigDecimal.valueOf(sumaPracownikow), 2, RoundingMode.HALF_DOWN);
		System.out.println(srednia);

	}

}
