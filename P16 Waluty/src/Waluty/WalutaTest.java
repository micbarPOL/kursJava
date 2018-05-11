package Waluty;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class WalutaTest {

	@Test
	void testToString() {
		Waluta usd = new Waluta("Dolar Amerykanski", "USD", new BigDecimal("3.5701"));
		String napis = usd.toString();
		assertEquals("Waluta USD, kurs=3.5701", napis);
	}

	
	@Test
    void testWalutaNaZloteZaokragalnie() {
        Waluta waluta = new Waluta("GPB", "funt", new BigDecimal("4.9999"));
        BigDecimal kwota = new BigDecimal("1.00");
        
        BigDecimal wynik = waluta.walutaNaZloteZaokragalnie(kwota);
        
        BigDecimal oczekiwanyWynik = new BigDecimal("5.00");
        assertEquals(oczekiwanyWynik, wynik);
    }


}
