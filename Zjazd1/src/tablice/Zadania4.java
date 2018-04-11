package tablice;

/** znajdowanie najwiekszego elementu w tablicy */
public class Zadania4 {

	static Integer wybierzNajwieksza(int[] t) { // Integer moze byc nullem. Jesli wynik moze byc nullem to zamiast int
												// stosujemy Integera i dziala. Null oznacza brak obiektu. Integer jest
												// obiektem wiec moze przyjmowac wartosc null;
		if (t.length != 0) {
			int a = t[0]; // mozna tez wpisac Integer.MIN_VALUE co znaczy minus nieskonczonosc. Kazda
							// liczba bedzie wieksza od tej wiec nawet jak w tablicy sa bardzo male to
							// programix bedzie dzialal
			for (int i = 1; i < t.length; i++) {
				if (t[i] > a) {
					a = t[i];
				}
			}
			return a;
		} else
			System.out.println("Tablica jest pusta!!");
		return null;
	}

	public static void main(String[] args) {
		int[] a = { 42, 12, 12, 32, -1, 9, 827, 0, 53 };
		System.out.println(wybierzNajwieksza(a));
	}

}
