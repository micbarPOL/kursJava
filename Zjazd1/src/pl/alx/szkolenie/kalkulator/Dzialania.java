
package pl.alx.szkolenie.kalkulator;

public class Dzialania {
	public static double Dzialania(double lewy, double prawy, String dzialanie) {

		switch (dzialanie) {
		case "+":
			return lewy + prawy;
		case "-":
			return lewy - prawy;
		case "*":
			return lewy * prawy;
		case "/":
			return lewy / prawy;
		default:
			return 0;
		}

	}
}