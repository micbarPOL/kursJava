package Serwlety;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Info")   // mogłby być też wpis w web.xml
public class Info extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teraz = LocalTime.now().toString();

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.addCookie(new Cookie("czas", teraz));

        PrintWriter out = resp.getWriter();
        out.println("Halo halo");

        out.println("ContextPath: " + req.getContextPath());
        out.println("RequestURI: " + req.getRequestURI());
        out.println("QueryString: " + req.getQueryString());

        out.println();
        out.println("LocalName: " + req.getLocalName());
        out.println("LocalAddr: " + req.getLocalAddr());
        out.println("LocalPort: " + req.getLocalPort());
        out.println();
        out.println("RemoteHost: " + req.getRemoteHost());
        out.println("RemoteAddr: " + req.getRemoteAddr());
        // itd.

        out.println();
        out.println("parametr x: " + req.getParameter("x"));
        out.println("parametr y: " + req.getParameter("y"));
        
        String[] wartosciX = req.getParameterValues("x");
        out.println("x jako tablica: " + Arrays.toString(wartosciX));
        
        out.println("Wszystkie parametry:");
        for (Map.Entry e : req.getParameterMap().entrySet()) {
            String[] v = (String[]) e.getValue();
            out.println(" * " + e.getKey() + " : " + Arrays.toString(v));
        }
        out.println();

        out.println("nagłówek Accept: " + req.getHeader("Accept"));
        out.println("nagłówek User-Agent: " + req.getHeader("User-Agent"));
        out.println("Wszystkie nagłówki:");
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String nm = headerNames.nextElement();
            out.println(nm + ": " + req.getHeader(nm));
        }
        out.println();

        out.println("Wszystkie ciastka:");
        String poprzedniCzas = null;
        Cookie[] cookies = req.getCookies();
        if (cookies != null)
            for (Cookie cooky : cookies) {
                out.println("cookie " + cooky.getName() + " " + cooky.getValue());
                if ("czas".equals(cooky.getName())) {
                    poprzedniCzas = cooky.getValue();
                }
            }
        out.println("czas teraz    : " + teraz);
        out.println("czas poprzedni: " + poprzedniCzas);
    }
}



