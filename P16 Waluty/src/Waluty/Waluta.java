package Waluty;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Waluta {
	// dzieki uzyciu modyfikatorow final tworzymy klase immutable (niezmienialna)
	// czyli zgodną z wzorcem projektowym 'value object'
	private final String nazwa;
	private final String kod;
	private final BigDecimal kurs;

	public Waluta(String nazwa, String kod, BigDecimal kurs) {

		this.nazwa = nazwa;
		this.kod = kod;
		this.kurs = kurs;
	}
	
	public Waluta(String nazwa, String kod, String kurs) {

		this.nazwa = nazwa;
		this.kod = kod;
		this.kurs = new BigDecimal(kurs);
	}

	public String getNazwa() {
		return nazwa;
	}

	public String getKod() {
		return kod;
	}

	public BigDecimal getKurs() {
		return kurs;
	}

	@Override
	public String toString() {
		return "Waluta " + kod + ", kurs=" + kurs;
	}

	public BigDecimal walutaNaZloteZaokragalnie(BigDecimal kwotaWaluta) {
		return kwotaWaluta.multiply(kurs).setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal zloteNaWalute(BigDecimal kwotaZlote) {
        return kwotaZlote.divide(kurs, 2, RoundingMode.HALF_UP);
    }


}
