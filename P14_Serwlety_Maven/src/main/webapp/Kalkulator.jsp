<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="styl.css">
<title>Kalkulator JSP</title>
</head>
<body>
<h1>Kalkulator JSP</h1>

<p>Podaj dwie liczby</p>
<form method='post'>
    x: <input type='text' name='x'><br>
    y: <input type='text' name='y'><br>
    <button>Oblicz</button>
</form>

<div>
Parametry: ${param.x} + ${param.y}<br>
Suma: ${param.x + param.y}
</div>

</body>
</html>

