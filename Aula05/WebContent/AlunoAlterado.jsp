<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="toAluno.AlunosTO"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aluno Alterado</title>
</head>
<body>
<%
AlunosTO to = (AlunosTO)request.getAttribute("aluno_to");
%>
<h2>Alteração de dados - Aluno</h2>
ID: <%=to.getId() %><br> 
Nome: <%=to.getNome() %><br> 
RG: <%=to.getRg() %><br> 
CPF: <%=to.getCpf() %><br> 
Endereço: <%=to.getEnd() %><br> 
Email: <%=to.getEmail() %><br> 
Telefone: <%=to.getTel() %><br> 
</body>
</html>