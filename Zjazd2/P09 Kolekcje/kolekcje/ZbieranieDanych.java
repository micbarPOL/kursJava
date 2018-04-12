package kolekcje;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ZbieranieDanych {
    // w pętli pytać użytkownika za pomocą JOptionPane o kolejne napisy
    // te napisy dodawać do listy
    // przerwać kiedy użytkownik wciśnie Cancel        

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        while(true) {
            String napis = JOptionPane.showInputDialog("Podaj kolejny napis");
            if(napis == null) {
                break;
            }
            lista.add(napis);
        }
        
        System.out.println("Rozmiar listy: " + lista.size());
        System.out.println(lista);

        // sortowanie w sposób domyślny (wg kodów Unicode), zapis dostępny od "bardzo dawna"
        Collections.sort(lista);
        System.out.println(lista);
        
        // sortowanie wg alfabetu języka "ludzkiego"
        // wg bieżących ustawień językowych komputera
        Collections.sort(lista, Collator.getInstance());
        System.out.println(lista);

        // wg podanych "lokali"
        Collections.sort(lista, Collator.getInstance(Locale.FRANCE));
        System.out.println(lista);

        Collections.sort(lista, Collator.getInstance(new Locale("pl", "PL")));
        System.out.println(lista);

        // zapis dostepny od Javy 8:
        lista.sort(Collator.getInstance());
        System.out.println(lista);
        
	    //sortowanie lambdami. System porowna dlugosci wyrazow i posortuje po nich
        //pobiera dwa parametry (x,y), potem porównuje ilosc znakow i jesli jest dodatnia to je przestawia 
        lista.sort((x,y) -> x.length() - y.length());
        System.out.println(lista);
    }

}



