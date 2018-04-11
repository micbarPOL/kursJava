package Swing.oknaProste;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Okno6 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Tytuł okna"); // tworzy puste okno z tytułem
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE to stala w klasie JFrame. Dlatego trzeba
																// wpisywac JFrame.EXIT_ON_CLOSE a nie tylko
																// EXIT_ON_CLOSE

		LayoutManager layout = new FlowLayout(); // zeby rozmiescic rozne komponenty w JFrame musimy dodac
													// LayoutManagera. Po tym jak jest Frame a przed tym jak dodajemy
													// komponenty
		// istnieje kilka klas dziedziczacych z LayoutManagera i wybieramy tego managera
		// ktorego chcemy uzyc
		
		// flow layout dziala tak ze elemnty beda plywac w miare jak rozciagamy i zmniejszamy okno
		
		okno.setLayout(layout); //dodaje LayoutManagera do okna

		JLabel tekst = new JLabel("Jakis tekst"); // tworze pierwszy komponent. To jest pole w ktore m,ozna wpisac tekst
													// albo dodac zdjecie
		okno.add(tekst); // do obiektu JFrame dodaje komponent
		tekst.setFont(new Font("Roboto", Font.BOLD, 52));// dodaje własciwosci czcionki na obiekcie JLabel
		tekst.setHorizontalAlignment(SwingConstants.CENTER);
		tekst.setForeground(Color.DARK_GRAY);
		okno.setSize(300, 300);
		// okno.pack(); // jesli chcemy zeby rozmiar ustawial sie sam w zaleznosci od
		// tego co jest w srodku

		JButton guzik = new JButton("Kliknij mnie");
		guzik.setFont(new Font("Roboto", Font.PLAIN, 32));

		okno.add(guzik);
		okno.setResizable(false); // blokuje uzytkownikowi mozliwosc rozciagania okna
		okno.setVisible(true); // mowi zeby okno bylo widoczne
	}

}
