package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;

//teraz tez bedzie wyjatek, ale to co przed wyjatkiem sie zapisze do pliku
public class Zapis3 {

	public static void main(String[] args) {

		//inicjuje tutaj zeby zmiennej out mozna bylo uzyc poza try
		PrintWriter out = null;
		try {
			out = new PrintWriter("C:/Users/kurs/Desktop/plik1.txt");

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
		} finally {
			//jesli out nie byloby zainicjowane to close by sie wywalil. Dlatego trzeba dorobic ifa
			if(out != null) {
			//jesli out bylaby zainicjonowana w try to bylby blad bo jestesmy poza klamerkami
			out.close();
			}
		}

	}

}
