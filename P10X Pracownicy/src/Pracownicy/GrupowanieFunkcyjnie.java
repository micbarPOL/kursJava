package Pracownicy;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GrupowanieFunkcyjnie {

    public static void main(String[] args) {
        List<Pracownik> pracownicy = ObslugaCSV.odczytajZPliku("pracownicy.csv");
        
        Map<String, Double> srednie = pracownicy.stream()
            .collect(Collectors.groupingBy(Pracownik::getStanowisko,
                    Collectors.averagingDouble(p -> p.getPensja().doubleValue())));
        
        for (Entry<String, Double> entry : srednie.entrySet()) {
            System.out.printf("%-32s : %9.2f\n", entry.getKey(), entry.getValue());
        }
        
        
    }

}




