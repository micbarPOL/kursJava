package Pracownicy;

import java.util.List;

public class TestOdczytu {

	public static void main(String[] args) {

		System.out.println("Zaczynamy wczytywac...");
		List<Pracownik> lista = ObslugaCSV.odczytajZPliku("pracownicy.csv");

		System.out.println("Wczytano " + lista.size() + " pracownikow.");

		for (Pracownik pracownik : lista) {
			System.out.println(pracownik);
		}
		System.out.println("KONIEC");
	}

}
