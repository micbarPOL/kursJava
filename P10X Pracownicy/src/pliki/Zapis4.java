package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;

public class Zapis4 {

	// lepsze podejscie do obsluzenia wyjatkow
	// TryWithResources nowa konstrukcja Javy
	// wtedy nie trzeba jawnie wywolywac close(). Dzila jak finally w Zapis3.
	// Zostanie wykonane automatycznie gdy bedzuiemy opuszczac ten blok niezaleznie
	// od powodu opuszczenia (nawet przy wyjątku)
	public static void main(String[] args) {

		String sciezka = "C:/Users/kurs/Desktop/plik1.txt";

		// w try mozna podac deklaracje jakiegos zasobu
		// pozwala na automatyczne zamykanie
		try (PrintWriter out = new PrintWriter(sciezka)) {

			// samo println nic nie da. Pojawi sie plik bo go tworzymy z obiektem ale nic
			// sie nie zapisze bo plik nie jest zamkniety
			// trzeba dodac np out.close()
			out.println("XXX");
			out.println(ZonedDateTime.now());

			// probuje zrobic cos bezsensownego
			out.println(ZonedDateTime.now().getHour() / 0);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
