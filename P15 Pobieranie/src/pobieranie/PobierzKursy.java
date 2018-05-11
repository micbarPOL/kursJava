package pobieranie;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class PobierzKursy {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/A/");
			byte[] bufor = new byte[10000];
			InputStream input = url.openStream();
			
			int ile;
			while((ile = input.read(bufor)) >= 0) {
				System.out.write(bufor,0,ile);
			}
			input.close();
			System.out.flush();
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
