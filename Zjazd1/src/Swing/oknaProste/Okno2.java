package Swing.oknaProste;

import javax.swing.JFrame;

public class Okno2 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Tytuł okna"); // tworzy puste okno z tytułem
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE to stala w klasie JFrame. Dlatego trzeba
																// wpisywac JFrame.EXIT_ON_CLOSE a nie tylko
																// EXIT_ON_CLOSE
		okno.setSize(300, 300);
		okno.setVisible(true); // mowi zeby okno bylo widoczne
	}

}
