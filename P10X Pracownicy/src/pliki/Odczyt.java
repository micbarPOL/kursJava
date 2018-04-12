package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt {

	public static void main(String[] args) {
		String sciezka = "C:/Users/kurs/Desktop/plik1.txt";
		int i = 0;
		File plik = new File(sciezka);
		try(Scanner sc=new Scanner(plik)) {
		
			while(sc.hasNextLine()) {
				i++;
				String linia = sc.nextLine();
				System.out.println("linia " + i + ": " + linia);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie ma pliku...");
		}

	}

}
