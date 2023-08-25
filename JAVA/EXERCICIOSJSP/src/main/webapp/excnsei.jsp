<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<title>JSP Básico</title>

</head>

<body>

<h1>Um exemplo básico</h1>

<%

for (int i=1; i<7; i++) {

out.println("<h" + i + ">Heading " + i + "</h" + i + ">");

}

%>

</body>

</html>