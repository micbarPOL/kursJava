package Swing.oknaProste;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Okno5 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Tytuł okna"); // tworzy puste okno z tytułem
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE to stala w klasie JFrame. Dlatego trzeba
																// wpisywac JFrame.EXIT_ON_CLOSE a nie tylko
																// EXIT_ON_CLOSE
		JLabel tekst = new JLabel("Jakis tekst"); // tworze pierwszy komponent. To jest pole w ktore m,ozna wpisac tekst
													// albo dodac zdjecie
		okno.add(tekst); // do obiektu JFrame dodaje komponent
		tekst.setFont(new Font("Roboto", Font.BOLD, 52));// dodaje własciwosci czcionki na obiekcie JLabel
		tekst.setHorizontalAlignment(SwingConstants.CENTER); // tu uzywa sie stalej z klasy SwingConstants
		tekst.setForeground(Color.DARK_GRAY); // tu uzywa sie stałej z klasy Color
		okno.setSize(300, 300);
		// okno.pack(); // jesli chcemy zeby rozmiar ustawial sie sam w zaleznosci od
		// tego co jest w srodku

		// Color kolor = Color.YELLOW; //tu uzywam koloru ktory juz jest zdefiniowany w
		// tej klasie

		Color kolor = new Color(0xFFFF00); // teraz uzywam kon struktora czyli sam tworze kolor w tej klasie
		// trzy liczby float od 0 do 1. Trzy bo format RGB (red, green,blue)
		// musza byc float wiec nie moge napisac 0.5 (to bylby double) musze napisac
		// 0.5F i wtedy to jest Float
		// mozna tez uzyc konstruktora z trzeba intami od 0 do 255
		// mozna tez podac jedna liczbe w systemie szestnastkowym w ktorej po dwie cyfry
		// oznaczaja kazda barwe 0xRRGGBB analogia do zapisu w CSSie
		// np 0xFFFF00 znaczy ze czerwony i zielony ma swiecic najjasniej a niebieski w ogole

		tekst.setBackground(kolor); // ustawiam tło do JLabel. Mozna tez
		// tekst.setBackground(Color.YELLOW);

		// to nie dziala bo label domyslnie ma wlaczona przezroczystosc
		tekst.setOpaque(true); // teraz JLabel nie jest przezroczysty
		okno.setResizable(false); // blokuje uzytkownikowi mozliwosc rozciagania okna
		okno.setVisible(true); // mowi zeby okno bylo widoczne
	}

}
