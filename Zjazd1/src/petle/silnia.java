package petle;

import java.math.BigInteger;
import java.util.Scanner;

public class silnia {

	public static void main(String[] args) {
		BigInteger wynik = new BigInteger("1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe...");
		int n = sc.nextInt();
		System.out.println("Liczę silnię dla " + n);
		for (int i = 1; i < n + 1; i++) {
			wynik = wynik.multiply(BigInteger.valueOf(i));
		}
		System.out.println(n + "! = " + wynik);
		sc.close();
	}

}
