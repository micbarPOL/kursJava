package liczby;

public class JakDzialaOverflow {

	public static void main(String[] args) {
		int x = 2147483646;
		System.out.println(x);
		x++;
		System.out.println(x);
		x++;
		System.out.println(x);
		x++;
		System.out.println(x);
	}

}
