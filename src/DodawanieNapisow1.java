
public class DodawanieNapisow1 {

	public static void main(String[] args) {
		System.out.println(kolejneLiczby(24));
	}

	static String kolejneLiczby(int n) {
		String wartosc = "";
		for (int i = 0; i<=n; i++) {
			wartosc += i;
			wartosc += " ";
		}
		return wartosc;
	}

}
