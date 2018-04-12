package klasy;

import java.time.LocalDate;

public class PrzykładStudent {

	public static void main(String[] args) {
		Student student = new Student();
		Student ala = new Student("Ala","Kowalska",LocalDate.of(1985, 6, 30),3,"Inzynieria Materialowa");
		
		//podlklasa dziedziczy z nadklasy wszystkie zmienne i metody (nieprywatne metody), ale nie są dziedziczone konstruktory
//		System.out.println(student);
		System.out.println(ala);
		System.out.println(student.getImie());
	}

}
