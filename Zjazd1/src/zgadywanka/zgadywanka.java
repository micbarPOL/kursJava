package zgadywanka;

import java.util.Scanner;

public class zgadywanka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Program sprawdzi jak sobie radzisz z tabliczką mnożenia.");
		System.out.println("W jakim zakresie chcesz sie sprawdzic? Podaj minimum i maximum.");
		System.out.println("Podaj dolną granicę");

		int min = sc.nextInt();

		System.out.println("Podaj górną granicę");

		int max = sc.nextInt();
		
		int zakres = (max - min) + 1;
		int x = (int)(Math.random() * zakres) + min;
		int y = (int)(Math.random() * zakres) + min;
		int wynik = x * y;
		int wynikUzytkownika = -991;

		System.out.println("Ile to jest " + x + " x " + y + " ? (napisz 07 jesli chcesz podpowiedz)");

		Boolean warunek = wynikUzytkownika == wynik;

		while (!warunek) {
			wynikUzytkownika = sc.nextInt();
			warunek = wynikUzytkownika == wynik;
			if (warunek) {
				System.out.println("Brawo!!!");
				break;
			}
			if (wynikUzytkownika == 07) {
				String podpowiedz = Integer.toString(wynik).substring(0, 1);
				System.out.println("Pierwsza cyfra to: " + podpowiedz);
				System.out.println("Próbuj dalej!");
			} else
				System.out.println("Nieprawidłowa odpowiedz. Probuj dalej");
		}
		sc.close();
	}

}
