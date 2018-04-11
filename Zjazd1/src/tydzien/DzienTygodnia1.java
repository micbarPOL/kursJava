 package tydzien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DzienTygodnia1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		String[] dniTygodnia = {"Mon","Tue","Wed", "Thu", "Fri", "Sat", "Sun"};
		System.out.println("Podaj numer od 1 do 7");
		
		int dzien = sc.nextInt();
		sc.close();
		if (dzien < 1 || dzien>7) {
			System.out.println("Zły numer dnia tygodnia!");
		} else
			
		System.out.println(dniTygodnia[dzien-1]);
		
		}catch (InputMismatchException e) {
			System.out.println("Zły format!!");
	}
	}

}
