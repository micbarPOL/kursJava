package funkcje;

public class FunkcjeMatematyczne {

	static double poleKwadratu(double a) {
		return a * a;
	}

	static double poleProstokata(double a, double b) {
		return a * b;
	}

	static double obwodProstokata(double a, double b) {
		return (2 * a) + (2 * b);
	}

	static double poleKola(double r) {
		return Math.PI * Math.pow(r, 2);
	}

	public static void main(String[] args) {
		System.out.println(poleKola(5));

	}

}
