package pobieranie;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PobieranieZdjecia {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://ocdn.eu/pulscms-transforms/1/EEtktkqTURBXy9hYTBiMGY0NTkxNWE5ODcxNWRjN2ZkM2I5NzMyOGM0OS5qcGVnkpUDAMyozRL2zQqqkwXNAxTNAbw");
            
            // Klasa Files z Javy 7 pozwala zrobić to łatwiej
            
            Files.copy(url.openStream(), Paths.get("Obrazek.jpg"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Gotowe");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}