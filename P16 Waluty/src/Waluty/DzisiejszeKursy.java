package Waluty;

public class DzisiejszeKursy {

	public static void main(String[] args) {
		Tabela tabela = ObslugaNBP.pobierzArchiwalneKursy("2015-02-04");
		System.out.println(tabela);

		System.out.println(tabela.getWszystkieWaluty());

	}

}
