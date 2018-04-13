package slowa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.List;

public class PosortujWszystkieLinie {

	public static void main(String[] args) {

			int numerLini = 0;
		try {
			List<String> linie = Files.readAllLines(Paths.get("pan-tadeusz.txt"));
			linie.sort(Collator.getInstance());
			
			for (String linia : linie) {
				numerLini++;
				System.out.printf("%5d : %s\n", numerLini, linia);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
