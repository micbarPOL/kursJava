package warunki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoMozeKupic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Ile masz lat?");
			int wiek = sc.nextInt();
			sc.close();

			int doKiedyKaszka = 5;
			int doKiedyCola = 17;
			int doKiedyBrowar = 65;

			if (wiek <= doKiedyKaszka) {
				System.out.println("Mozesz kupic kaszke");
			} else if (wiek <= doKiedyCola) {//po else if moze byc tylko jedna instrukcja! jesli chcesz wiecej to trzeba uzyc klamerek
				System.out.println("Mozesz kupic cole");
				System.out.println("Nie pij duzo coli!!!!!");
			} else if (wiek <= doKiedyBrowar) {
				System.out.println("Mozesz kupic piwo");
			} else {
				System.out.println("mozesz kupic biovital");
			}

		} catch (InputMismatchException e) {
			System.out.println("Zły format!!");
		}
	}

}
