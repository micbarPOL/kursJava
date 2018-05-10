package postgresql;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P03_Odczyt2_LepszeZamykaniePolaczenia {

	public static void main(String[] args) {
		
		String statement = "SELECT * FROM employees";
		
		// W try mozna umiescic otwieranie połączen wtedy automatycznie sie zamkna jesli
		// dojdziemy do konca try
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");				
				PreparedStatement stmt = connection.prepareStatement(statement)) {
		
			ResultSet rs = stmt.executeQuery();		
			
			while (rs.next()) {
				
				String imie = rs.getString(2);
				String nazwisko = rs.getString(3);
				BigDecimal pensja = rs.getBigDecimal("salary");

				System.out.println(imie + " " + nazwisko + " zarabia " + pensja);
			}

			System.out.println("POŁACZENIE ZAMKNIETE ! ! !");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
