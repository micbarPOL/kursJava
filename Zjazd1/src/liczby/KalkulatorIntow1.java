package liczby;

import java.util.Scanner;

public class KalkulatorIntow1 {
	
	static int oblicz(int arg1, int arg2, String dzialanie) {
		switch(dzialanie) {
		case "+" : return arg1 + arg2;
		case "-" : return arg1 - arg2;
		case "*" : return arg1 * arg2;
		case "/" : return arg1 / arg2;
		
		default  : return 0;
		}
	}

	public static void main(String[] args) {
		// Ta wersja nie kontroluje integer oveflow
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj działanie zgodnie z takim formatem:");
		System.out.println("liczba1 działanie liczba2");
		System.out.println("na przykład: 123 * 321");
		System.out.println("(spacje są potrzebne)");
		System.out.println();
		
		int x = sc.nextInt();
		String dzialanie = sc.next();
		int y = sc.nextInt();

		int wynik = oblicz(x, y, dzialanie);
		
		System.out.println("Wynik: " + wynik);
		sc.close();
	}

}
