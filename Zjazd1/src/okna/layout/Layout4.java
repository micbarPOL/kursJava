package okna.layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layout4 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Programik");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Mój własny obiekt "panel" będzie wnętrzem okna.
		// To daje mi większą kontrolę nad formatowaniem itp.
		JPanel panel = new JPanel();
		okno.setContentPane(panel);
		
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
		pole.setFont(new Font("Arial", Font.BOLD, 32));
		pole.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
		panel.add(pole);
		
		// Dodajemy w tym miejscu odstęp o wysokości 15 px
		panel.add(Box.createRigidArea(new Dimension(0, 15)));

		JButton guzik = new JButton("OK");
		guzik.setFont(new Font("Arial", Font.BOLD, 32));
		guzik.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
		panel.add(guzik);
		
		// W tym miejscu dodaję łącznik, który sam będzie się rozciągał
		panel.add(Box.createVerticalGlue());

		JLabel odpowiedz = new JLabel("Witaj");
		odpowiedz.setFont(new Font("Arial", Font.BOLD, 32));
		odpowiedz.setForeground(Color.RED);
		panel.add(odpowiedz);

		panel.add(Box.createVerticalGlue());

		okno.pack();
		okno.setVisible(true);
	}

}
