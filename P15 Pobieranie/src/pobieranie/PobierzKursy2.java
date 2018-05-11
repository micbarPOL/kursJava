package pobieranie;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PobierzKursy2 {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/A/");

			// klasa files z Javy7 pozwala zrobic to lepiej

			Files.copy(url.openStream(), Paths.get("waluty.json"), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Gotowe");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
