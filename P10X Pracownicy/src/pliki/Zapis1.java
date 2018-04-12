package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis1 {

	public static void main(String[] args) {

		try {
			PrintWriter out = new PrintWriter("C:/Users/kurs/Desktop/plik1.txt");
			
			//samo println nic nie da. Pojawi sie plik bo go tworzymy z obiektem ale nic sie nie zapisze
			out.println("XXX");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
