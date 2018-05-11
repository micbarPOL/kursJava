package Waluty;

import java.math.BigDecimal;

public class Proba1 {

	public static void main(String[] args) {
		Waluta usd = new Waluta("Dolar Amerykanski", "USD", new BigDecimal("3.5701"));
		System.out.println(usd);
		BigDecimal kwota = new BigDecimal("4"); 
		System.out.println(usd.walutaNaZloteZaokragalnie(kwota));

	}

}
