package tydzien;

import java.util.Scanner;

public class DzienTygodnia5 {

	static String ktoryDzien(int numer) {
		switch (numer) {
		case 1:
			return "poniedzialek";
		case 2:
			return "wtorek";
		case 3:
			return "środa";
		case 4:
			return "czwartek";
		case 5:
			return "piatek";
		case 6:
			return "sobota";
		case 7:
			return "niedziela";
		default:
			throw new IllegalArgumentException("Numer dnia tygodnia: " + numer + " poza zakresem");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer od 1 do 7");
		try {
			int dzien = sc.nextInt();
			sc.close();

			String dzienTygodnia = ktoryDzien(dzien);
			System.out.println("ten dzien to: " + dzienTygodnia);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
