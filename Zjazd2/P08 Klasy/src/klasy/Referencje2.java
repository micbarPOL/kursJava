package klasy;

import java.time.LocalDate;

public class Referencje2 {

	static void metoda(Konto a, Konto b, Konto c, int x) {

		System.out.println();
		System.out.println("Po wejsciu du metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x = " + x);

		// metoda nie modyfikuje zmiennej innej metody
		// wiec w metodzie x sie zmieni
		// ale jak obiekt wyjdzie z metody to x wroci do poprzedniego stanu
		x += 13;

		// to sa zmiany obiektu. Kropka swiadczy o tym ze wchodzimy do obiektu i
		// zmieniamy cos w nim. Takie zmiany zmieniaja obiekt na stosie. To zostanie juz
		// a.wplata(44);
		// a.saldo += 33;

		// tu zmieniamy tylko referencje na stosie. Zmiany te znikna gdy wyjdziemy z
		// metody
		a = b;

		System.out.println();
		System.out.println("Na koncu metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x = " + x);
	}

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1985, 6, 30));
		Osoba ola = new Osoba("Ola", "Nowak", LocalDate.of(1995, 6, 10));

		ala.imie = "Alicja";

		Konto a = new Konto(ala, 1, 1000);
		Konto b = new Konto(ola, 2, 2000);
		// program bedzie wypisywal to co jest w b. To nie znaczy ze zapisujemy obecny
		// stan obiektu b na obiekt c. Obiekt c bedzie mial zawsze aktualny stan obiektu
		// b
		Konto c = b;
		int x = 5000;
		System.out.println();
		System.out.println("Na samym poczatku");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x = " + x);

		metoda(a, b, c, x);
		System.out.println();
		System.out.println("Po powrocie z metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x = " + x);

	}

}
