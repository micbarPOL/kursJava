package okna.zdarzenia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Zdarzenia2 {

	private static final Font FONT_BOLD = new Font("Arial", Font.BOLD, 32);
	private static final Dimension MAXIMUM_SIZE = new Dimension(Integer.MAX_VALUE, 50);

	public static void main(String[] args) {
		JFrame okno = new JFrame("Programik");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Mój własny obiekt "panel" będzie wnętrzem okna.
		// To daje mi większą kontrolę nad formatowaniem itp.
		JPanel panel = new JPanel();
		okno.setContentPane(panel); // panel bedzie wnetrzem okna

		BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(layout);

		// empty border to w praktyce margines wokół czegoś
		// do zabawy - zobaczyć inne obramowania z fabryki
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JLabel pytanie = new JLabel("Jak masz na imię?");
		pytanie.setFont(new Font("Arial", Font.PLAIN, 32));
		panel.add(pytanie);

		// Dodajemy w tym miejscu odstęp o wysokości 15 px
		panel.add(Box.createRigidArea(new Dimension(0, 15)));

		JTextField pole = new JTextField();
		pole.setFont(FONT_BOLD);
		pole.setMaximumSize(MAXIMUM_SIZE);
		panel.add(pole);

		// Dodajemy w tym miejscu odstęp o wysokości 15 px
		panel.add(Box.createRigidArea(new Dimension(0, 15)));

		JButton guzik = new JButton("OK");
		guzik.setFont(FONT_BOLD);
		guzik.setMaximumSize(MAXIMUM_SIZE);
		panel.add(guzik);

		// W tym miejscu dodaję łącznik, który sam będzie się rozciągał
		panel.add(Box.createVerticalGlue());

		JLabel odpowiedz = new JLabel("Witaj");
		odpowiedz.setFont(FONT_BOLD);
		odpowiedz.setForeground(Color.RED);
		panel.add(odpowiedz);

		panel.add(Box.createVerticalGlue());

		// obsluga zdarzen. Musi byc na koncu programu bo wszystkie komponenty muszą byc
		// juz wyswietlone
		guzik.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println(pole.getText());
				odpowiedz.setText("Witaj " + pole.getText() + "!!!");
			}
		}); // dodaje action listener ktory przyjmuje Listenera i implementuje interfejs.
			// Implementuje interfejs w komendzie wywolania gotowego obiektu
		// Klasa jest anonimowa. Nie ma nazwy. Nie moze byc wywolana z innego miejsca
		// ale bedzie wywolywana stad
		// zaleta tego jest taka ze teraz mozemy swobodnie korzystac ze wszystkich
		// zmiennych klasy Zdarzenia2

		okno.pack();
		okno.setVisible(true);
	}

}
