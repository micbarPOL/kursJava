package klasy;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	// Trzy rownowazne nazwy
	// pola(field), atrybuty(atributes), zmienne instancyjne(instance variables)
	String imie, nazwisko;
	// pamietanie wieku jest slabe bo wiek sie zmienia. Lepiej pamietac date
	// urodzenia i dopisac klase ktora wyliczy wiek
	LocalDate dataUrodzenia;

	// konstruktory - specjalne wersje metod uruchamiane przy tworzeniu obiektu
	// jesli juz chcemy robic konstruktory ale dalej uzywac jednego bez parametrow
	// to musimy go i tak napisac bo juz nie ma domyslnych
	Osoba() {

	}

	Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}

	// gdyby bylo slowo static to nie daloby sie tego zrobic bo nie wiadomo dla
	// ktorego obiektu wywolujemy te metode
	// dzialalby jesli wczesniej zdefiniowaloby sie imie i nazwisko (w tej klasie)
	// ale wtedy caly czas wypisywaloby sie to samo imie i naziwko niezaleznie od
	// tego dla ktorej osoby bysmy wywolywali
	void przedstawSie() {
		System.out.println("Nazywam sie " + this.imie + " " + this.nazwisko + " i mam " + this.wiek() + " lat.");
	}

	String przedstawSieZwroc() {
		return "Nazywam sie " + this.imie + " " + this.nazwisko + " i mam " + this.wiek() + " lat.";
	}

	// teraz nadpisujemy metode toString. Dzieki temu jesli zrobimy
	// System.out.println(obiekt) to wypisze sie to co jest w tej metodzie
	// gdybysmy tego nie zrobili to wypisywalby sie szestnastkowy hash
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek() + " l.)";
	}

	int wiek() {
		Period czasZycia = Period.between(dataUrodzenia, LocalDate.now());
		return czasZycia.getYears();
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	String kimJestes() {
		return "Jestem Osobą";
	}
}
