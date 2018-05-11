package Serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//tu jest adres danego serwletu w obrebie projektu
//wiec zeby wejsc na te strone nalezy wpisac:
// http://adresSerwera:port/projekt/serwlet
// http://localhost:8080/Serwlety/Kalkulator
@WebServlet({"/Kalkulator", "/kalkulator.html"})
// jesli chce na wiecej niz jednym adresie nasluchiwac to wpisuje kilka adresow w klamerkach {}
// mozna tez napisac /Kalkulator/* wtedy serwlet bedzie obslugiwal wszystkie zapytania ze stron z katalogu /Kalkulator
// stosuje sie to jesli chcemy zeby po wejsciu uzytkownika na strone juz serwlet decydowal co sie dzieje

public class Kalkulator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//tu bedziemy odczytywac to co wpiszemy w inputa o nazwie x
    	String parametrX = request.getParameter("x");
    	String parametrY = request.getParameter("y");
    	
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
        // Jesli bysmy chcieli wyslac obrazek lub jakies inne dane binarne to uzylibysmy OutputStream response.getOutputStream
        out.println("<input type='text' name='y'><br>");
        out.println("<button>Oblicz</button>");
        out.println("</form>");
        
        
        if(parametrX == null || parametrY == null) {
        	out.println("<p>Podaj obie liczby!</p>");
        } else {
        	 try {
                 double x = Double.parseDouble(parametrX);
                 double y = Double.parseDouble(parametrY);
                 double suma = x + y;
                 
                 out.println("<p>Suma wynosi <strong>" + suma + "</strong></p>");
             } catch (NumberFormatException e) {
            	 //class='error' jest po to zeby potem w csssie mozna bylo ustalic jeden styl do errorow
                 out.println("<p class='error'>Niepoprawny format liczby.</p>");
             }

        }
        out.println("</body></html>");
        out.close();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
