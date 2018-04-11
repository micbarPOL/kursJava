package PracaDomowaPrzyklad;

import javax.swing.JOptionPane;

public class Szewc4 {

	public static void main(String[] args) {

		String dzienTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia [1-7], kiedy zlecono naprawę butów.");
		int dzien = Integer.parseInt(dzienTxt);

		String czasTxt = JOptionPane.showInputDialog("Ile dni ma trwać naprawa?");
		int czas = Integer.parseInt(czasTxt);

		int dzienOdbioru = dzien + czas;
		
		while(dzienOdbioru > 7) {
            dzienOdbioru -= 7;
        }

		String dzienOdbioruTxt = nazwaDniaTygodnia(dzienOdbioru);
		JOptionPane.showMessageDialog(null, "Buty do odbioru w dzien nr " + dzienOdbioruTxt);
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
		case 7:
			return "niedziela";
		default:
			return "niepoprawny numer";
		}
	}

}
