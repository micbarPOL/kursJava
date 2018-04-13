package kolekcje;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ZbieranieDanychSet {
	// w pętli pytać użytkownika za pomocą JOptionPane o kolejne napisy
	// te napisy dodawać do listy
	// przerwać kiedy użytkownik wciśnie Cancel

	public static void main(String[] args) {

		// dla osoby (imienia) chcemy zapamietac ile ta osoba ma lat
		// mozna uzywac tylkko typów obiektowych wiec trzeba uzyc Integer
		Map<String, Integer> dane = new HashMap<>();

		while (true) {
			String imie = JOptionPane.showInputDialog("Podaj kolejny napis");
			if (imie == null) {
				break;
			}
			int wiek = Integer.parseInt(JOptionPane.showInputDialog("Ile lat ma " + imie));
			dane.put(imie, wiek);
		}

		System.out.println("Rozmiar listy: " + dane.size());
		System.out.println(dane);

		while (true) {
			String imie = JOptionPane.showInputDialog("Czyj wiek chcesz sprawdzic?");
			if (imie == null) {
				break;
			}
			Integer wiekOdczytany = dane.get(imie);

			if (wiekOdczytany == null) {
				JOptionPane.showMessageDialog(null, "Nie ma takiej osoby!!!");
			} else {
				JOptionPane.showMessageDialog(null, "Ta osoba ma " + wiekOdczytany + " lat.");
			}
		}
	}

}