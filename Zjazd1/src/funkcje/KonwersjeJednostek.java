package funkcje;

public class KonwersjeJednostek {

	private static final double MileKm = 1.609344;

	/** Zwraca odleglosc w KM dla podanej odleglosci w milach */
	static double mileNaKm(double mile) {
		return mile * MileKm;
	}

	static double KmNaMile(double km) {
		return km / MileKm;
	}

	static double CNaF(double C) {
		// °F = (°C × (9/5)) + 32
		return (C * (9.0 / 5.0)) + 32;
	}

	static double FNaC(double F) {
		// °C = (9/5)* (°F -32)
		return (5.0 / 9.0) * (F - 32); // trzeba pisac 5.0 bo jakbysmy napisali 5/9 to wynik bylby 0. Dzielenie na
										// calkowitych obcina miejsca po przecinku
	}

	public static void main(String[] args) {
		System.out.println("Celcius na F " + CNaF(37));
		System.out.println("F na Celcius " + FNaC(100));

	}

}
