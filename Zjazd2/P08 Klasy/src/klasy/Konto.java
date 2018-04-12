package klasy;

public class Konto {
	private int numer; 
	private int saldo;
	private Osoba wlasciciel;

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
	
	public int getNumer() {
		return numer;
	}
	
	public Osoba getWlasciciel() {
		return wlasciciel;
	}
	
	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int getSaldo() {
		return saldo;
	}
}
