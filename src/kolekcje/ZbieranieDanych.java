package kolekcje;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
public class ZbieranieDanych {

	public static void main(String[] args) {
		String napis = "";
		List<String> listaImion = new ArrayList<>();
		
		
		while (napis != null) {
			napis = JOptionPane.showInputDialog("Podaj imie");
			listaImion.add(napis);
		} 
		
		listaImion.remove(null);
		System.out.println("Rozmiar listy: " + listaImion.size());
		System.out.println(listaImion);
		Collections.sort(listaImion);
		System.out.println(listaImion);
	}

}
