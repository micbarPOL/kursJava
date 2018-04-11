package napisy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DodawanieNapisow3 {
    
    static String kolejneLiczby(int n) {
        String napis = "";
        
        for(int i = 1; i <= n; i++) {
            napis += i + " ";
        }
        
        return napis;
    }

    static String kolejneLiczbyConcat(int n) {
        String napis = "";
        
        for(int i = 1; i <= n; i++) {
            napis = napis.concat(i + " ");
        }
        
        return napis;
    }
    
    static String kolejneLiczbySB(int n) {
        StringBuilder napis = new StringBuilder();
        
        for(int i = 1; i <= n; i++) {
            napis.append(i).append(' ');
        }
        
        return napis.toString();
    }
    
    static String kolejneLiczbyCollector(int n) {
        return IntStream.rangeClosed(1, n)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        // sprawdzanie czasu wykonania        
        int[] dane1 = {12500, 25000, 50000};
        int[] dane2 = {12500, 25000, 50000, 100_000, 1000_000, 10_000_000};
        int[] dane3 = {12500, 25000, 50000, 100_000, 1000_000, 10_000_000, 100_000_000};

        System.out.println("Wersja String +=");
        System.out.println(kolejneLiczby(10));
        for(int n : dane1) {
            System.out.println("n = " + n + "...");
            long start = System.currentTimeMillis();
            String wynik = kolejneLiczby(n);
            long koniec = System.currentTimeMillis();
            System.out.println("    Dla n = " + n + " trwało " + (koniec - start) + "ms");
            System.out.println("    Napis ma długość " + wynik.length());
        }
        System.out.println();
        
        System.out.println("Wersja String concate");
        System.out.println(kolejneLiczbyConcat(10));
        for(int n : dane1) {
            System.out.println("n = " + n + "...");
            long start = System.currentTimeMillis();
            String wynik = kolejneLiczbyConcat(n);
            long koniec = System.currentTimeMillis();
            System.out.println("    Dla n = " + n + " trwało " + (koniec - start) + "ms");
            System.out.println("    Napis ma długość " + wynik.length());
        }
        System.out.println();
        
        System.out.println("Wersja StringBuilder");
        System.out.println(kolejneLiczbySB(10));
        for(int n : dane2) {
            System.out.println("n = " + n + "...");
            long start = System.currentTimeMillis();
            String wynik = kolejneLiczbySB(n);
            long koniec = System.currentTimeMillis();
            System.out.println("    Dla n = " + n + " trwało " + (koniec - start) + "ms");
            System.out.println("    Napis ma długość " + wynik.length());
        }
        System.out.println();
        
        System.out.println("Wersja Stream / collector");
        System.out.println(kolejneLiczbyCollector(10));
        for(int n : dane2) {
            System.out.println("n = " + n + "...");
            long start = System.currentTimeMillis();
            String wynik = kolejneLiczbyCollector(n);
            long koniec = System.currentTimeMillis();
            System.out.println("    Dla n = " + n + " trwało " + (koniec - start) + "ms");
            System.out.println("    Napis ma długość " + wynik.length());
        }
        System.out.println();
    }

}
