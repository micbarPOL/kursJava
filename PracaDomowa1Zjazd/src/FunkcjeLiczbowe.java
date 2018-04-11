public class FunkcjeLiczbowe {
    public static void main(String[] args) {
        double a = 3.12;
        double b = 9.21;
        double c = 7.12;
        double waga = 75.2;
        double wzrost = 1.78;
        System.out.println(a + " stóp to " + Transformaty.StopyNaMetry(a) + " metrów.");
        System.out.println("Wieksza z liczb " + a + "; " + b + " to " + Transformaty.maks(a, b));
        System.out.println("Srednia z dwoch podanych liczb to " + Transformaty.srednia(a, b));
        System.out.println("Pole koła z promieniem " + a + " to " + Transformaty.poleKola(a));
        System.out.println("BMI czlowieka o masie " + waga + " i wzroscie " + wzrost + " to " + Transformaty.bmi(wzrost,waga));
        System.out.println("Pole trojkata o bokach " + a + "," + b + "," + c + " to " + Transformaty.poleTrojkata(a,b,c));
        System.out.println("Przekatna prostokąta o bokach " + a + "," + b + " to " + Transformaty.przekatnaProstokata(a,b));
    }
}
