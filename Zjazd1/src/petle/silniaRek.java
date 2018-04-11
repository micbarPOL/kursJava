package petle;

public class silnia3 {
	
	static long silniaRek(int n) {
		
		if (n==1) {
			return 1;
		} else {
			return n*silniaRek(n-1); //funkcja wywoluje sama siebie. Jakby bylo n zamiast n - 1 to funkcja by dzialala w nieskonczonosc
		}
		
	}

	public static void main(String[] args) {

		long wynik;
		int cyfra = 20;
		wynik = silniaRek(cyfra);
		System.out.println("Silnia dla " + cyfra + " to " +  wynik);

	}

}
