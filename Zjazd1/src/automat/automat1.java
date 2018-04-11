package automat;

import java.util.Scanner;

public class automat1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumaMonet = 0;
		int ileMusiszMiec = 10;
		while (sumaMonet < ileMusiszMiec) {
			System.out.println("wrzuc monete...");
			int moneta = sc.nextInt();
			sumaMonet += moneta; // sumaMonet = sumaMonet + moneta
			System.out.println("wrzuciles monete " + moneta + ". Suma monet wynosi: " + sumaMonet);

		}
		int reszta = sumaMonet - ileMusiszMiec;
		System.out.println("Koniec! Wrzuciles " + sumaMonet + "PLN. Twoja reszta: " + reszta + "PLN.");
		sc.close();
	}

}