<%--% trzy kolejne linijki to deklaracja ze bedziemy uzywac Javy i importy klas Javy --%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tytuł strony</title>
</head>
<body>
	<h1>Stronka JSP</h1>
	<p>jakis content</p>
	<%--% mozna w tym dokumencie pisac w javie a polecanie Javy zapisuje sie w % % --%>
	<%
		LocalTime teraz = LocalTime.now();
		//to bedzie sie wypisywac w konsoli (tak samo jak w Javie)
		System.out.println("To wypisał JSP o godzinie " + teraz);
		int sekunda = teraz.getSecond();
	%>
	<%--% Dwa sposoby wypisywania tresci --%>
	<p>Pierwszy sposob</p>
	<%
		out.println("<p>Sekunda: " + sekunda + "</p>");
	%>
	<p>Drugi sposob</p>
	<p>
		Sekunda:
		<%=sekunda%></p>
	<p>
		Dzisiejsza data:
		<%=LocalDate.now()%></p>
	<%--% Lepszy styl programowania w jsp --%>
	<%--% Mozna pisac wyrazenia umieszczajac je w klamrach ${} --%>
	<%--% Mozna tez sie odwolywac do klas java bean (w przykładzie jest taka klasa)  --%>
	<h2>Expression Language</h2>
	<p>${2+3}</p>
	<%--% zeby moc uzyc beana trzeba go zadeklarowac--%>
	<%--%  id moze byc byle jakie a w class trzeba podac adres klasy (cały) --%>

	<jsp:useBean id="info" class="Serwlety.InfoBean" />

	<%--% tu nie piszemy ze chcemy skorzystac z metody get ale i tak musi byc getter. info.tekst korzysta z getTekst --%>

	<p>Godzina z beana: ${info.currentTime}</p>
	<p>Tekst z beana: ${info.tekst}</p>


</body>
</html>