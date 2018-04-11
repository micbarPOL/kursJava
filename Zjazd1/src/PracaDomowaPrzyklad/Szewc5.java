package PracaDomowaPrzyklad;

import javax.swing.JOptionPane;

public class Szewc5 {

	public static void main(String[] args) {

		String dzienTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia [1-7], kiedy zlecono naprawę butów.");
		int dzien = Integer.parseInt(dzienTxt);

		String czasTxt = JOptionPane.showInputDialog("Ile dni ma trwać naprawa?");
		int czas = Integer.parseInt(czasTxt);

		int dzienOdbioru = dzien + czas;
		//to jest spoko dopoki liczba dni naprawy njie jest podzielna przez 7. Bo jak jest to reszta jest rowna 0
		dzienOdbioru = dzienOdbioru%7;

		String dzienOdbioruTxt = nazwaDniaTygodnia(dzienOdbioru);
		JOptionPane.showMessageDialog(null, "Buty do odbioru w dzien " + dzienOdbioruTxt);
	}

	static String nazwaDniaTygodnia(int numer) {
		switch (numer) {
		case 1:
			return "poniedziałek";
		case 2:
			return "wtorek";
		case 3:
			return "środa";
		case 4:
			return "czwartek";
		case 5:
			return "piątek";
		case 6:
			return "sobota";
			//0 dlatego ze reszta dzielenia nigdy nie wyjdzie 7. A jak wyjdzie 0 to znaczy ze reszta z dzielenia to 0
		case 0:
			return "niedziela";
		default:
			return "niepoprawny numer";
		}
	}

}
