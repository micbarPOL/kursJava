package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class P05_DanePracownika {

	public static void main(String[] args) {

		int szukaneStanowisko = Integer.parseInt(JOptionPane.showInputDialog("Podaj id pracownika"));

		// to jest złe rozwiązanie bo jesli wpisze zły format szukanegoStanowiska (np z
		// apostrofem) to sie wysypie

		// UWAGA taki zapis powoduje tez niebezpieczenstwo sql injection. Jesli
		// uzytkownik wpisalby:
		// a'; DROP job_history; SELECT 'ala
		// to uzytkownik moglby usunac tabele job_history ! ! !
		// String statement = "SELECT * FROM employees WHERE job_id = '" +
		// szukaneStanowisko + "'";

		// Wiec lepiej jest robic tak:
		String statement = "select * from employees e\r\n" + 
				"JOIN departments d ON d.department_id = e.department_id\r\n" + 
				"JOIN locations l ON l.location_id = d.location_id WHERE employee_id = ?";

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");
				PreparedStatement stmt = connection.prepareStatement(statement)) {

			// pomiedzy otwarciem polaczenia a wykonaniem query trzeba nadac parametrowi
			// wartosc
			stmt.setInt(1, szukaneStanowisko);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				String imie = rs.getString("first_name");
				String nazwisko = rs.getString("last_name");
				String department = rs.getString("department_name");
				String street = rs.getString("street_address");
				String city = rs.getString("city");
				// %-s, %s itd to format wypisywania
				System.out.printf("%-10s %-10s %10s %s, %8s \n", imie, nazwisko, department,
						street, city);
			} else {
				System.out.println("Nie znaleziono takiego pracownika !");
			}

			System.out.println("POŁACZENIE ZAMKNIETE ! ! !");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
