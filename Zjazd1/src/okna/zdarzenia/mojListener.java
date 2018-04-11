package okna.zdarzenia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mojListener implements ActionListener {

	// zeby moic przekazac listener jako ActionListener ta klasa musi
	// implementowac interfejs Action Listener
	// zeby ta klasa dzialala musimy zaimplementowac wszystkie metody z interfejsu
	
	int numer = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		numer++;
		System.out.println("Klikneto przycisk " + numer + " razy");

	}

}
