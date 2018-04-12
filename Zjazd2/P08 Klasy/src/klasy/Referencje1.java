package klasy;

import java.time.LocalDate;

public class Referencje1 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1985, 6, 30));
		Osoba ola = new Osoba("Ola", "Nowak", LocalDate.of(1995, 6, 10));

		Konto a = new Konto(ala, 1, 1000);
		Konto b = new Konto(ola, 2, 2000);
		a.setSaldo(112312);
		// program bedzie wypisywal to co jest w b. To nie znaczy ze zapisujemy obecny
		// stan obiektu b na obiekt c. Obiekt c bedzie mial zawsze aktualny stan obiektu
		// b
		Konto c = b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		b.wplata(100);
		System.out.println();
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		// teraz b ma wskazywac na ten sam obiekt co a
		// to znaczy zea i b beda wskazywac na ten sam obiekt
		// zmienna c bedzie wskazywac na drugi. Ten ktory wczesniej nalezal do b
		b = a;
		System.out.println();
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		c = null;
		// w takich sytuacjach mozna wywolac garbagfe collector. On natychmiast usunie
		// obiekty do ktorych nie ma odwolan. Oracle radzi tego nie uzywac. Java Virtual
		// Machine bedzie wiedziec kiedy ma usunac obiekty
		// System.gc();
		a = c;
		b = a;
		System.out.println();
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

}
