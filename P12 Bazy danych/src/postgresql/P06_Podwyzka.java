package postgresql;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class P06_Podwyzka {
	// pracownikom z podanego stanowiska zmieni pensję dodaj dodając do niej 250
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szukaneStanowisko = JOptionPane.showInputDialog("Podaj stanowisko");

		int podwyzka = 250;

		String statement = "UPDATE employees SET salary = salary + ? WHERE job_id = ?";
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");
				PreparedStatement stmt = connection.prepareStatement(statement)) {

			// pomiedzy otwarciem polaczenia a wykonaniem query trzeba nadac parametrowi
			// wartosc
			stmt.setInt(1, podwyzka);
			stmt.setString(2, szukaneStanowisko);

			int ile = stmt.executeUpdate();
			if (ile == 0) {
				System.out.println("Nie znaleziono zadnych pracownikow z danego stanowiska");
			} else {
				System.out.println("Zmodyfikowano " + ile + " rekordów.");
			}
			System.out.println("POŁACZENIE ZAMKNIETE ! ! !");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
