package klasy;

import java.time.LocalDate;

public class PrzykladKontaPrzelew {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1991, 3, 17));
		Konto kontoAli = new Konto(ala, 93288827, 100);
		Osoba ola = new Osoba("Ola", "Nowak", LocalDate.of(2016, 4, 10));
		Konto kontoOli = new Konto(ola, 982881, 100);

		System.out.println("Przed przelewem:");
		System.out.println(kontoAli);
		System.out.println(kontoOli);

		kontoAli.przelew(kontoOli, 45);

		System.out.println();
		System.out.println("Po przelewie");
		System.out.println(kontoAli);
		System.out.println(kontoOli);
	}

}
