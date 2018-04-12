package klasy;

import java.time.LocalDate;

public class Nadpisywanie {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska", LocalDate.of(1983, 4, 5));
		System.out.println(osoba);
		System.out.println();
		System.out.println(osoba.kimJestes());

		Student student = new Student("Jan", "Kowalski", LocalDate.of(1991, 2, 3), 2, "budownictwo");
		System.out.println(student);
		System.out.println(student.kimJestes());

		Osoba ktos;

		ktos = osoba;
		// to sie nie kompiluje bo Osoba nie ma kierunku
		// System.out.println(ktos.getKierunek());
		System.out.println(ktos);
		System.out.println(ktos.kimJestes());

		// bedzie widac ze ktos to student i jakiego kierunku
		//NA ZMIENNA TYPU NADKLASA MOZNA WPISAC OBIEKT TYPU PODKLASA
		ktos = student;
		System.out.println(ktos);
		// to sie nie kompiluje. Ktos jest typu Osoba wiec tylko te metody i zmienne mozna uzywac
		//metody kimJestes i toString beda dzialac tak jak w klasie student. Mozna ich uzyc bo sa zdefiniowane tez w klasie Osoba.
		//ale ich implementacje beda wywolywane z klasy Student
		// System.out.println(ktos.getKierunek());
		System.out.println(ktos.kimJestes());
	}

}
