package PracaDomowaPrzyklad;

import javax.swing.JOptionPane;

public class Szewc3 {

	public static void main(String[] args) {

		String dzienTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia [1-7], kiedy zlecono naprawę butów.");
		int dzien = Integer.parseInt(dzienTxt);

		String czasTxt = JOptionPane.showInputDialog("Ile dni ma trwać naprawa?");
		int czas = Integer.parseInt(czasTxt);

		// nie dziala jesli czas naprawy jest dluzszy niz 14 dni
		int dzienOdbioru = dzien + czas;
		
		String dzienOdbioruTxt = nazwaDniaTygodnia(dzienOdbioru);
		JOptionPane.showMessageDialog(null, "Buty do odbioru w dzien nr " + dzienOdbioruTxt);
	}

	static String nazwaDniaTygodnia(int numer) {
        switch(numer) {
        case 1: case 8: return "poniedziałek";
        case 2: case 9: return "wtorek";
        case 3: case 10: return "środa";
        case 4: case 11: return "czwartek";
        case 5: case 12: return "piątek";
        case 6: case 13: return "sobota";
        case 7: case 14: return "niedziela";
        default: return "niepoprawny numer";
        }
	}

}
