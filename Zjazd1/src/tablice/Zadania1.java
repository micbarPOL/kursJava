package tablice;

/** zadanie: policz sume wszystkich elementów tablicy */
public class Zadania1 {

	static int sumaFor(int[] a) {
		int wynik = 0;
		for (int i = 0; i < a.length; i++) {
			wynik += a[i];
		}
		return wynik;
	}

	static int sumaForEach(int[] a) {
		int wynik = 0;
		for (int e : a) {
			wynik += e; // bo tutaj e oznacza sam element a nie indeks elementu. Wiec dodajemy elementy
						// a nie po indeksach
		}
		return wynik;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		System.out.println(sumaFor(a));
	}

}
