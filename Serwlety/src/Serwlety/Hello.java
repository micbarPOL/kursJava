package Serwlety;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Serwlet dostał zapytanie i odpowiedzial");
		
		//zeby sie na stronie pojawil jakikolwiek text musimy uzyc obiektu response
		 response.setContentType("text/plain");
	        response.setCharacterEncoding("utf-8");
	        // serwer do klienta wyśle nagłówek Content-Type: text/plain;charset=utf-8
	        
	        PrintWriter out = response.getWriter();
	        
	        out.println("Halo tu serwlet");
	        out.println("Teraz jest godzina " + LocalTime.now());
	        out.println("Żółte gąski");
	        out.println("<p>niby <b>HTML</b></p>");

	}

}
