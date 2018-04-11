package tydzien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DzienTygodnia2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer od 1 do 7");
		try {
			int dzien = sc.nextInt();
			sc.close();

			if (dzien == 1) {
				System.out.println("Ten dzien to Poniedzialek");
			} else if (dzien == 2) {
				System.out.println("Ten dzien to Wtorek");
			} else if (dzien == 3) {
				System.out.println("Ten dzien to Sroda");
			} else if (dzien == 4) {
				System.out.println("Ten dzien to Czwartek");
			} else if (dzien == 5) {
				System.out.println("Ten dzien to Piatek");
			} else if (dzien == 6) {
				System.out.println("Ten dzien to Sobota");
			} else if (dzien == 7) {
				System.out.println("Ten dzien to Niedziela");
			} else
				System.out.println("Niepoprawny numer tygodnia");

		} catch (InputMismatchException e) {
			System.out.println("Zły format!!");
		}
	}

}
