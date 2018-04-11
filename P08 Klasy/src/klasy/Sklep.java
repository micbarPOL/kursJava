package klasy;

public class Sklep {

	static void zakupy (Osoba klient) {
			if (klient.wiek() >17) {
				System.out.println(klient.imie + ". Moze kupic piwo");
			} else {
				System.out.println(klient.imie + ". Nie moze kupic piwa");
			}
		}
}
