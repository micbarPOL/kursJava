package pobieranie;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PobierzKursy3 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/A?format=xml");
            
            // Klasa Files z Javy 7 pozwala zrobić to łatwiej
            
            Files.copy(url.openStream(), Paths.get("waluty.xml"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Gotowe");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
