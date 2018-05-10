package Serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Kalkulator")
public class Kalkulator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//tu bedziemy odczytywac to co wpiszemy w inputa o nazwie x
    	String x = request.getParameter("x");
    	String y = request.getParameter("y");
    	
    	response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        
        //tu zaczynamy pisac htmla w javie
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        //do htmla dopisujemy linijke odpowiedzialna za korzystanie z cssa
        out.println("<link rel='stylesheet' type='text/css' href='styl.css'>");
        out.println("<title>Kalkulator</title>");
        out.println("</head><body>");
        out.println("<h1>Kalkulator</h1>");

        out.print("<p>Wpisz dwie liczby</p>");
        out.println("<form>");
        //<br> znaczy koniec linii 
        out.println("<input type='text' name='x'>");
        //&nbsp; to odstep
        out.println("&nbsp;+&nbsp;");
        out.println("<input type='text' name='y'><br>");
        out.println("<button>Oblicz</button>");
        out.println("</form>");
        
        
        if(x == null || y == null) {
        	out.println("<p>Podaj obie liczby!</p>");
        } else {
        	String z = Integer.toString((Integer.parseInt(x) + Integer.parseInt(y)));
        	out.println("<p>Suma to: " + z + "</p>");
        }
        out.println("</body></html>");
        out.close();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
