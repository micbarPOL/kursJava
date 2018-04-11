package petle;

public class sumowanie {

	public static int suma(int n) {
		int wynik = 0;
		for (int i = 1; i <= n; i++) {
			wynik += i;
		}
		return wynik;
	}

	/** suma n liczb nieparzystych rowna sie n^2 */
	public static int sumaNieparzystych(int n) {
		int wynik = 0;
		for (int i = 1; i <= 2 * n; i++) // mozna tez napisac i+=2 i wtedy bez if
			if (i % 2 == 1) {
				wynik += i;
				System.out.println(i);
			}
		return wynik;

	}

	public static void main(String[] args) {
		// System.out.println(sumaNieparzystych(1));
		// System.out.println(sumaNieparzystych(2));
		// System.out.println(sumaNieparzystych(3));
		System.out.println("Suma to: " + sumaNieparzystych(10));

	}

}
