package tablice;

import java.util.Arrays;

public class PrzykladZTablicy {
    
    static long fib1(int n) {
        // To ma _wykładniczą_ złożoność obliczeniową - to jest BARDZO ŹLE
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fib1(n-2) + fib1(n-1);
        }
    }

    static long[] cache;
    
    static long fib2(int n) {
        // tworze czystą tablicę z już wyliczonymi wynikami
        cache = new long[n+1];
        // wpisuję do tablicy same wartości -1
        // -1 będzie oznaczać, że jeszcze nie policzyłem fib dla danej liczby
        Arrays.fill(cache, -1);
        return fib2r(n);
    }

    static long fib2r(int n) {
        // wersja z keszowaniem wyników - "programowanie dynamiczne"
        if(cache[n] != -1) {
            // mam już to policzone - zwracam wynik
            return cache[n];
        }
        
        // a jeśli tego wyniku nie było liczonego do tej pory, to liczę teraz i zapamiętuję w cache
        long wynik;
        
        if(n == 0) {
            wynik = 0;
        } else if(n == 1) {
            wynik = 1;
        } else {
            wynik = fib2r(n-2) + fib2r(n-1);
        }
        // zapamiętuję co udało mi się teraz policzyć
        cache[n] = wynik;
        return wynik;
    }
    
    static long fib3(int n) {
        // wersja z tablicą - działa szybko, ale zajmuje pamięć rzędu n
        // o jeden element za dużo, aby łatwiej było napisać resztę...
        long[] t = new long[n+2];
        
        t[0] = 0;
        t[1] = 1;
        for(int i = 2; i <= n; i++) {
            t[i] = t[i-2] + t[i-1];
        }
        return t[n];
    }
    
    static long fib4(int n) {
        // pamiętamy dwie poprzednie liczby - dzięki temu nie zużywamy dodatowej pamięci na tablicę
        
        long poprzednia = 1;
        long wynik = 0;
        
        for(int i = 1; i <= n; i++) {
            long nowa = poprzednia + wynik;
            poprzednia = wynik;
            wynik = nowa;
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(fib1(0));
        System.out.println(fib1(7));
        System.out.println(fib1(30));
        // System.out.println(fib1(90)); - za dlugo trwalo
        System.out.println();
        
        System.out.println(fib2(0));
        System.out.println(fib2(7));
        System.out.println(fib2(30));
        System.out.println(fib2(90));
        System.out.println();
        
        System.out.println(fib3(0));
        System.out.println(fib3(7));
        System.out.println(fib3(30));
        System.out.println(fib3(90));
        System.out.println();
        
        System.out.println(fib4(0));
        System.out.println(fib4(7));
        System.out.println(fib4(30));
        System.out.println(fib4(90));
        
    }

}



