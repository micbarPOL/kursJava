package tablice;

import java.util.Arrays;

public class PodstawyTablic2 {

	public static void main(String[] args) {
		// tworzenie z podaniem poczatkowej wartosci
		String imiona[] = { "Maciusior", "Zuzior", "Misior" };
		int[] liczby = { 1, 4, 2, 5, 6, 2, 9, 6, 7, 8, 0, 6 };

		// dwa sposoby przechodzenia przez tablice
		// "for-each": tylko do odczytu
		for (String imie : imiona) {
			System.out.println(imie);
		}

		// tradycyjna petla for
		for (int i = 0; i < liczby.length; i++) {
			System.out.println(liczby[i]);
		}
		// mnozymy wszystkie wyrazy tablicy przez 2
		for (int i = 0; i < liczby.length; i++) {
			liczby[i] *= 2;
		}

		System.out.println(Arrays.toString(liczby));
	}

}
