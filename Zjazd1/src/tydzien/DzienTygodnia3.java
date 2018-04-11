package tydzien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DzienTygodnia3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer od 1 do 7");
		try {
			int dzien = sc.nextInt();
			sc.close();

			switch (dzien) {
			case 1:
				System.out.println("Ten dzien to Poniedzialek");
				break;
			case 2:
				System.out.println("Ten dzien to Wtorek");
				break;
			case 3:
				System.out.println("Ten dzien to Środa");
				break;
			case 4:
				System.out.println("Ten dzien to Czwartek");
				break;
			case 5:
				System.out.println("Ten dzien to Piatek");
				break;
			case 6: case 7:
				System.out.println("Weekend!");
				break;

			default:
				System.out.println("Niepoprawny numer tygodnia");
			}
		} catch (InputMismatchException e) {
			System.out.println("Zły format!!");
		}
	}

}
