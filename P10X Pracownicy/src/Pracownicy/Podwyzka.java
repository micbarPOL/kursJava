package Pracownicy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Podwyzka {

	public static void main(String[] args) {
		String wejscie = "pracownicy.csv";
		String wyjscie = "pracownicyPoPodwyzce.csv";
		BigDecimal nowaPensja = new BigDecimal(0);
		Double podwyzka = 0.13;

		List<Pracownik> listaPracownikow = ObslugaCSV.odczytajZPliku(wejscie);

		for (Pracownik pracownik : listaPracownikow) {
//pensje dodaje do podwyzki ktora obliczam mnozac stara pensje przez zmienna podwyzke. Na koncu zaokraglam
			nowaPensja = pracownik.getPensja().add(pracownik.getPensja().multiply(BigDecimal.valueOf(podwyzka)))
					.setScale(2, RoundingMode.HALF_UP);

			pracownik.setPensja(nowaPensja);
		}

		ObslugaCSV.ZapiszDoPliku(wyjscie, listaPracownikow);
		System.out.println("GOTOWE!!!");
	}

}
