package klasy;

import java.time.LocalDate;

//jesli metoda jest static to moge z niej korzystac bez tworzenia obiektu klasy w ktorej sie ona znajduje
//jesli metoda jest static to nie musze tworzyc obiektu tylko moge uzyc danej metody odnoszac sie do klasy

//slowo static oznacza ze metoda jest wlasnoscia klasy a nie obiektu
//bez static jest wlasnoscia obiektu wiec mozna tylko na obiekcie

//jezeli chcemy wywolac metode ktora nie jest static (np zakupy w klasie Sklep) to trzeba stworzyc obiekt
//Sklep sklep = new Sklep();
//a potem wywolac metode
//sklep.zakupy(zuzior);
public class Przyklad1 {

	public static void main(String[] args) {
		// tworze zmienna i do tej zmiennej przypisuje obiekt
		Osoba zuzior = new Osoba("Zuziorex", "XXX", LocalDate.of(1991, 3, 17));
		Osoba maciek = new Osoba("Maciek", "YYY", LocalDate.parse("2016-04-10"));
		
		System.out.println(zuzior.imie);
		zuzior.przedstawSie();
		Sklep.zakupy(zuzior);
		
		System.out.println(); 
		
		System.out.println(maciek.imie);
		Sklep.zakupy(maciek);

	}

}
