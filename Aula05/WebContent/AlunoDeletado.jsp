<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="toAluno.AlunosTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aluno Deletado</title>
</head>
<body>
<%
AlunosTO to = (AlunosTO)request.getAttribute("aluno_to");
%>
<h2>Aluno excluido!</h2>
</body>
</html>