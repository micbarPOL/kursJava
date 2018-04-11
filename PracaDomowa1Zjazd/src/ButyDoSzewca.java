import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class ButyDoSzewca {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int kiedyOdda;
        try {
            System.out.println("W jaki dzień tygodnia oddałeś buty do szewca? (podaj numer dnia tygodnia)");
            n = sc.nextInt();

            System.out.println("Ile dni miała trwać naprawa?");
            i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Zły format numeru!");
        }
        kiedyOdda = n + i;
        System.out.println("Dostaniesz buty w dzien tygodnia: " + obliczDzienWKtorymSzewcSkonczy(kiedyOdda));

    }

    public static String obliczDzienWKtorymSzewcSkonczy(int numerDnia) {

        int nowyNumerDnia = numerDnia;
        if (numerDnia > 7) {
            int dzielnik = numerDnia / 7;
            nowyNumerDnia = numerDnia - 7 * dzielnik;
        }

        switch (nowyNumerDnia) {
            case 1:
                return "poniedziałek";
            case 2:
                return "wtorek";
            case 3:
                return "środa";
            case 4:
                return "czwartek";
            case 5:
                return "piątek";
            case 6:
                return "sobota";
            default:
                return "niedziela";
        }
    }
}
