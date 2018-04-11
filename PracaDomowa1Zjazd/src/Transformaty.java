public class Transformaty {
    public static double StopyNaMetry(double stopy) {
        return stopy * 0.3048;
    }

    public static double maks(double pierwsza, double druga) {
        if (pierwsza == druga){
            System.out.println("Obie liczby są równe! Zwracam pierwszą!");
            return pierwsza;
        }
        boolean wieksza = pierwsza < druga;
        if (wieksza) {
            return druga;
        } else {
            return pierwsza;
        }
    }
    public static double srednia (double pierwsza, double druga){
        return (pierwsza+druga)/2;
    }
    public static double poleKola (double promien){
        return 2*Math.PI*promien;
    }
    public static double bmi (double wzrost, double waga){
        return waga/(wzrost*wzrost);
    }
    public static double poleTrojkata (double a, double b, double c){

        double polowaObwodu = (a+b+c)/2;
        return Math.sqrt(polowaObwodu*(polowaObwodu-a)*(polowaObwodu-b)*(polowaObwodu-c));
    }
    public static double przekatnaProstokata (double a, double b){
    return Math.sqrt((a*a)+(b*b));
    }

}
