package postgresql;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class P04_Parametry {

	public static void main(String[] args) {

		String szukaneStanowisko = JOptionPane.showInputDialog("Podaj stanowisko");

		// to jest złe rozwiązanie bo jesli wpisze zły format szukanegoStanowiska (np z
		// apostrofem) to sie wysypie

		// UWAGA taki zapis powoduje tez niebezpieczenstwo sql injection. Jesli
		// uzytkownik wpisalby:
		// a'; DROP job_history; SELECT 'ala
		// to uzytkownik moglby usunac tabele job_history ! ! !
		// String statement = "SELECT * FROM employees WHERE job_id = '" +
		// szukaneStanowisko + "'";

		// Wiec lepiej jest robic tak:
		String statement = "SELECT * FROM employees WHERE job_id = ?";

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");
				PreparedStatement stmt = connection.prepareStatement(statement)) {

			// pomiedzy otwarciem polaczenia a wykonaniem query trzeba nadac parametrowi
			// wartosc
			stmt.setString(1, szukaneStanowisko);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				String imie = rs.getString(2);
				String nazwisko = rs.getString(3);
				BigDecimal pensja = rs.getBigDecimal("salary");
				Date dataZatrudnienia = rs.getDate("hire_date");
				int id = rs.getInt("employee_id");
				String job = rs.getString("job_id");
				// %-s, %s itd to format wypisywania
				System.out.printf("%-20s %-20s (%3d) - zatr. %s, pensja %8s, %s\n", imie, nazwisko, id,
						dataZatrudnienia, pensja, job);
			}

			System.out.println("POŁACZENIE ZAMKNIETE ! ! !");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
