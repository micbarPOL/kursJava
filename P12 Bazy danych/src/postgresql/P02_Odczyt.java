package postgresql;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P02_Odczyt {

	public static void main(String[] args) {
		// wzorzec JDBC
		// klasa DriverManager zna sterowniki do wszystkich typow baz danych. Sama
		// znajdzie wlasciwy
		// dopiero w urlu (ktory jest parametrem metody getConnector) sie podaje jaka to
		// baza danych
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");

			System.out.println("Nawiązano połączenmie :D " + connection);

			// tu tylko definiujemy zapytanie
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM employees");
			// tu zapytanie jest wykonywane
			ResultSet rs = stmt.executeQuery();

			// rs.przesuwa sie rekord po rekordzie i sprawdza czy jest kolejny (jesli jest
			// to daje true a jesli nie to falese)
			while (rs.next()) {
				// imie jest w drugiej kolumnie (numeracja jest 1,2,3,4,5,6,7,8,... nie od 0!
				String imie = rs.getString(2);
				String nazwisko = rs.getString(3);
				
				//mozna tez uzywac nazwy kolumny (troche wolniej dziala)		
				BigDecimal pensja = rs.getBigDecimal("salary");
				
				//zwracanie dat
				//uzywamy klasy Date z biblioteki java.sql!!! a nie z java.util
				Date dataZatrudnienia = rs.getDate("hire_date");
				
				int id = rs.getInt("employee_id");
				//%-s, %s itd to format wypisywania 
				System.out.printf("%-20s %-20s (%3d) - zatr. %s, pensja %8s\n",
                        imie, nazwisko, id, dataZatrudnienia, pensja);

			}
			//Result sety trzeba zamykac!!
			rs.close();
			//Połączenia trzeba zamykac!!
			connection.close();
			
			System.out.println("POŁACZENIE ZAMKNIETE ! ! !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
