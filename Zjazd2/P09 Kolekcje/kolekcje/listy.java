package kolekcje;

import java.util.ArrayList;
import java.util.List;

public class listy {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Zuzior");
		lista.add("Maciek");
		lista.add("Ola");
		lista.add("Ula");
		
		//podmienianie wartosci
		lista.set(2, "Michał");
		//dodawanie na konkretny index. Elementy z tej pozycji i dalszych sa przesuwane w prawo
		lista.add(3, "Rezidencia");
		//usuwanie
		lista.remove(4);
		//usuwa pierwsze wystapienie wartosci
		lista.remove("Rezidencia");
		
		System.out.println(lista.size());
		System.out.println(lista);
		
		for (String wyraz : lista) {
			System.out.println("* " + wyraz);
		}
	}
}
