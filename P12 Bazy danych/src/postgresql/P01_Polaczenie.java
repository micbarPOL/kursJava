package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P01_Polaczenie {

	public static void main(String[] args) {
		// wzorzec JDBC
		// klasa DriverManager zna sterowniki do wszystkich typow baz danych. Sama
		// znajdzie wlasciwy
		// dopiero w urlu (ktory jest parametrem metody getConnector) sie podaje jaka to baza danych
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");
			
			System.out.println("Nawiązano połączenmie :D " + connection);
			System.out.println("Klasa: " + connection.getClass().getName());
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
