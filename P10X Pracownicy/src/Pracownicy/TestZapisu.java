package Pracownicy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestZapisu {

    public static void main(String[] args) {
        List<Pracownik> pracownicy = new ArrayList<>();        
        pracownicy.add(new Pracownik(11, "Ala", "Kowalska", "sekretarka", LocalDate.now(), new BigDecimal(5000), "123-123-123", "biuro", "Kowalska", "Warszawa"));
        pracownicy.add(new Pracownik(12, "Jan", "Kowalski", "kierowca", LocalDate.of(2018, 4, 3), new BigDecimal(5000), "321-321-321", "garaż", "Kowalska", "Warszawa"));
        
        ObslugaCSV.ZapiszDoPliku("test.csv", pracownicy);
    }

}

