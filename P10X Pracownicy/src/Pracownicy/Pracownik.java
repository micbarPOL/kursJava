package Pracownicy;

import java.time.LocalDate;

public class Pracownik {
	private int id;
	private String imie;
	private String nazwisko;
	private String stanowisko;
	private LocalDate dataZatrudnienia;
	private Double pensja;
	private String telefon;
	private String departament;
	private String adres;
	private String miasto;

	Pracownik() {

	}

	public Pracownik(int id, String imie, String nazwisko, String stanowisko, LocalDate dataZatrudnienia, Double pensja,
			String telefon, String departament, String adres, String miasto) {

		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.stanowisko = stanowisko;
		this.dataZatrudnienia = dataZatrudnienia;
		this.pensja = pensja;
		this.telefon = telefon;
		this.departament = departament;
		this.adres = adres;
		this.miasto = miasto;
	}

	@Override
	public String toString() {
		return "Pracownik o id: " + this.id + " imie: " + this.imie + " nazwisko " + nazwisko + " z departamentu: "
				+ departament;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	public LocalDate getDataZatrudnienia() {
		return dataZatrudnienia;
	}

	public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
		this.dataZatrudnienia = dataZatrudnienia;
	}

	public Double getPensja() {
		return pensja;
	}

	public void setPensja(Double pensja) {
		this.pensja = pensja;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


}
