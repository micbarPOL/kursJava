package PracaDomowaPrzyklad;

import javax.swing.JOptionPane;

public class Szewc1 {

	public static void main(String[] args) {
		
		String dzienTxt = JOptionPane.showInputDialog(
	            "Podaj numer dnia tygodnia [1-7], kiedy zlecono naprawę butów.");
	        int dzien = Integer.parseInt(dzienTxt);
	        
	        String czasTxt = JOptionPane.showInputDialog(
	                "Ile dni ma trwać naprawa?");
	        int czas = Integer.parseInt(czasTxt);
	        
	        int dzienOdbioru = dzien + czas;
	     //nie dziala jesli czas naprawy jest dluzszy niz 7 dni   
	        JOptionPane.showMessageDialog(null, "Buty do odbioru w dzien nr " + dzienOdbioru);
	}

}
