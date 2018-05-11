package Serwlety;

import java.time.LocalTime;

public class InfoBean {
	// przykład klasy JavaBean
	// do obiektow takiej klasy mozna odwolywac sie z poziomu JSP a w zasadzie z
	// poziomu Expression Language

	// Klasa ta musi posiadac konstruktor bezargumentowy
	// klasa musi posiadac gettery i settery ktore maja dostep do propertiesow

	private String tekst = "Poczatkowy tekst";

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	// mozna tez stworzc gettera ktory tak naparwde nie jest samym odczytem
	// zmiennej. Ma w sobie kod
	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}

}
