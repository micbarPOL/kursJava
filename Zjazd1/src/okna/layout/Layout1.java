package okna.layout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Layout1 {

	public static void main(String[] args) {
		JFrame okno = new JFrame();		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(800, 600);
		
		// layout jest odpowiedzialny za rozmieszczenie komponentów wewnątrz okna
		FlowLayout layout = new FlowLayout();
		okno.setLayout(layout);
		
		JLabel napis = new JLabel("Pozdrowienia z Warszawy");
		napis.setOpaque(true);
		napis.setBackground(Color.PINK);
		napis.setForeground(Color.BLUE);
		napis.setFont(new Font("Arial", Font.BOLD, 36));
		napis.setHorizontalAlignment( SwingConstants.CENTER );		
		okno.add(napis);
		
		JButton guzik = new JButton("Kliknij mnie");
		guzik.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		okno.add(guzik);
		
		JButton guzik2 = new JButton("Kliknij mnie");
		guzik2.setFont(new Font("Dejavu Sans", Font.BOLD, 28));
		guzik2.setForeground(Color.RED);
		okno.add(guzik2);
		
		JLabel tekst2 = new JLabel("Dzisiaj jest " + LocalDate.now());
		tekst2.setFont(new Font("Comic Sans", Font.BOLD, 40));
		tekst2.setForeground(Color.MAGENTA);
		okno.add(tekst2);
		
		okno.setVisible(true);
	}
}
