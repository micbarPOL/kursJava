package Swing.oknaProste;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Okno4 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Tytuł okna"); // tworzy puste okno z tytułem
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE to stala w klasie JFrame. Dlatego trzeba
																// wpisywac JFrame.EXIT_ON_CLOSE a nie tylko
																// EXIT_ON_CLOSE
		JLabel tekst = new JLabel("Jakis tekst"); // tworze pierwszy komponent. To jest pole w ktore m,ozna wpisac tekst
													// albo dodac zdjecie
		okno.add(tekst); // do obiektu JFrame dodaje komponent
		tekst.setFont(new Font("Roboto", Font.BOLD, 52));// dodaje własciwosci czcionki na obiekcie JLabel
		tekst.setHorizontalAlignment(SwingConstants.CENTER);
		tekst.setForeground(Color.DARK_GRAY);
		okno.setSize(300, 300);
		// okno.pack(); // jesli chcemy zeby rozmiar ustawial sie sam w zaleznosci od
		// tego co jest w srodku
		okno.setResizable(false); //blokuje uzytkownikowi mozliwosc rozciagania okna
		okno.setVisible(true); // mowi zeby okno bylo widoczne
	}

}
