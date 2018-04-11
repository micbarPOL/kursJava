package tydzien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DzienTygodnia4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer od 1 do 7");
		try {
			int dzien = sc.nextInt();
			String tekst;
			sc.close();
			
			switch (dzien) {
			case 1:
				tekst="Poniedzialek";
				break;
			case 2:
				tekst="Wtorek";
				break;
			case 3:
				tekst="Środa";
				break;
			case 4:
				tekst="Czwartek";
				break;
			case 5:
				tekst="Piatek";
				break;
			case 6:
				tekst="Sobota";
				break;
			case 7:
				tekst="Niedziela";
				break;

			default:
				tekst="Niepoprawny numer tygodnia";
			}
			
			System.out.println("Ten dzien to: " + tekst);
			
		} catch (InputMismatchException e) {
			System.out.println("Zły 6format!!");
		}
	}

}
