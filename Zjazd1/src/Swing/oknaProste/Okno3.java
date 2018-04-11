package Swing.oknaProste;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Okno3 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Tytuł okna"); // tworzy puste okno z tytułem
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE to stala w klasie JFrame. Dlatego trzeba
																// wpisywac JFrame.EXIT_ON_CLOSE a nie tylko
																// EXIT_ON_CLOSE
		JLabel tekst = new JLabel("Jakis tekst"); // tworze pierwszy komponent. To jest pole w ktore m,ozna wpisac tekst
													// albo dodac zdjecie
		okno.add(tekst); // do obiektu JFrame dodaje komponent
		okno.setSize(300, 300);
		okno.setVisible(true); // mowi zeby okno bylo widoczne
	}

}
