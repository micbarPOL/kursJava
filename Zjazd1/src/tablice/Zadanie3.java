package tablice;

/** Zwraca liczbe Fibbonachiego dla zadanej liczby */

public class Zadanie3 {

	static long ciagFibonacciego(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			long[] ciagFibonacciego = new long[n + 1];
			ciagFibonacciego[0] = 0;
			ciagFibonacciego[1] = 1;
			for (int i = 2; i < ciagFibonacciego.length; i++) {
				ciagFibonacciego[i] = ciagFibonacciego[i - 2] + ciagFibonacciego[i - 1];
			}
			// return ciagFibonacciego(n - 2) + ciagFibonacciego(n - 1);
			// System.out.println(Arrays.toString(ciagFibonacciego));
			return ciagFibonacciego[n];
		}

	}

	static long ciagFibonacciego2(int n) {
		// pamiętamy dwie poprzednie liczby - dzięki temu nie zużywamy dodatowej pamięci
		// na tablicę

		long poprzednia = 1;
		long wynik = 0;

		for (int i = 1; i <= n; i++) {
			long nowa = poprzednia + wynik;
			poprzednia = wynik;
			wynik = nowa;
		}
		return wynik;

	}

	public static void main(String[] args) {
		int[] n = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 36, 49, 57, 65, 100 };
		for (int i : n) {
			System.out.println("Dla liczby " + i + " liczba Fibbonachiego to " + ciagFibonacciego(i));
		}
		System.out.println();
		for (int i : n) {
			System.out.println("Dla liczby " + i + " liczba Fibbonachiego to " + ciagFibonacciego2(i));
		}
	}

}
