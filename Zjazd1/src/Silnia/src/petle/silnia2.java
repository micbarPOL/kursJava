package petle;

public class silnia2 {
	
	static long silniaFor(int n) {
		
		long wynik = 1;
		for (int i = 1; i < n + 1; i++) {
			wynik = wynik * i;
		}
		
		return wynik;
	}

	public static void main(String[] args) {

		long wynik;
		int cyfra = 20;
		wynik = silniaFor(cyfra);
		System.out.println("Silnia dla " + cyfra + " to " +  wynik);

	}

}
