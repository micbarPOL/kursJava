package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;

public class Zapis2 {

	// wtej wersji z powodu bledu dzielenia przez zero out.close() sie nie wykona
	// wiec plik bedzie pusty mimo, ze polecenia przed bledem sie wykonaly
	public static void main(String[] args) {

		try {
			PrintWriter out = new PrintWriter("C:/Users/kurs/Desktop/plik1.txt");

			// samo println nic nie da. Pojawi sie plik bo go tworzymy z obiektem ale nic
			// sie nie zapisze bo plik nie jest zamkniety
			// trzeba dodac np out.close()
			out.println("XXX");
			out.println(ZonedDateTime.now());

			// probuje zrobic cos bezsensownego
			out.println(ZonedDateTime.now().getHour() / 0);

			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
