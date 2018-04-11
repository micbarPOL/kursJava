package liczby;

import java.util.Scanner;

public class KalkulatorIntow2 {
	
	static int oblicz(int arg1, int arg2, String dzialanie) {
		switch(dzialanie) {
		// te metody z nazwą exact zwracają normalny wynik jeśli jest poprawny, a wyrzucają wyjątek jeśli miałby nastąpić overflow
		case "+" : return Math.addExact(arg1, arg2);
		case "-" : return Math.subtractExact(arg1, arg2);
		case "*" : return Math.multiplyExact(arg1, arg2);
		case "/" : return arg1 / arg2;
		
		default  : return 0;
		}
	}

	public static void main(String[] args) {
		// Ta wersja sprawdza czy nie nastapił integer overflow i w razie tego wypisuje komunikat o błędzie zamiast wyniku
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj działanie zgodnie z takim formatem:");
		System.out.println("liczba1 działanie liczba2");
		System.out.println("na przykład: 123 * 321");
		System.out.println("(spacje są potrzebne)");
		System.out.println();
		
		try {
			int x = sc.nextInt();
			String dzialanie = sc.next();
			int y = sc.nextInt();

			int wynik = oblicz(x, y, dzialanie);
			System.out.println("Wynik: " + wynik);
		} catch (ArithmeticException e) {
			System.out.println("Błąd obliczeń: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Inny błąd: " + e);
		}
		sc.close();
	}
}
