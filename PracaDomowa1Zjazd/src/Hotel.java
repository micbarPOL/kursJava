import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dlugoscRezerwacji = 0;
        int wiek = 0;
        try {
            System.out.println("Na ile dni chcesz zarezerwować pokój?");
            dlugoscRezerwacji = sc.nextInt();

            System.out.println("Ile masz lat?");
            wiek = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Zły format numeru!");
        }
        System.out.println("Koszt rezerwacji to "+ObliczKoszt(wiek,dlugoscRezerwacji)+"PLN");
    }

    static double ObliczKoszt(int wiek, int dlugoscRezerwacji) {
        double kosztRezerwacji;
        if (wiek < 18) {
            kosztRezerwacji = dlugoscRezerwacji * 100;
        } else if (dlugoscRezerwacji == 1) {
            kosztRezerwacji = 200;
        } else if (dlugoscRezerwacji < 5 && dlugoscRezerwacji >= 2) {
            kosztRezerwacji = dlugoscRezerwacji * 180;
        } else {
            kosztRezerwacji = dlugoscRezerwacji * 150;
        }

        if (wiek > 65){
            kosztRezerwacji = kosztRezerwacji * 0.9;
        }
        return kosztRezerwacji;
    }


}
