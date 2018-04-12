package klasy;

public class Konto {
	int numer, saldo;
	Osoba wlasciciel;

	Konto(Osoba wlasciciel, int numer, int saldo) {
		this.wlasciciel = wlasciciel;
		this.numer = numer;
		this.saldo = saldo;
	}

	public String toString() {
		return "Konto osoby: " + this.wlasciciel + " o numerze: " + this.numer + " ma saldo: " + saldo + "PLN.";
	}

	void wplata(int kwota) {
		this.saldo += kwota;
	}

	void wyplata(int kwota) {
		this.saldo -= kwota;
	}

	// przelew zabiera jednej instancji klasy Konto (temu ktory wykonuje metode) i
	// dodaje drugiemu (temu ktory jest parametrem metody)
	void przelew(Konto odbiorca, int kwota) {
		this.saldo -= kwota;
		odbiorca.saldo += kwota;
	}
}
