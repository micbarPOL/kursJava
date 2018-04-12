package klasy;

import java.time.LocalDate;

public class Student extends Osoba {

	private int rok;

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public String getKierunekStudiow() {
		return kierunekStudiow;
	}

	public void setKierunekStudiow(String kierunekStudiow) {
		this.kierunekStudiow = kierunekStudiow;
	}

	private String kierunekStudiow;

	Student(String imie, String nazwisko, LocalDate dataUrodzenia, int rok, String kierunekStudiow) {
		super(imie, nazwisko, dataUrodzenia);
		this.rok = rok;
		this.kierunekStudiow = kierunekStudiow;
	}

	Student() {
		super();
	}

	public String toString() {
		// jesli chce do tego jak sie wypisywala osoba dopisac cos jesli wypisuje
		// studenta to moge to zrobic super.toString()
		//mozna tez wywolac na sobie metody get() no getImie()
		return super.toString() + " student " + rok + " roku kierunku " + kierunekStudiow;
	}
	String kimJestes() {
		return "Jestem Studentem";
	}
}
