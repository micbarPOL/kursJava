package Pracownicy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SredniaPensjaPerStanowisk {

	public static void main(String[] args) {

		// TODO napisac slownik ktory bedie gromadzil srednia place dla kazdego dzialu
		List<Pracownik> lista = ObslugaCSV.odczytajZPliku("pracownicy.csv");

		int sumaPracownikow = 1;
		Map<String, BigDecimal> listaSrednich = new TreeMap<>();
		Map<String, Integer> iloscPracownikow = new TreeMap<>();

		for (Pracownik pracownik : lista) {

			// lepiej byloby if(!listaPracownikow.containsKey(pracownik.getDepartment()))
			// na poczatku jest ! bo ten if daje true jesli pracownik juz jest
			String departament = pracownik.getDepartament();
			if (listaSrednich.get(departament) == null) {
				listaSrednich.put(departament, pracownik.getPensja());
				iloscPracownikow.put(departament, sumaPracownikow);
			} else {
				listaSrednich.put(departament,
						listaSrednich.get(departament).add(pracownik.getPensja()));
				iloscPracownikow.put(departament, iloscPracownikow.get(departament) + 1);
			}
		}
		// petla po wsztstkich kluczach z mapy
		for (String department : iloscPracownikow.keySet()) {
			listaSrednich.put(department, listaSrednich.get(department)
					.divide(BigDecimal.valueOf(iloscPracownikow.get(department)), 2, RoundingMode.HALF_DOWN));
			// formatowanie przy printowaniu
			System.out.printf("%21s : %9s\n", department, listaSrednich.get(department));
		}

	}

}
