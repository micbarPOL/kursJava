package tablice;

public class Zadania2 {
	/** ma liczyc sume wszystkich liczb parzystych z tablicy */
	static int sumaParzystych(int[] tabl) {
		int sum = 0;
		for (int i = 0; i < tabl.length; i++) {
			if (tabl[i] % 2 == 0) {
				sum += tabl[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 2, 4, 13, 30 };
		int[] b = { 55, 44, 33, 22, 11 };
		int[] c = { -5, 5, 0, 2 };
		System.out.println(sumaParzystych(a));
		System.out.println(sumaParzystych(b));
		System.out.println(sumaParzystych(c));
	}

}
