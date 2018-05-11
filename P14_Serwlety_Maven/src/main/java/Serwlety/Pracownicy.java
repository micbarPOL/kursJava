package Serwlety;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pracownicy")
public class Pracownicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//tu ładujemy klasę z jara ktory jest sterownikiem bazy danych
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><head>");
		out.println("<link rel='stylesheet' type='text/css' href='styl.css'>");
		out.println("<title>Lista pracowników</title>");
		out.println("</head><body>");
		out.println("<h1>Pracownicy</h1>");

		String statement = "SELECT * FROM employees";

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hr", "hr", "abc123");
				PreparedStatement stmt = connection.prepareStatement(statement)) {

			ResultSet rs = stmt.executeQuery();

			out.println("<table>");
			out.println("<tr><th>Imię</th><th>Nazwisko</th><th>Pensja</th></tr>");
			while (rs.next()) {

				String imie = rs.getString(2);
				String nazwisko = rs.getString(3);
				BigDecimal pensja = rs.getBigDecimal("salary");

				out.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>\n", imie, nazwisko,pensja);

			}
			out.println("<table>");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		out.println("</body></html>");
		out.close();

	}

}
