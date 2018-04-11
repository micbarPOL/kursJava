package Swing.oknaProste;

import javax.swing.JFrame;

public class Okno01 {

	public static void main(String[] args) {
		JFrame okno = new JFrame(); // tworzy puste okno
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE to stala w klasie JFrame. Dlatego trzeba
																// wpisywac JFrame.EXIT_ON_CLOSE a nie tylko
																// EXIT_ON_CLOSE
		okno.setVisible(true); // mowi zeby okno bylo widoczne
	}

}
